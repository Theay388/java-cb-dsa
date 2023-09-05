package assigment_3;

import java.util.Scanner;



public class sort_just_zeros_and_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count0 = 0;
		int count1  =0;
		int var = 0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int arr1[] = new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count0++;
			}
			else {
				count1++;
			}
		}
		for(int i=0;i<count0;i++) {
			arr1[i]=0;
		}
		for(int i=count0;i<n;i++) {
			arr1[i]=1;
		}
		
		for(int i =0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
