package assigments;

import java.util.Scanner;

public class pattern_inverted_hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int row=1;
        int star=1;
        int val= n;
        int space = 2*n-1;              
             while (row<=2*n+1) {
      //star 
        	int i=1;
        	int p=n;
        	while( i<=star ) {         		
        		System.out.print(p+" ");
        		p--;
        		i++;
        	
        	}
        	//space
        	int j=1;      	
        	while(j<=space) {
        		System.out.print("  ");
                 j++;
        	}
        	int k=1;
        	if(row==n+1) {       		
        		k=2;
        	}
        	
        	int p2=val;
        	if(row==n+1) {
        	  p2=p2+1;
        		
        	}
        	while (k<=star) {
        		System.out.print(p2+" ");
        		p2++;
        		k++;
        	
        	}
        	System.out.println();
        	if(row<n+1) {
        		star++;
        		space-=2;
        		val--;
        		
        	}else {
        		star--;
        		space+=2;
        		val++;
        		
        	}
        	row++;
        	
        }
        	
	}

}
