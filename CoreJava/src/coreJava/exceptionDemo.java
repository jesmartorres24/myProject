package coreJava;

public class exceptionDemo {

	public void errorMessage() {
		System.out.println("There is an error");
	}

	public void errorMessage1() {
		System.out.println("11There is an error");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 7;
		int c = 0;
		exceptionDemo ed = new exceptionDemo();

		try {
			int arr[] = new int[5];
			{
				System.out.println(arr[6]);
			}
		}

	/*	catch (ArithmeticException a) {
			ed.errorMessage1();
		} catch (IndexOutOfBoundsException aqw) {
			System.out.println("error index");
		} catch (Exception e) {
			ed.errorMessage();
		} */

		finally {
			System.out.println("finally is executed");
		}

	}

}
