package assigment_4;

import java.util.Scanner;

public class Painter_Partition_Problem_Java {

	public static 
	boolean isvalid(long[] arr, int n, int k, long ans) {
        long currentsum = 0;
        int painter = 1;
        for (int i = 0; i < n; i++) {
            if (currentsum + arr[i] > ans) {
                painter++;
                if (painter > k)
                    return false;
                currentsum = arr[i];
            } else {
                currentsum += arr[i];
            }
        }
        return true;
    }

    public static long binarysearch(long[] arr, int n, int k) {
        long s = Integer.MIN_VALUE, e = 0, mid;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            s = Math.max(s, arr[i]);
            e = e + arr[i];
        }
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (isvalid(arr, n, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        ans = (ans % 10000003);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(binarysearch(arr, n, k));
        sc.close();
	}

}
