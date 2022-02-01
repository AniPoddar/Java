package aniruddha_code;

public class mutable {
	private String a;

	public mutable(String a) {
		this.a=a;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public static void main(String[] args) {
		mutable d=new mutable("Aniruddha");
		System.out.println(d.getA());
		d.setA("Poddar");
		System.out.println(d.getA());
		

	}

}
