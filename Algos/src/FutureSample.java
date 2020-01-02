import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureSample {
	public static void main(String[] args) {
		
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(1);
		Future<Integer> future = fixedThreadPool.submit(new MyTask());
		try {
			Integer number = future.get();
			System.out.println(number);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}

class MyTask implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		return new Random().nextInt();
	}
}	