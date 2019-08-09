package practice.algo.datastructure;

public class StringDuplicateCharacterReplacement {

	public static void main(String[] args) {
		charReplacement("ashish");
	}

	public static void charReplacement(String strng) {

		char [] str = strng.toCharArray();
		
		for(int  i =0 ; i < str.length ; i ++) {
			for(int j= i+1; j <str.length; j++) {
				if(str[i] == str [j]) {
					str[j] = 0;
				}
				
			}
		}
		
		for(int i = 0 ; i < str.length ; i++) {
			System.out.print(str[i]);
		}
	}


}
