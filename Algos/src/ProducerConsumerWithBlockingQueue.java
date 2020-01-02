import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerWithBlockingQueue {
	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

		final Runnable producer = () -> {
			int i =0;
			while(true) {
				try {
					queue.put(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
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
		
		
	//	Thread.sleep(1000);

	}

}
