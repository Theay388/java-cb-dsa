package lec1;

public class grade_CARD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int m=78;
        if(m>=75) {
        	System.out.println("a");
        }else if (m >= 65 && m < 75) {
        	System.out.println("b");
        }else if (m >= 55 && m < 65) {
        	System.out.println("c");
        }else if (m >= 45 && m < 55) {
        	System.out.println("pass");
        }else {
        	System.out.println("fail");
        }
	}

}
