package LEC_9;

public class swap_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= { 10,20,30,40,50};
		int [] other = { 100, 200, 300, 400, 9 }; 
		System.out.println(arr[0] + " " + arr[0]);
		swap(arr, other);
		System.out.println(arr[0] + " " + arr[0]);
		
	}
	public static void swap (int[]arr, int[]other) { 
              int[]temp = arr;
              arr = other;
              other = arr;    
              
              
}
}
