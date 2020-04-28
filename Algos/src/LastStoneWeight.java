import java.util.PriorityQueue;

public class LastStoneWeight {


	public static void main(String[] args) {

		int arr[] = {2,7,4,1,8,1};

		LastStoneWeight ls = new LastStoneWeight();
		System.out.println(ls.lastStoneWeight(arr));

	}
	public int lastStoneWeight(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) ->  { return b-a;});

		for(int i =0 ; i < arr.length; i++) {
			pq.offer(arr[i]);
		}

		while(pq.size() >1) {
			
			int no1 = pq.poll();
			int no2 = pq.poll();
			
			int difference = no1- no2;
			if(difference > 0) {
				pq.offer(difference);
			}
		}
		
		
		return pq.poll();	}

}
