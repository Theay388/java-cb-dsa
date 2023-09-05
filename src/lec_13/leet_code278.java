package lec_13;

import java.util.Scanner;

public class leet_code278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner tom = new Scanner(System.in);
				System.out.print("Enter no. of versions : ");
				int number_of_versions = tom.nextInt();
				Search(number_of_versions);
			}
			public static void Search(int n)
			{
				int start = 1;
				int end = n;
				int ans = 0;
				while(start<=end) {
					int mid = (start+end)/2;
					if(isBadVersion(mid)==true) {
						ans = mid;
						end = mid-1; // Because we want to
					}
					else {
						start = mid+1;
					}
				}
			}
			private static boolean isBadVersion(int mid) {
				// TODO Auto-generated method stub
				return false;
			}

		
	}


