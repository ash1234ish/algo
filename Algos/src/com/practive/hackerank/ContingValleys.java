package com.practive.hackerank;

public class ContingValleys {
	  // Complete the countingValleys function below.
    static int countingValleys( String s) {

    int valleyCounter = 0, altitude = 0;
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'U') {
                altitude++;
                if (altitude == 0) {
                    valleyCounter++;
                }
            } else {
                altitude--;
            }
        }
        return valleyCounter;
    }

    public static void main(String[] args) {
    	System.out.println(countingValleys("DDUUUUDD"));
	}
}
