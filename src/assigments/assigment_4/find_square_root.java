package assigment_4;

import java.util.*;
import java.math.*;

public class find_square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Squareroot(x);

	}

	public static void Squareroot(int x) {
		// TODO Auto-generated method stub
		int a = (int) Math.floor(Math.sqrt(x));
		System.out.println(a);
	}

}
