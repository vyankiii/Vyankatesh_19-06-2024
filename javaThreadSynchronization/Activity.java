package com.javaThreadSynchronization;

public class Activity {

	public synchronized void productTable(int num) {
		int value = 1;

		while (value <= 10) {

			System.out.println(Thread.currentThread() + " = " + value * num);
			value = value + 1;

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
