package assigments;

import java.util.Scanner;

public class hollow_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int star=n;
        while(row<=n) {
        int i=1;
        while(i<=space) {
        	System.out.print(" ");
        	i++;
        	
        }
        int j=1;
        while(j<=star) {
        	if(j==1||j==n||row==1||row==n) {
        		System.out.print("*");
        	}else {
        		System.out.print(" ");
        	}
        	j++;
        }
        System.out.println();
        row++;
        space--;
        
        
        
	}

}
}
