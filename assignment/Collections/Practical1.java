package aniruddha_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Practical1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); 
		list.add("Aniruddha"); 
		list.add("Anju");  
		list.add("Koushik");
		list.add("Utkarsha");
		list.add("Shreyosi");
		Collections.sort(list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){  
		System.out.println(itr.next());

	}

}}
