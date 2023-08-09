package assigments;

import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int row=1;
        int star=1;
       
        
        while (row<=n) {
        	int i=1;
        	while( i<=star ) { 
        		System.out.print(a+"\t");
        		int k = a+b;
        		a=b;
        		b=k;
        		i++;
        		
        	}
        	System.out.println();
        	row++;
        	
        	star++;
        	
      
        
	}
	}

}
