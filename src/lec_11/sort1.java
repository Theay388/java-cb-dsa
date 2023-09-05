package lec_11;

public class sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = {2,8,1,4,3,5,9};
		        sort(arr);
		        for(int i = 0; i<arr.length;i++) {
		        	System.out.print(arr[i]+" ");
		        }
			}
			public static void sort(int[] arr) {
				//Single element always sorted hota hai due to this loop 1 se start hua hai
				for(int i=1;i<arr.length;i++) {
					InsertElement(arr,i);
				}
			}
			public static void InsertElement(int[] arr, int i) {
				int j =i-1;
				int item = arr[i];
				while(j>=0 && arr[j]> item) {
					arr[j+1]=arr[j];
					arr[j]=item;
					j--;
				}
			}

		

}
