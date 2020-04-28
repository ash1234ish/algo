package com.practice.arrays;

public class BuySellStock {
	public static void main(String[] args) {
		BuySellStock bs = new BuySellStock();
		
		int [] prices = {1,2,3,4,5};
		bs.maxProfit(prices);
	}
	
	 public int maxProfit(int[] prices) {
	        
	        int profit = 0;
	        
	        for(int i = 0; i < prices.length -1; i++){
	            int start = i;
	            
	            while(( i < prices.length -1) &&(prices[i] < prices[i+1])){
	                i++;    
	            }
	            
	            if(i < prices.length && start < prices.length){
	                profit = profit + prices[i] - prices[start];
	            }         
	        }      
	        return profit;
	        
	    }	

}
