package com.javaThreads;

public class TestDemo {

	public static void main(String[] args) {
		// main program/application/process

		Demo demo = new Demo();
		Thread thread = new Thread(demo);
		thread.start();

		Demo demo1 = new Demo();
		Thread thread1 = new Thread(demo1);
		thread1.start();

		Demo demo2 = new Demo();
		Thread thread2 = new Thread(demo2);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.start();

	}

}
