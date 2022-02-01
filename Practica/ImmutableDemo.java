package aniruddha_code;

public class ImmutableDemo {
	public static void main(String args[]){
		String a = "Aniruddha"; //Creating a String
		a.concat("Poddar");
		a=a.concat("Poddar"); //Calling a method *concat(used for appendind at the end) but still not modifiable since, the string is immutable
		System.out.println(a);
	}

}
