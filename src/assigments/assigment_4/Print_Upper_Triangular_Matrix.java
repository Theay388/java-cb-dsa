package assigment_4;

import java.util.Scanner;

public class Print_Upper_Triangular_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int arr[][] = new int[n][m];
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		UppTriangle(arr);
	}

	public static void UppTriangle(int[][] arr) {
		// TODO Auto-generated method stub
		int ele = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				arr[i][j]=0;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
