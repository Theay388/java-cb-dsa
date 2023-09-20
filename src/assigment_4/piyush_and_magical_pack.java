package assigment_4;

import java.util.Scanner;

public class piyush_and_magical_pack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int n, s, k, m;
        n = scanner.nextInt();
        s = scanner.nextInt();
        k = scanner.nextInt();
        m = scanner.nextInt();
        char[][] a = new char[100][100];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s; j++) {
                a[i][j] = scanner.next().charAt(0);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s; j++) {
                if (m < k) {
                    System.out.println("No");
                    return;
                }
                if (a[i][j] == '.') {
                    m = m - 2;
                } else if (a[i][j] == '*') {
                    m = m + 5;
                } else if (a[i][j] == '#') {
                    break;
                }
                if (j == s - 1) {
                    m = m + 1;
                }
                m = m - 1;
            }
        }
        if (m >= k) {
            System.out.println("Yes");
            System.out.println(m);
        } else {
            System.out.println("No");
        }
	}

}
