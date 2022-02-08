package aniruddha_code;
import java.util.*;

public class Vectors {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  //used to store  dynamic data/elements
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ayush");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}

	}

}
