package coreJava;

public class childClassDemo extends parentClassDemo {



	public void audiosystem() {
			System.out.println("new audiosys code");
	}
	public void engine() {

		System.out.println("engine code");
	}

	public void color() {
		System.out.println(color);
	}
	
	public void racenumber() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassDemo child = new childClassDemo();
		child.color();
		child.engine();
		child.racenumber();
		child.gear();
		child.brakes();
		child.audiosystem();
		
	}
	
	

}
