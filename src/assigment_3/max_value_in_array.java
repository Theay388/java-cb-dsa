package assigment_3;

import java.util.Scanner;

public class max_value_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) 
		{
			arr[i] = sc.nextInt();
		}
		MaxValue(arr);

	}
	public static void MaxValue(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) 
		{
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
