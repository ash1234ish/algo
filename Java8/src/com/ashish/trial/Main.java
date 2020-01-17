package com.ashish.trial;

public class Main {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("Ashish")).start();
	}
}
