package arraystwo;

public class One {

	public static void main(String[] args) {
		
		int[][] a = new int[2][3];
		
		a[0][0] = 9;
		a[0][1] = 5;
		a[0][2] = 7;
		
		a[1][0] = 6;
		a[1][1] = 8;
		a[1][2] = 3;
		
		System.out.println(a[0][0]); // 9
		System.out.println(a[0][1]); // 5
		System.out.println(a[0][2]); // 7
		System.out.println(a[1][0]); // 6
		System.out.println(a[1][1]); // 8
		System.out.println(a[1][2]); // 3
		

	}

}
