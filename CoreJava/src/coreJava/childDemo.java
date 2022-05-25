package coreJava;

public class childDemo extends parentDemo {
	
	
	String name = "qaclickacademy";
	public void getStringdata() {
		
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public childDemo() {
		
		super();
		System.out.println("childDemo constructor");
	}
	
public void getData() {
		
		System.out.println("child class");
		super.getData();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childDemo cd = new childDemo();
		cd.getStringdata();
		cd.getData();

	}

}
