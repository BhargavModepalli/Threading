package com.bhargav.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
	public static void main(String[] args) {
		RansomNumber rs= new RansomNumber();
		   ExecutorService executor = Executors.newFixedThreadPool(3);//creating a pool of 3 threads  
	        for (int i = 1; i < 4; i++) {  
	            MyThread worker = new MyThread(rs);  
	            executor.execute(worker);//calling execute method of ExecutorService  
	          }  
	        System.out.println("All threads submitted");
	        executor.shutdown();  
	        while (!executor.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");  
	        
	        ExecutorService executorRead = Executors.newFixedThreadPool(5);
	        for(int i=1;i<6;i++)
	        {
	        	ReadThread reader= new ReadThread(rs);
	        	executorRead.execute(reader);
	        }
	        executorRead.shutdown();
	        while(!executorRead.isTerminated()){}
	        System.out.println("all read threads completed");
	        
	    }  
	}
	


