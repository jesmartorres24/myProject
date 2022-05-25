package coreJava;

public class accessModifiers {

	private void abc() {
		System.out.println("abc");
	}

	protected void bcd() {
		System.out.println("bcd");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessModifiers am = new accessModifiers();
			am.abc();
			am.bcd();
	}

}
