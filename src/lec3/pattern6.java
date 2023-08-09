package lec3;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = 0;
		int star = n;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;

			}
			// space
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;

			}
			// next row prep
			System.out.println();
			row++;
			star--;
			space=space+2;
			
			
			
			
			
			
			
			
			
			
	}

	}
}
