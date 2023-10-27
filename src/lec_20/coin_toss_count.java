package lec_20;

public class coin_toss_count {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		toss(n, " "); 
		
	}

	public static void toss(int n, String ans) {
		if (n == 0) {
			System.out.print(ans+"  ");
		
			return;
		}
         		 
		toss(n - 1, ans + "H");
      
		toss(n - 1, ans + "T"); 
	}

}
