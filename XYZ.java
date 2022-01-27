package aniruddha_code;

public class XYZ {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) { 
		this.name = name;
	}
}
class abc {
	public static void main(String args[]){
		XYZ d = new XYZ();
		d.setId(1);
		System.out.println(d.getId());
		d.setName("Aniruddha");
		System.out.println(d.getName()); 
	}
}	
	

