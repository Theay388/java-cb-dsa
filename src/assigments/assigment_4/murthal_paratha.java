package assigment_4;
import java.util.Arrays;
import java.util.Scanner;

public class murthal_paratha {

	public static 
	int tym(int rank, int par) {
        return (par * (par + 1) / 2) * rank;
    }

    public static boolean mintym(int par, int cooks, int ranks[], int m) {
        int mintime, j = 0, tm = 0, i = 1;
        while (par > 0) {
            if (tym(ranks[j], i) <= m) {
                i++;
                par--;
            } else {
                j++;
                if (j == cooks)
                    return false;
                i = 1;
                tm = 0;
            }
        }
        return true;
    }

    public static int calc(int par, int cooks, int ranks[]) {
        int s = tym(ranks[0], 1), e = tym(ranks[cooks - 1], par), m, ans = 0;
        while (s <= e) {
            m = (s + e) / 2;
            if (mintym(par, cooks, ranks, m)) {
                ans = m;
                e = m - 1;
            } else
                s = m + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int par = input.nextInt();
        int cooks = input.nextInt();
        int ranks[] = new int[cooks];
        for (int i = 0; i < cooks; i++)
            ranks[i] = input.nextInt();
        Arrays.sort(ranks);
        System.out.println(calc(par, cooks, ranks));
	}

}
