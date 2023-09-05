package assigment_3;

import java.util.Scanner;

public class rain_water_harvesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		for(int j=0;j<test_cases;j++) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Trapping(arr));
		}
	}

	public static int Trapping(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + Math.min(left[i], right[i]) - arr[i];
		}
		return sum;
	}

}
