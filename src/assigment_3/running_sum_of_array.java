package assigment_3;

import java.util.Scanner;

public class running_sum_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int arr1[] = new int[n];
		int sum = 0;
		
		for(int i =0;i<n;i++) {
			sum = sum+arr[i];
			System.out.print(sum+" ");
		}

	}

}
