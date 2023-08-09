package LEC_9;

public class array_reverse_rang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= { 10,3,4,6,7,8,9,11,14,16,19,23,28,88,89 };
         reverse(arr,3,11);
         for (int i=0; i<arr.length; i++) {
        	 System.out.println(arr[i] + " ");
         }
        		 
	}
	public static void reverse(int[] arr) {
        int i=0;
        int j= arr.length-1;
        while(i<j) {
      	  int temp =arr[i];
      	  arr[i] = arr[j];
      	  arr[j] = temp;
      	  i++;    
      	  j--;
        }

}
}
