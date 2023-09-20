package assigment_4;

import java.util.Scanner;

public class spiral_print_clockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int sr = 0, sc = 0, ec = n - 1, er = m - 1;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        while (sr <= er && sc <= ec) {
            for (int col = sc; col <= ec; col++) {
                System.out.print(arr[sr][col] + ", ");
            }
            sr++;
            for (int row = sr; row <= er; row++) {
                System.out.print(arr[row][ec] + ", ");
            }
            ec--;
            if (sr <= er) {
                for (int col = ec; col >= sc; col--) {
                    System.out.print(arr[er][col] + ", ");
                }
                er--;
            }
            if (sc <= ec) {
                for (int row = er; row >= sr; row--) {
                    System.out.print(arr[row][sc] + ", ");
                }
                sc++;
            }
        }
        System.out.println("END");
	}

}
