package coreJava;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String e = "gtx"; 
		ArrayList<String> a = new ArrayList<String>();
		a.add(e);
		a.add("qweqweqwe");
		a.add(2, "null");
//	System.out.println(a);
		System.out.println(a.contains("null"));
		System.out.println(a.indexOf("qweqweqwe"));
a.removeAll(a);

		System.out.println(a.isEmpty());
		System.out.println(a.size());
	//can use a.remove
	
	}

}
