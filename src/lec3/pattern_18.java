package lec3;

import java.util.Scanner;

public class pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int star=1;
        int space =n/2;
        while(row<=n) {
        	
        	
        }
        //star
        int j=1;
        while(j<=star) {
        	System.out.print("*  ");
        	j++;
        	
        } if (row<=n/2) {
        	star+=2;
        	space--;
        	
        } else {
        	star-=2;
        	space++;
        }
        row++;
        System.out.println();
        
        
        
        
        		
	}


}


