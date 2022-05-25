package coreJava;

public class staticVar {

	String name;
	String address;
	static String city = "Quezon City";
	static int i = 0;

	staticVar(String name, String address) {

		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}

	public void getAddress() {

		System.out.println(address + " " + city);

	}

	
	public static void method(){
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticVar obj = new staticVar("name0", "payatas");
		staticVar objs = new staticVar("name1", "qweqwe");
		obj.getAddress();
		objs.getAddress();
		staticVar.method();

	}

}
