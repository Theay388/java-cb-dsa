package assigment_3;

import java.util.Arrays;
import java.util.Scanner;

public class square_of_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Square(arr);

	}
	public static void Square(int arr[]) {
		int arr1[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			arr1[i]  = (int) Math.pow(arr[i], 2);
		}
		int arr2[] = new int[arr.length];
		Arrays.sort(arr1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
