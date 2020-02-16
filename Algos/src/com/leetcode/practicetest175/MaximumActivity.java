package com.leetcode.practicetest175;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumActivity {

	public static void main(String[] args) {

		int [][] arr= {{1,5},{1,5},{1,5},{2,3},{2,3}};
		maxEvents(arr);
	}

	public static int maxEvents(int[][] events) {

		int n = events.length;
		Arrays.sort(events, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		int p = 0;
		int ans = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int d = 1;d <= 100000;d++){
			while(p < n && events[p][0] == d){
				pq.add(events[p][1]);
				p++;
			}
			while(!pq.isEmpty()){
				int r = pq.poll();
				if(r < d)continue;
				ans++;
				break;
			}
		}
		return ans;
	}
	
    public boolean isPossible(int[] target) {
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	for(int v : target){
    		pq.add(-v);
    	}
    	long sum = 0;
    	for(int v : target){
    		sum += v;
    	}
    	while(true){
    		int cur = -pq.poll();
    		if(cur == 1)break;
    		if(cur-(sum-cur) > 0 && cur-(sum-cur) < cur){
    			int an = (int)(cur-(sum-cur));
    			sum -= cur - an;
    			cur = an;
    			pq.add(-cur);
    		}else{
    			return false;
    		}
    	}
    	return true;
    }
}


