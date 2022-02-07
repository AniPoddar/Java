package aniruddha_code;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDescend {

	public static void main(String[] args) {
		int n;  
		Scanner s = new Scanner(System.in);  
		System.out.print("Enter the number of elements: ");  
		n = s.nextInt();  
		Integer a[] = new Integer[n];  
		System.out.println("Enter the elements of the array: "); 
		
		for (int i = 0; i < n; i++)   
		{  
		a[i] = s.nextInt();
		}
		Arrays.sort(a, Collections.reverseOrder());   
	 
			System.out.println("Array elements in descending order: " +Arrays.toString(a));

		}

	}


