package coreJava;

public class thisDemo {
	
	int a = 2;
	
	public void getData() {
		int a = 3;
		
		//System.out.println(a);
		System.out.println(this.a);
	}
	
	public void getData(int b, int c) {
		int a = 3;
		
		int d = a + this.a;
		System.out.println(b);
		System.out.println(d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		thisDemo td = new thisDemo();
		td.getData();
		td.getData(1, 1);
	}

}
