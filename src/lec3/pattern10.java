package lec3;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //System.out.println(n);
        int row =1;
        int space=0;
        int star=2*n-1;
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
        		System.out.print("* ");
        		j++;
        		
        	}
        	//next row prep 
        	row++;
        	System.out.println();
        	space++;
        	star-=2;//star=star-2;
	}

	}
}
