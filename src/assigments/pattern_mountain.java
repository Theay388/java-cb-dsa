package assigments;

import java.util.Scanner;

public class pattern_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int row=1;
        int star=1;
        int space= n+1;
        while (row<=n) {
        	int i=1;
        	while( i<=star ) { 
        		System.out.print(i+" ");
        		i++;
        	}
        	//space 
        	int j=1;
        	while(j<=space) {
        		System.out.print("  ");
        	      		j++;
        	}
             //star
        		int k=1;
        		if(row==n) {
        			k=2;
        		}
        		int a=star;
        		if(row==n) {
        			a--;
        		}
        		while(k<=star) {
        			System.out.print(a+" ");
        			a--;
        			k++;
        		
        		
        	}
        	System.out.println();
        	row++;
        	star++;
        	space-=2;
        	
        	}
      
        
	}
	}


