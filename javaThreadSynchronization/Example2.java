package com.javaThreadSynchronization;

public class Example2 extends Thread {

	Activity activity;

	public Example2(Activity activity) {
		this.activity = activity;
	}

	public void run() {
		activity.productTable(5);
	}

}
