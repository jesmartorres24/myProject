package coreJava;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=1;
		for (int i = 1; i <= 4; i++) {
			// System.out.println(i + " loop");
			for (int j = 1; j <= i; j++) {
				System.out.print(k*3 +"\t");
				k++;
			}
			System.out.println();
		}
	}
}
