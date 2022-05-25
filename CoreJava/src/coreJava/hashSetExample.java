package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("Manila");
		hs.add("Marikina");
		hs.add("Malabon");
		hs.add("Paranaque");
		hs.add("Bulacan");
		hs.add("Quezon City");
		Iterator<String> it = hs.iterator();
		int i = 1;
		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
		System.out.println(i);

	}

}
