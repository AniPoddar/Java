package aniruddha_code;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAccessend {

	public static void main(String[] args) {
		int n;  
		Scanner s = new Scanner(System.in);  
		System.out.print("Enter the number of elements: ");  
		n = s.nextInt();  
		int a[] = new int[n];  
		System.out.println("Enter the elements of the array: "); 
		
		for (int i = 0; i < n; i++)   
		{  
		a[i] = s.nextInt();
		}
		Arrays.sort(a);   
		System.out.println("Elements of array sorted in ascending order: ");
	 
		for (int i = 0; i < a.length; i++)   
		{       
		System.out.println(a[i]); 

	}

}
}

