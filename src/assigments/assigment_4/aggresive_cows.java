package assigment_4;

import java.util.Arrays;
import java.util.Scanner;

public class aggresive_cows {

	public static 
	 boolean checkif(int[] a, int space, int n, int c) {
        int count = 1;
        int last = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] - last >= space) {
                last = a[i];
                count++;
                if (count == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void spacecalc(int[] a, int n, int c) {
        int start = 0;
        int space = 0;
        int ans = 0;
        int end = a[n - 1] - a[0];
        while (start <= end) {
            space = (start + end) / 2;
            if (checkif(a, space, n, c)) {
                ans = space;
                start = space + 1;
            } else {
                end = space - 1;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        spacecalc(a, n, c);
	}

}
