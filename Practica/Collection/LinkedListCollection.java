package aniruddha_code;
import java.util.*;

public class LinkedListCollection {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>(); //it implements the collection interface 
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi"); //it can also store duplicate data/elements like arraylist 
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  //hasNext is a method used in collection
		System.out.println(itr.next());  
		}  
		}  
		}

	


