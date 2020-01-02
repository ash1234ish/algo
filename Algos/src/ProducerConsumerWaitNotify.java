
public class ProducerConsumerWaitNotify {
	public static void main(String[] args) throws InterruptedException {

		MyBlockingQueue<Integer> queue = new MyBlockingQueue<Integer>(10);

		final Runnable producer = () -> {
			int i =0;
			while(true) {
				queue.put(i);
				i++;
			}
		};
		
		new Thread(producer).start();
		
		final Runnable consumer = () -> {
			while(true) {
				try {
					System.out.println(queue.take());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(consumer).start();
	}

}
