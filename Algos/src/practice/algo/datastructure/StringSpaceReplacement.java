package practice.algo.datastructure;

public class StringSpaceReplacement {
	
	public static void main(String[] args) {
		
		System.out.println(replaceString("as hi sh"));
	}
	
	public static String replaceString(String input) {
		char []inputArr = input.toCharArray();
		int no= 0;
		for(int i =0 ; i< inputArr.length ; i++) {
			if(inputArr[i] == ' ') {
				no ++ ;
			}
		}
		
		int newLength = inputArr.length +(3*no);
		char [] newArr = new char[newLength];
		int index = 0;
		for(int j =0 ; j < inputArr.length ; j++) {
			if(inputArr[j] == ' ') {
				newArr[index] = '%';
				newArr[index+1] = '2';
				newArr[index+2] = '0';
				index = index +3;
			}else{
				newArr[index] = inputArr[j];
				index ++ ;
			}
		}
		return new String(newArr);
	}
}
