package com.aniruddha.jdbcEg;

public class ThreadJoinEg extends Thread {

		public void run() {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(300);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println(i);
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        ThreadSleepEg t = new ThreadSleepEg();
	        ThreadSleepEg t1 = new ThreadSleepEg();
	        ThreadSleepEg t2 = new ThreadSleepEg();
	        
	        t.start();
	        try {
	        	t.join();
	        }catch(InterruptedException e) {
	        	System.out.println(e);
	        }
	        t1.start();
	        t2.start();
	        
	  
	        
		}

	}

	


 