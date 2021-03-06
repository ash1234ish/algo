package practice.algo.datastructure;

public class MatrixZeroReplacement {

	public static void main(String[] args) {
		int [] [] arr = {{0,1,2},{3,4,5},{6,7,8}};

		print2DArray(arr);
		
		int [] row = new int[arr.length];
		int []column = new int [arr[0].length];
		
		for(int i = 0 ; i < arr.length; i ++) {
			for(int j=0 ; j< arr[0].length ; j++) {
				if(arr[i][j] ==0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		
		
		for(int i = 0 ; i < arr.length; i ++) {
			for(int j=0 ; j< arr[0].length ; j++) {
				if(row[i] == 1 || column[j] == 1) {
					arr[i][j] =0;
				}
			}
		}
		
		System.out.println("After the modification");
		
		print2DArray(arr);
		
	}

	public static void print2DArray(int [][] arr) {
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = 0 ; j < arr[0].length ; j++) {
				if(j != 0) {
					System.out.print(",");
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
