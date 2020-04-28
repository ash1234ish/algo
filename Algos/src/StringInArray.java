import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringInArray {

	public static void main(String[] args) {
		String [] arr = {"leetcoder","leetcode","od","hamlet","am"};
		List<String> list = new ArrayList<String>();
		Set<String> set = new HashSet<String>();

		for(int i = 0 ; i <arr.length; i++ ){
			for(int j = i+1; j < arr.length ; j++){
				String s1= arr[i];
				String s2 = arr[j];

				if(arr[i].contains(s2)){
					if(!set.contains(s2)){
						list.add(s2);
						set.add(s2);
					}
				}else if(arr[j].contains(s1)){
					if(!set.contains(s1)){
						list.add(s1);
						set.add(s1);
					}
				}
			}
		}
		list.forEach(System.out::println);
	}
}