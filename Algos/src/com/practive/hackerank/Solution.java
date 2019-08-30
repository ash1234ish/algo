package com.practive.hackerank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> returnList = new ArrayList<Integer>();
        returnList.add(0, 0);
        returnList.add(1, 0);

       // if(0 > a.size() && 0 > b.size() ){

        for(int i =0 ,j=0 ; i< a.size() && j < b.size(); i++,j++){
            if(a.get(i) > b.get(j)){
                returnList.set(0,returnList.get(0)+1);
            }
            if(a.get(i) == b.get(j)){
                //no one gets a point
            }
            if(a.get(i) < b.get(j)){
                returnList.set(1 ,returnList.get(1)+1);
            }

    //    }
            }
        return returnList ;
    }

    public static void main(String[] args) throws IOException {
   
		    	int [] countArray = {0,0,0,0,0};
		    	
		    	int [] arr = {1,4,4,4,5,3};
		
		        for(int i = 0 ; i < arr.length; i++){
		            int index = arr[i];
		            countArray[index -1]  = countArray[index - 1]+1;
		        }
		        int maxFreq = countArray[0] , freq = 0;
		        for(int i =1 ; i < countArray.length ; i ++){
		            if(maxFreq < countArray[i]){
		                maxFreq = countArray[i];
		                freq = i+1;
		            }
		        }

		    	
		    System.out.println(freq);	
    }
}

