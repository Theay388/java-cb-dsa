package assigment_3;

import java.util.Scanner;

public class von_neuman_loves_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			String binaryString= Integer.toString(arr[i]);
			int decimal=Integer.parseInt(binaryString,2);  
			System.out.println(decimal+" ");
		}
	}

}
