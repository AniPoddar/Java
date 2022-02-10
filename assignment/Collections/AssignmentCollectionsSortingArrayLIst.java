package aniruddha_code;

import java.util.*;

public class AssignmentCollectionsSortingArrayLIst {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("O"); //Adding object in arraylist  
		list.add("U");  
		list.add("C");
		list.add("H");//can be used to store duplicate data 
		Collections.sort(list);
		Iterator<String> itr=list.iterator();  //interface used to go to the next value
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		//System.out.println(list);

	}

}}
