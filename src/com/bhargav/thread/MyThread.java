package com.bhargav.thread;

public class MyThread extends Thread {
	
	RansomNumber rs;
	public MyThread(RansomNumber rs) {
		this.rs= rs;
	}
	
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("pool-1-thread-3"))
		{
			System.out.println(Thread.currentThread().getName());
			rs.mul(2);
			
		}
		else if (Thread.currentThread().getName().equals("pool-1-thread-1")) {
			System.out.println(Thread.currentThread().getName());
			rs.mul(7);
		}
		else if(Thread.currentThread().getName().equals("pool-1-thread-2")) {
			System.out.println(Thread.currentThread().getName());
			rs.mul(3);
		}
		else{System.out.println("execption is in :	"+Thread.currentThread().getName());}
	}
	
	
}
