package com.leetcode.practicetest175;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TweetCounts {

	Map<String,List<Integer>> map= null;
	
    public TweetCounts() {
		this.map = new HashMap<String, List<Integer>>();
    }
    
    public void recordTweet(String tweetName, int time) {
    	map.computeIfAbsent(tweetName, k -> new ArrayList<>()).add(time);
    }
    
    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
    	List<Integer> times = map.get(tweetName);
        List<Integer> ans = new ArrayList<>();
        
        if (times == null) return ans;

        int interval = 60;
        if (freq.equals("hour")) {
            interval = 60*60;
        } else if (freq.equals("day")) {
            interval = 60 * 60 * 24;
        }
        
        for (int i = startTime; i <= endTime; i += interval) {
            ans.add(0);
        }

        for (int t : times) {
            if (t >= startTime && t <= endTime) {
                int index = (t - startTime) / interval;
                ans.set(index, ans.get(index) + 1);
            }
        }
        return ans;
    }
}

