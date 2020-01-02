package practice.algo.dynamicprogramming;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		permute(str,"");

	}

	private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm);

        } else {
        	System.out.println("Ashsih");
            for (int i = 0; i < 1; i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) 
                                        + word.substring(i + 1, word.length()));
            }
        }

    }
	
	private static void permute(String original,String str) {
		if(original.length() <= 0) {
			System.out.println(str);
			return ;
		}
		permute(original.substring(0, original.length() -1),str+original.charAt(original.length() -1));
		permute(original.substring(0, original.length() -1),str);
	}	
}
