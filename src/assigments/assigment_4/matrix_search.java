package assigment_4;

import java.util.Scanner;

public class matrix_search {

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
		int num = sc.nextInt();
		System.out.println(Search(arr, num));
	}

	public static int Search(int[][] arr, int item) {
		int r = 0;
		int c = arr[0].length - 1;
		while (r < arr.length && c >= 0)
		{
			if (arr[r][c] == item) 
			{
				return 1;
			} else if (arr[r][c] > item) 
			{
				c--;
			} else 
			{
				r++;
			}

		}
		return 0;
	}

//
	

}

