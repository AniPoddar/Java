package aniruddha_code;

import java.util.Arrays;

public class Exam1 {

	public static void main(String[] args){
			int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
			Arrays.sort(array);   
			System.out.println("Elements of array sorted in ascending order: ");  
			for (int i = 0; i < array.length; i++)   
			{       
			System.out.println(array[i]);
			System.out.println();
			}
			
			String [] array1= {"Mango","Apple","Grapes","Papaya","Pineapple","Bannana","Orange"};   
			   
			Arrays.sort(array1);  
			System.out.println("\nArray elements in ascending order: " +Arrays.toString(array1));




	}}
