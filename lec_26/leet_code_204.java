package lec_26;

public class leet_code_204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=91;
       System.out.println(Isprime(n));
	}public static boolean Isprime(int n) {
		int div =2;
		while(div*div<=0) {
			if(n%div==0) {
				return false;
				
			}
			div++;
		}
		return true;
		
	}
	

}
