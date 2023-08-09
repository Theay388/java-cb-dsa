package assigments;

import java.util.Scanner;

public class r__4pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int row=1;
        int star=1;
        while (row<=2*n-1) {
        	int i=1;
        	while( i<=star ) { 
        		if(row%2==0)  {
        		System.out.print(" ");
        	
        	}
        		else { 
        			System.out.print("*");
        		}
        		i++;
        	}
        	
        	
        	System.out.println();
        	row++;
        	if(row%2!=0) {
        	star++;
        	
        	}
        	}
      
	}

}
