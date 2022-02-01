package aniruddha_code;

public final class ImmutableDemo1 {
	private String name;
	ImmutableDemo1 (String name) {
	this.name = name;
	}
	public String getName() {// we can use get()method but not set() method 
		return name;
		}
	public static void main(String[] args) {
		ImmutableDemo1 obj = new ImmutableDemo1("hello");
		System.out.println(obj.getName());
		//obj.setName("new hello");//setter method set() cannot be used in immutable string
		System.out.println(obj.getName());
		}
		
	}


