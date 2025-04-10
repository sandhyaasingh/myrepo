package com.tnsif.thread;

public class RunnableDemo {

	public static void main(String[] args) {
		UsingRunnable obj = new UsingRunnable(10, 20, "Hello");
		
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable with Anonymous Class");
						}
			
		};

	}

}
