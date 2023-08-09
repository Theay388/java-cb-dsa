package assigments;

import java.util.Scanner;

public class hollo_diamond_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int star=n/2+1;
	        int row=1;
	        int space=-1;
	        while(row<=n) {
	        	int i=1;
	        	while(i<=star) {
	        		System.out.print("* ");
	        		i++;
	        		
	        	}
	            i=1;
	        	while(i<=space) {
	        		System.out.print("  ");
	        		i++;
	        		
	        	}
	             i=1;
	        	if(row==1||row==n) {
	        		i=2;
	        		
	        	}
	        	while(i<=star) {
	        		System.out.print("* ");
	        		i++;
	        		
	        	}
	        	
	        	
	        	System.out.println();
	        	if(row<=n/2) {
	        		star--;
	        		space+=2;
	        		
	        	}else {
	        		star++;
	        		space-=2;
	        	}
	        	row++;
	        
	        }
	}

}
