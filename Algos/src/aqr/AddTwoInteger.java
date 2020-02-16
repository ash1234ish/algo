package aqr;

public class AddTwoInteger {
	
	
	public static void main(String[] args) {
		int [][]after= 
//			{{14,9,9,16,16}, 
//			 {2,12,0,5,20}, 
//			 {1,2,13,12,0}, 
//			 {20,5,0,15,10}, 
//			 {16,5,4,4,0}, 
//			 {1,16,19,2,18}};
			{{1,2},{3,4}};
		
		matrixSummation(after);
	}

	int[][] matrixSummation(int[][] after) {
		
		int [][] before = new int[after.length][after[0].length];
		for(int i = 0 ; i < after.length ; i++) {
				for(int j =0 ; j < after[0].length; j++) {
					if(i==0 && j==0) {
						before[i][j] = after[0][0];
					}else if(j ==0 && i !=0) {
						int diff = after[i][j];
						for(int k =0 ; k < i ; k++ ) {
							diff = diff - Math.abs(before[0][k]);
						}
						before[i][j] = diff;
					}else {
						int diff = after[i][j];
						
						for(int k = i; k>=0 ; k--) {
	                        
	                        int limit = 0;
	                        if( k== i){
	                            limit =  j-1;
	                        }else{
	                            limit = after[0].length -1;
	                        }
							for( int l = 0 ; l <= limit; l++) {
								diff = diff -  Math.abs(before[i][l]);
							}
						}
						before[i][j] = diff;
						
					}
				}
		}
		return before;
		}
	
	int buyCards(int[] ids, int d) {

	   return 0;
	    
	}

}
