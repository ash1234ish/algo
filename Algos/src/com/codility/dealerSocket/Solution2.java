package com.codility.dealerSocket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution2 {

	public int countComponents(int A[], int[] B, int n) {
		if (n <= 1)
			return n;
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			map.put(i, new ArrayList<>());
		}

		for(int i=0; i < A.length; i++) {
			map.get(A[i]).add(B[i]);
			map.get(B[i]).add(A[i]);
		}

		Set<Integer> visited = new HashSet<>();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (visited.add(i)) {
				dfsVisit(i, map, visited);
				count++;
			}
		}
		return count;
	}

	private void dfsVisit(int i, Map<Integer, List<Integer>> map, Set<Integer> visited) {
		for (int j : map.get(i)) {
			if (visited.add(j))
				dfsVisit(j, map, visited);
		}
	}

}
