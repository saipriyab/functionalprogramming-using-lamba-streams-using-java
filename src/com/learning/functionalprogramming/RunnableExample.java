package com.learning.functionalprogramming;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
			}
		};
		Thread t = new Thread(runnable);
		t.start();

	}

}
