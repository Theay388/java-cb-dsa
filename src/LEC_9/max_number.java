package LEC_9;

public class max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= { 2,1,6,4,9,8,11,45,-0,1};  
		System.out.println(maxvalue(arr));
	}

	public static int maxvalue(int[] arr) {
		int m= Integer.MIN_VALUE;
		for (int i=0 ; i<arr.length; i++) {
//			if (arr[i] > m ) {
//				m=arr[i];
//		}
			m=Math.max(m,arr[i]);
		
		}
		 return m;   
		
	}
}
	
