package com.leetcode.practicetest181;

import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {
	
	Map<String, Integer> num = new HashMap<>();
	Map<String, Long> sum = new HashMap<>();
	Map<Integer, String> sta = new HashMap<>();
	Map<Integer, Integer> ts = new HashMap<>();

    public UndergroundSystem() {
        
    }
    
    public void checkIn(int id, String stationName, int t) {
        sta.put(id, stationName);
        ts.put(id, t);
    }
    
    public void checkOut(int id, String stationName, int t) {
        String code = sta.get(id) + "*" + stationName;
        int cha = t - ts.get(id);
        sta.remove(id);
        ts.remove(id);

        if(!num.containsKey(code)){
        	num.put(code, 0);
        }
        num.put(code, num.get(code) + 1);
        if(!sum.containsKey(code)){
        	sum.put(code, 0L);
        }
        sum.put(code, sum.get(code) + cha);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String code = startStation + "*" + endStation;
        double x = sum.get(code);
        return x / num.get(code);
    }
}