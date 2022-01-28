package aniruddha_code;

class Encapsulate{
	private String name;
	private int rolNo;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRolNo() {
		return rolNo;
	}

	public void setRolNo(int rolNo) {
		this.rolNo = rolNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
 class TestEncapsulate{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate d = new Encapsulate();
		d.setName("Aniruddha");
		d.setRolNo(4);
		d.setAge(23);
		System.out.println("Name is :"+" " +d.getName());
		System.out.println("Roll.No is :"+" " +d.getRolNo());
		System.out.println("Age is :"+" "+d.getAge()); 

	}

}
 
 
 
 
 
 
 
 /*In the above program, the class Encapsulate is encapsulated as the variables are declared as private.
  *  The get methods like getAge() , getName() , getRoll() are set as public, these methods are used to access these variables. 
  *  The setter methods like setName(), setAge(), setRoll() are also declared as public and are used to set the values of the variables*/
