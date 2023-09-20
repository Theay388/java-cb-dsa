package assigment_4;

import java.util.*;

public class Column_with_maximum_sum_in_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int arr[][] = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		Sum(arr,n,m);

	}

	public static void Sum(int[][] arr, int n, int m) {
		// TODO Auto-generated method stub
		int sum[] = new int[m];
		for(int i=0;i<m;i++) 
		{
			int summ=0;
			for(int j=0;j<n;j++) {
				summ=summ+arr[j][i];
			}
			sum[i] = summ;
		}
		int max = 0;
		int index =0 ;
		for(int i=0;i<m;i++) {
			if(sum[i]>max) {
				max=sum[i];
				index = i;
			}
		}
		System.out.println(index+1+" "+max);
	}

}
