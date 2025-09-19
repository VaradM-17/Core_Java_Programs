package com.corejava.functionalprogramming.lamdaexpression;

//class ThreadDemo implements Runnable {
//
//	@Override
//	public void run() {
//		System.out.println("Run method is called...");
//	}
//
//}

public class LambdaThreadExample {
	public static void main(String[] args) {
//		Thread newThread = new Thread(new ThreadDemo());
//		newThread.start();

//		Runnable withLambda = () -> System.out.println("Run method is called by lambda");
		Thread thread1 = new Thread(() -> System.out.println("Run method is called by lambda"));
		thread1.start();

	}
}
