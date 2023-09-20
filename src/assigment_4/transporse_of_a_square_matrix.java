package assigment_4;

import java.util.Scanner;

public class transporse_of_a_square_matrix {

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
		Transpose(arr);

	}

	public static void Transpose(int[][] arr) {
		// TODO Auto-generated method stub
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc= arr[0].length-1;
		while(minc<=maxc) {
		for(int i=minr;i<=maxr;i++) {
			System.out.print(arr[i][minc]+" ");
		}
		System.out.println();
		minc++;
		}
	}

}
