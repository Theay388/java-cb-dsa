package assigment_3;

import java.util.Scanner;

public class reverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		int i=0;
		int j=n-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
			i++; j--;
		}
		
		for(int k=0;k<n;k++) {
			System.out.println(arr[k]);
		}
	}

}
