package assigments;

import java.util.Scanner;

public class pattern_hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int row=1;
        int val= n;
        int star=2*n+1;        
        int space = 0;              
             while (row<=2*n+1) {
        	//space
        	int j=1;      	
        	while(j<=space) {
        		System.out.print("  ");
                 j++;
        	}
        	//star
        	int k=1;
        	int p=val ;
        	while(k<=star) {       		
        	System.out.print(p+" ");
        	if(k<=star/2) {
        		p--;
        	
        	}else {
        		p++;
        	}
        	k++;
        	}
        	System.out.println();
        	if(row<n+1) {
        		star-=2;
        		space++;
        		val--;
        		
        	}else {
        		star+=2;
        		space--;
        		val++;
        		
        	}
        	row++;
        	
        }
	}

}
