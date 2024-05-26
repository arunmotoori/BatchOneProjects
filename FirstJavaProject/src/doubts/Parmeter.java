package doubts;

public class Parmeter {

	public static void main(String[] args) {

		calc(2, 5);

	}

	public static void calc(int a, int b) {

		int s1 = a + b;
		System.out.println(s1);

		int result1 = (--a) + (b); // a= 1 , b=5 ,

		System.out.println(result1); // 6

		int r2 = (++a) + (b); // now here a value will be a=1 but after ++a it will be a=2 , so 2+5=7
		System.out.println(r2); // 7

	}

}