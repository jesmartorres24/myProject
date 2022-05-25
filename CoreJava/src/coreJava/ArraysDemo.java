package coreJava;

public class ArraysDemo extends accessModifiers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accessModifiers am = new accessModifiers();
		am.bcd();
		
		int a[] = new int[3];
		a[0] = 1;
		a[1] = 0;
		a[2] = 4;
		
		int b[] = {2,4,6,8,0};
		for(int i = 0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
