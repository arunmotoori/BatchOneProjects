package doubts;

public class StringIndexOfDemo {

	public static void main(String[] args) {
		
		String str = "My name is Arun motoori";
		
		int num = str.indexOf('n');
		
		System.out.println(num);
		
		int num2 = str.indexOf('n',num+1);
		
		System.out.println(num2);
		
		int num3 = str.lastIndexOf('n');
		System.out.println(num3);


	}

}
