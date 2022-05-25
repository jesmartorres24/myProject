package coreJava;

public class constructorDemo {
	
	int a = 1;
	int b = 3;

	public constructorDemo(int a, int b) {
		System.out.println("parameterized int1");
		
	}
	
	public constructorDemo(int b, String cd) {
		System.out.println(b +" "+ cd);
		System.out.println();	
	}
	
	
	public constructorDemo(String abc)
	{
		System.out.println("paramterized string");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//constructorDemo cd = new constructorDemo();
		constructorDemo cdi = new constructorDemo(0,0);
		constructorDemo cds = new constructorDemo("any string");
		constructorDemo cdm = new constructorDemo(25,"anystring");
	}
}
