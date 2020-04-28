import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ProcessQueries {
	
	public static void main(String[] args) {
		int arr[] = {3,1,2,1};
		int m = 5;
		ProcessQueries pq = new ProcessQueries();
		pq.processQueries(arr, m);
		
	}

	public int[] processQueries(int[] arr, int m) {

		List <Integer> list = new ArrayList<Integer>();
		int returnArray[] = new int[arr.length];

		for(int i = 0 ; i < m; i++){
			list.add(i,i+1);
		}


		for(int i = 0 ; i < arr.length; i++){
			int number = arr[i];
			int swapNo = serachorIndex(list,number);
			list.add(0,number);
			returnArray[i] = swapNo;

		}
		Arrays.stream(returnArray).forEach(System.out::println);
		return returnArray;
	}

	private int serachorIndex(List<Integer> list , int no){
		
		Iterator<Integer> itr = list.iterator();
		int index= 0;
		while(itr.hasNext()) {
			Integer number = (Integer)itr.next();
			if(number == no) {
				list.remove(index);
				return index;
			}
			index++;
		}
		return -1;
	}
}
