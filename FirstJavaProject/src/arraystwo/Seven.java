package arraystwo;

public class Seven {

	public static void main(String[] args) {
		
		int[][] a = {{9,5,7},{8,6,3}};
		
		for(int r=0;r<a.length;r++) {
			
			for(int c=0;c<a[r].length;c++) {
				
				System.out.print(a[r][c]+" ");
				
			}
			
			System.out.println();
			
		}
	
	}

}
