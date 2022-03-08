package com.aniruddha.jdbcEg;

public class ThreadPriorityEg extends Thread {
	
	public void run() {
		System.out.println("Thread :----MY THREAD");	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriorityEg t = new ThreadPriorityEg();
		ThreadPriorityEg t1 = new ThreadPriorityEg();
		t.start();
		
		t.setPriority(MAX_PRIORITY);
		System.out.println("priority is" + t.getPriority());
		System.out.println("priority is" + t.getName());
        t1.setPriority(MIN_PRIORITY);
		System.out.println("priority is" + t1.getPriority());
		System.out.println("priority is" + t1.getName());


	}

}
