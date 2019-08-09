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


	public static void rotateArray(int [][] matrix , int N) {

		for (int x = 0; x < N / 2; x++) 
		{ 
		    for (int y = x; y < N-x-1; y++) 
		    { 
			int temp = mat[x][y] ; 

			mat[x][y] = mat[N-1-y][x]; 

			mat[N-1-y] [x] = mat[N-1-x][N-1-y]; 

			mat[N-1-x] [N-1-y] = mat[y][N-1-x] ; 

			mat[y][N-1-x]= temp; 
		    } 
		}
	}
}


