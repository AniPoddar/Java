package com.aniruddha.jdbcEg;

public class ThreadSleepEg1 {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
				Thread.sleep(600);
				System.out.println(i);

	}

}
}