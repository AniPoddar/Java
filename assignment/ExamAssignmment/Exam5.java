package aniruddha_code;

import java.util.Arrays;
import java.util.Collections;

public class Exam5 {

	public static void main(String[] args) {
		String [] array = {"RED", "GREEN", "YELLOW", "ORANGE"};   
		// sorts array[] in descending order   
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Array elements in REVERSE order: " +Arrays.toString(array));

	}

}
