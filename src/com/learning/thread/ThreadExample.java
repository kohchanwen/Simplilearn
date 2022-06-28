package com.learning.thread;

public class ThreadExample extends Thread {

	public void run() {
		for(int i=1;i<4;i++){  
		    try{
		    		Thread.sleep(4000); 
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println("Thread Name: " + Thread.currentThread().getName()+ "  :"+ i);  
		    System.out.println("Thread State: " +Thread.currentThread().getState()+ "  :"+ i); 
		    System.out.println("Thread is Daemon: " +Thread.currentThread().isDaemon()+ "  :"+ i); 
		    System.out.println("Thread is Alive: " +Thread.currentThread().isAlive()+ "  :"+ i); 
		  }  
	}

	public static void main(String args[]){  
		
		ThreadExample t1=new ThreadExample();  
		ThreadExample t2=new ThreadExample();  
		ThreadExample t3=new ThreadExample();  
		
		t1.setName("thread1");
		t2.setName("thread2");
		t3.setName("thread3");
		
		t1.setPriority(Thread.NORM_PRIORITY);  
		t2.setPriority(Thread.MAX_PRIORITY);  
		t3.setPriority(Thread.NORM_PRIORITY); 
		
		t3.setDaemon(true);
		
		t1.start();        
		t2.start();        
		t3.start();        
	 }
}
