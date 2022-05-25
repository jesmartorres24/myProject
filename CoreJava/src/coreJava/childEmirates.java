package coreJava;

public class childEmirates extends ParentAircraft {

	public static void main(String[] args) {

		childEmirates c = new childEmirates();
		c.bodyColor();
		c.engine();
		c.safetyGuidelines();
	}

	public void bodyColor() {
		System.out.println("This is emirates color");
	}

}
