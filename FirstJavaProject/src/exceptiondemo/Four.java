package exceptiondemo;

public class Four {

	public static void main(String[] args) {

		int[] ar = new int[3];

		ar[0] = 9;
		ar[1] = 5;
		ar[2] = 7;
		try {
			ar[3] = 8; // ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);

		}

		System.out.println("End of this program");

	}

}
