package assigments;

import java.util.Scanner;

public class pattern_double_side_arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int row=1;
        int star=1;
        int val2=  1 ;
        int space = n-1;
        int space1 =-1;
        while (row<=n) {
        	//star
        	int i=1;
        	while( i<=space ) { 
        		
        		System.out.print("  ");
        		i++;
        	
        	}
        	//star
        	int j=1;
        	int p=val2;
        	while(j<=star) {
        		System.out.print(p+" ");
        		p--;
        		j++;
        	}
        	int k=1;
        	while(k<=space1) {
        		System.out.print("  ");
        		k++;
        	}
        	//star
        	j=1;
        	if(row==1||row==n) {
        		j=2;
        	}
        	int val=1;
        	while(j<=star) {
        		System.out.print(val+" ");
        		val++;
        		j++;
        	}
        	System.out.println();
        	if(row<=n/2) {
        		star++;
        		space-=2;
        		space1+=2;
        		val2++;
        	}else {
        		star --;
        		space+=2;
        		space1-=2;
        		val2--;
        	}
        	row++;
        }
        	
        	
        	
        	}
      
	}


