package assigment_3;

import java.util.Scanner;

public class array_linar_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int arr[] = new int [l];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		boolean c = false;
		Check(arr, n , c);
	}
	
	public static void Check(int arr[], int n , boolean c) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println(i);
				c=true;
			}
			
		}
		if(c==false) {
			System.out.println("-1");
		}
	}

}
