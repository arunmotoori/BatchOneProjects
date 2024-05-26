package arraysthree;

public class ArraysFixedInSize {

	public static void main(String[] args) {
		
		int[] a = new int[3];
		
		a[0] = 9;
		a[1] = 5;
		a[2] = 7;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
	    a[3] = 8; // ArrayIndexOutOfBoundsException - As Arrays are fixed in size
	    
		
	}

}
