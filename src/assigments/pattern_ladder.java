package assigments;

import java.util.Scanner;

public class pattern_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int num=1;
        
        while (row<=n) {
        	int i=1;
        	while( i<=row ) { 
        		System.out.print(num+" ");
        		i++;
        		num++;
        	}
        	System.out.println();
        	row++;
        	
        	star++;
        	
      
        
	}
	}
}


