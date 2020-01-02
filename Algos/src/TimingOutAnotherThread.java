
public class TimingOutAnotherThread {
	private volatile boolean  interrupted = false;

	public static void main(String[] args) {
		TimingOutAnotherThread timingOutAnotherThread = new TimingOutAnotherThread();
		timingOutAnotherThread.process();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timingOutAnotherThread.interrupted = true;

	}
	
	public void process() {
		new Thread(() ->{
			while(!this.interrupted) {
				System.out.println("i am running");
			}
		}	)
		.start();
	}

}