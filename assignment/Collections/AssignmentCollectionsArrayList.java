package aniruddha_code;

import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentCollectionsArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("VIOLET");
		list.add("INDIGO"); //Adding object in arraylist  
		list.add("BLUE");  
		list.add("GREEN"); //can be used to store duplicate data 
		list.add("ORANGE");  
		list.add("RED"); 
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator();  //interface used to go to the next value
		while(itr.hasNext()){  
		System.out.println(itr.next()); 

	}}}


