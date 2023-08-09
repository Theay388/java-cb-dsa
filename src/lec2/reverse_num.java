package lec2;

public class reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=3468,reverse=0;
        while(n >0) {
        int rem = n%10;
        reverse=reverse*10+rem;
        n=n/10;
	 }
        System.out.println("the reverse of given number is:"+reverse);
	   
        
	}   
        

}
