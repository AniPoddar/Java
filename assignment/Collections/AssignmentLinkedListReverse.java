package aniruddha_code;

import java.util.*;

public class AssignmentLinkedListReverse {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>(); //it implements the collection interface 
		al.add("K");  
		al.add("I");  
		al.add("L"); //it can also store duplicate data/elements like arraylist 
		al.add("L"); 
		Collections.reverse(al);
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());

	}

}}
