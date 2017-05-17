package com.bhargav.thread;

public class ReadThread extends Thread {
	
	RansomNumber rs;
	
	public ReadThread(RansomNumber rs) {
		this.rs=rs;
	}

	@Override
	public void run() {
		rs.printAll();
		
	}

}
