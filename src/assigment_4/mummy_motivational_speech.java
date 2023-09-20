package assigment_4;

import java.util.Scanner;



public class mummy_motivational_speech {

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
		Speach(arr,n,m);

	}

	public static void Speach(int[][] arr, int n, int m) {
		// TODO Auto-generated method stub
		int count=1;
		boolean a = true;
		for(int i=0;i<n;i++) 
		{
			count=i+1;
			for(int j=0;j<m;j++) {
				if(arr[i][j]!=0) {
					count--;
				}
				if(count<0) {
					a=false;
					break;
				}
			}
		}
		System.out.println(a);
	}

}
