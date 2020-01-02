import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {
	
	private Queue<E> queue = null;
	private int maxSize = 0;
	private Lock lock = new ReentrantLock(true);
	private Condition notFull = lock.newCondition();
	private Condition notEmpty = lock.newCondition();
	
	
	public MyBlockingQueue(int size) {
		queue = new LinkedList<E>();
		this.maxSize = size;
	}
	
	public void put(E e) {
		lock.lock();
		try{
			if(this.maxSize == queue.size()) {
				notFull.await();
			}
			queue.add(e);
			notEmpty.signalAll();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	}
	
	public E take() throws InterruptedException {
		lock.lock();
		try{
			while(queue.size() == 0) {
				notEmpty.await();
			}
			E e = queue.remove();
			notFull.signalAll();
			return e;
		} 
		finally {
			lock.unlock();
		}
	}

}
