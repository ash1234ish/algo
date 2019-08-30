package practice.algo.dynamicprogramming;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("","123");

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
	
}
