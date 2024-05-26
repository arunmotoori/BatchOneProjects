package arraystwo;

public class Two {

	public static void main(String[] args) {
		
		int[][] a = new int[2][];
		
		a[0] = new int[3];
		a[1] = new int[4];
		
		a[0][0] = 9;
		a[0][1] = 5;
		a[0][2] = 7;
		
		a[1][0] = 6;
		a[1][1] = 8;
		a[1][2] = 2;
		a[1][3] = 3;

		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println(a[1][3]);
		

	}

}
