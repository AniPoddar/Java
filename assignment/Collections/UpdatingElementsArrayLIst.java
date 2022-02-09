package aniruddha_code;

import java.util.*;

public class UpdatingElementsArrayLIst {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("K"); //Adding object in arraylist  
		list.add("I");  
		list.add("L");
		list.add("L");//can be used to store duplicate data
		list.set(0,"B"); 
		System.out.println(list);

	}

}
