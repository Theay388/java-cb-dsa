package lec3;

import java.util.Scanner;

public class pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=n/2+1;
        while(row<=n) {
        	 //star
            int j=1;
            while(j<=star) {
            	System.out.print("* ");
            	j++;
        
	}
          //space 
        	int i=1;
        	while(i<=space) {
        	System.out.print("   ");
        	i++;

	}
        	//star
        	int k=1;
        	while(k<=star) {
        		System.out.println("* ");
        		k++;
        		
        	}
        	if(row<=n/2) {
        		star--;
        		space-=2;
        		
        	} else {
        		star++;
        		space-=2;
        		
        	}
        	row++;
        	System.out.println();

        
	}

}
}
