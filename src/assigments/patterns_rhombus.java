package assigments;

import java.util.Scanner;

public class patterns_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn= new Scanner(System.in);
			int n=scn.nextInt();
			int row=1;
			int star=1;
			int space=n-1;
			int val=1;
			while(row<=2*n-1) {
				//space
				int i=1;
				while(i<=space) {
					System.out.print("  ");
					i++;
				}
				//star
				int j=1;
				int p=val;
				while(j<=star) {
					System.out.print(p + " ");
					if(j<=star/2) {
						p++;
					}
					else {
						p--;
					}
					j++;
				}
				if(row<n) {
					star+=2;
					space--;
					val++;
				}
				if(row>=n) {
					star-=2;
					space++;
					val--;
				}
				
				//next row preparation
				row++;
				System.out.println();
				
				
				
			}




	}

}
