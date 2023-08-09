package LEC_8;

import java.util.Scanner;

public class ARMSTRONG_NUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Armstrong(n));
        
	}
	public static boolean  Armstrong(int n) {
		int c= count_of_digit(n);
		int sum =0;
		int p =n;
		while(n>0) {
			int rem = n%10;
			sum=(int) (sum+Math.pow(rem, c));
			n=n/10;
		}
		return sum==p;
		//if(sum==n) {
		//	return true;
			
		}
	
	
	public static int count_of_digit(int n) {
		int count =0;
		while(n>0) {
			count++;
			n /=10; //n=n/10;
		}
		return count;
		
		
	}

}
