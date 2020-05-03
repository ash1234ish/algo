package com.leetcode.contest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DestinationCity {

	public static void main(String[] args) {

	}

	public String destCity(List<List<String>> paths) {
		HashSet<String> set = new HashSet<String>();

		for(int j = 0; j< paths.size(); j++) {
			set.add(paths.get(j).get( 0));
		}

		String returnValue= "";
		for(int j = 0 ; j < paths.size(); j++) {

			if(!set.contains(paths.get(j).get(1))) {
				returnValue = paths.get(j).get(1);
				break;
			}
		}
		return returnValue;

	}

}
