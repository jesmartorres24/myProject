package coreJava;

import demoClass.CentralTraffic;

public class AusTraffic implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic a = new AusTraffic();
		a.greenGo();
		a.yellowFlash();
		a.redStop();
		
	}

	@Override
	public void greenGo() {
		System.out.println("green");
	}

	@Override
	public void yellowFlash() {
		System.out.println("yellow");
	}

	@Override
	public void redStop() {
		System.out.println("red");
	}
}
