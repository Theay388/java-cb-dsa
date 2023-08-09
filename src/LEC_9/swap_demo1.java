package LEC_9;

public class swap_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= { 2,1,6,4,9,8,11,45,-0,1};
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr[0], arr[1]);
		System.out.println(arr[0]+ " "+ arr[1]);
		
	} 
	public static void swap(int a,int b) {                                   
		int temp = a;
		a=b;
		b=temp;
	}

}
