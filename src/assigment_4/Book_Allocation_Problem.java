package assigment_4;


import java.util.Scanner;
public class Book_Allocation_Problem {

	public static 
	boolean prove(int[] a, int n, int m, int mid) {
        int count = 1;
        int page = 0;
        for (int i = 0; i < n; i++) {
            if (page + a[i] > mid) {
                count++;
                page = a[i];
                if (count > m) {
                    return false;
                }
            } else {
                page += a[i];
            }
        }
        return true;
    }

    public static int checkif(int[] a, int n, int m) {
        int sum = 0;
        int start = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            start = Math.max(a[i], start);
        }
        int end = sum;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (prove(a, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(ans);
        return 0;
    }

    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n, m;
            n = scanner.nextInt();
            m = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            checkif(a, n, m);
        }

	}

}
