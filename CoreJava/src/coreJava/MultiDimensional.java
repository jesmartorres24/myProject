package coreJava;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[][] = { { 1, 2, 3,4 }, { 4, 5, 6 }, { 6, 7, 8 } };
		for (int x = b.length; x >= b.length; x--) {
			for (int y = 0; y < b.length; y++) {
				System.out.print(b[y][x]);
			}
			System.out.println();
		}
	}

}
