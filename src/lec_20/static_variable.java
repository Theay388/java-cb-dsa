package lec_20;

public class static_variable {
	static int val =100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println(val);
		System.out.println("bye");
		fun();
		System.out.println(val);
		
              
	}
	public static void fun() {
		int val=90;
		//val=val+5;
		static_variable.val=static_variable.val+5;
		
		
	}

}
