package aniruddha_code;

public class Employee {
	private String name;
	private int age;
	private String address;
	



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee d = new Employee();
		d.setName("Aniruddha");
		d.setAge(23);
		d.setAddress("4/108,Nelinagar, P/O- Haltu, Kolkata - 700078");
		System.out.println("Name is :"+" " +d.getName());
		System.out.println("Age is :"+" " +d.getAge());
		System.out.println("Address is :"+" "+d.getAddress()); 

	}

}
