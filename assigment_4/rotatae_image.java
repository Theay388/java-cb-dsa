package assigment_4;

import java.util.Scanner;

public class rotatae_image {

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
		Rotate(arr);

	}

	public static void Rotate(int[][] arr) {
		// TODO Auto-generated method stub
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc= arr[0].length-1;
		while(maxc>=0) {
		for(int i=minr;i<=maxr;i++) {
			System.out.print(arr[i][maxc]+" ");
		}
		System.out.println();
		maxc--;
		}
		
	}

}
