package lec_13;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[]arr= {2 ,3,5,6,7,11,13,15,18,19,20};
			int item =13;
			System.out.println(search(arr,item));

		}
		public static int search(int[]arr,int item) {
			int si =0;
			int ei=arr.length-1;
			while(si<= ei) {
				int mid=(si +ei)/2;
				if(arr[mid]==item) {
					return mid;
					
				}else if(arr[mid]>item) {
					ei = mid-1;
					
				}else {
					si=mid+1;
				}
			}
			return-1;
		
	

	
	}
}

