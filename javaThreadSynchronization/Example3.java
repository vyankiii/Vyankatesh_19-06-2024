package com.javaThreadSynchronization;

public class Example3 extends Thread {

	Activity activity;

	public Example3(Activity activity) {
		this.activity = activity;
	}

	public void run() {
		activity.productTable(99);
	}

}
