package practice.algo.datastructure;

public class MatrixRotation {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int n = 3 ;	
		rotateArray(a,n);
		
		for(int  i = 0 ; i < 3 ; i++) {
			
			for (int j =0 ; j <3 ; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}	
	
	
	public static void rotateArray(int [][] matrix , int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer; 
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				
				int top = matrix[first][i]; // save top
				
				matrix[first][i] = matrix[last-offset][first];
				
				matrix[last-offset][first] = matrix[last][last - offset];
				
				matrix[last][last - offset] = matrix[i][last];
				
				matrix[i][last] = top; 
			}
			
		}
		
	}
}


