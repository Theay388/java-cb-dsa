package lec3;

import java.util.Scanner;

public class pattern_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc =new Scanner(System.in);
		int n =Sc.nextInt();
		
		int row =1;
		int space=n-1;
		int star=1;
		while(row<= n) {
			//space
			int i= 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
				
			}
			//star
			int j=1;
			while(j<= star) {
				System.out.print("1 ");
				j++;
				
			}
			//next row prep 
			row++;
			System.out.println();
			space--;
			star+=2;//star=star+2;
			
	}

}
}
