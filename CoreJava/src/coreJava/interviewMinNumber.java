package coreJava;

public class interviewMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int abc[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 0, 7, 2 } };
		int min = abc[0][0];
		int minc = 0;
		for (int x = 0; x < abc.length; x++) {
			for (int y = 0; y < abc[x].length; y++) {
				if(abc[x][y]<min) {
					abc[x][y]=min;	
					minc = y;
				}
				
				}
				}
		System.out.println(min);
			}
}