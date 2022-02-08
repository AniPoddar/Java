package aniruddha_code;
import java.util.*;
public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi"); //can be used to store duplicate data 
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  //interface used to go to the next value
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}

	}

}
