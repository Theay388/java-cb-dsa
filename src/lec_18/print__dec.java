package lec_18;

public class print__dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n =5;
        PD(n);
	}
	public static void PD(int n)  {
		if (n == 0) {
			return;
		}
		System.out.println(n); 
		PD(n - 1);

	}
}
