package lec_5;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int dividend = 60; 
       int divisor= 36;
       while(dividend % divisor !=0) {
    	   int rem = dividend % divisor ;
    	   dividend = divisor;
    	   divisor = rem;
    	   
       }
       System.out.println(divisor);
	}

}
