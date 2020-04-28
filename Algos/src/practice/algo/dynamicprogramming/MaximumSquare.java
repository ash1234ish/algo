package practice.algo.dynamicprogramming;

import java.util.NoSuchElementException;

public class MaximumSquare {

	public static void main(String[] args) {
		int arr [][] = {{1 ,0, 1, 0, 0},{1 ,0 ,1, 1, 1},{1,1,1,1,1},{1 ,0, 0, 1, 0}};
		System.out.println(maximalSquare(arr));
	}

	public static int maximalSquare(int[][] M) {
		int dp [][] = new int[M.length][M.length];
		int max = 0;
		for (int i = 0; i < M.length; i++)
		{
			for (int j = 0; j < M[0].length; j++)
			{
				dp[i][j] = M[i][j];
				if (i > 0 && j > 0 && M[i][j] == 1)
				{
					dp[i][j] = minimum(dp[i][j - 1], dp[i - 1][j], 
							dp[i - 1][j - 1]) + 1;
				}
				if (max < dp[i][j]) {
					max = dp[i][j];
				}
			}
		}
		return max;
	}

	public static int minimum (int x, int y, int z) {
		return Integer.min(Integer.min(x, y), z);
	}
}
