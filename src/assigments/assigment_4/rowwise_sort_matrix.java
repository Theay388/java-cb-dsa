package assigment_4;

import java.util.Scanner;
import java.util.Arrays;

public class rowwise_sort_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		Sort(arr);

	}

	public static void Sort(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int arr2[] = new int[arr[0].length];
			for(int j=0;j<arr[0].length;j++)
			{
				arr2[j] = arr[i][j];
			}
			Arrays.sort(arr2);
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr2[j]+" ");
			}
			System.out.println();
		}
	}

}
