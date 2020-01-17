package com.oracle.interview;

public class Solution {

	public static void main(String[] args) {
		/*
		 * version1 = "1.0", version2 = "2.0", return value = -1
		2. version1 = "1.0.1", version2 = "1.0.1" return value = 0
		3. version1 = "2.3.0", version2 = "2.3" return value = 0
		4. version1 = "10.1.1" version2 = "10.1" return value = 1
		5. version1 = "10.1.0.0.1 version2 = "10.1.0" return value = 1
		 */

		String  version1 = "10.1.0";
		String version2  =  "10.1";

		String [] arr1 = version1.split("\\.");
		String [] arr2 = version2.split("\\.");

		System.out.println(compareVersion(arr1,arr2));

	}


	public static int compareVersion(String[] arr1, String[] arr2) {


		int counter =  0;
		int returnValue = 0;

		System.out.println("array 1 length " + arr1.length);
		System.out.println("array 2 length " + arr2.length);
		while(counter < arr1.length &&  counter < arr2.length) {

			int no1 = Integer.parseInt(arr1[counter]);
			int no2 = Integer.parseInt ( arr2[counter]);

			if(no1 == no2 ) {
				returnValue = 0;
				counter ++;
			}

			else if(no1 > no2) {
				returnValue = 1;
				break;
			}
			else if (no1 < no2) {
				returnValue=  -1;
				break;
			}
		}


		if(returnValue  == 0 && (counter < arr1.length || counter < arr2.length) ) {
			if(counter < arr1.length) {
				while(counter < arr1.length) {
					if(Integer.parseInt(arr1[counter]) > 0) {
						returnValue = 1;
						break;
					}else {
						counter++;
					}


				}
			}
			if(counter < arr2.length) {
				while(counter < arr2.length) {
					if(Integer.parseInt(arr2[counter]) > 0) {
						returnValue = -1;
						break;
					}
					else {
						counter++;
					}

				}

			}
		}

		return returnValue;

	}

}
