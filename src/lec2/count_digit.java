package lec2;

public class count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n= 675661;
        int digit=6;
        int count=0;
        while(n>0) {
        	int rem = n%10;
        	if (rem == digit) {
        		count++;
        	}
        	n=n/10;
        }
        	System.out.println(count);
        	
        	}
        	
        }
	


