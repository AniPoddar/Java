package aniruddha_code;
import java.util.*;
public class StackCollection {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); //Sub class of vector call, LIFO(structure)is ued 
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}

	}

}
