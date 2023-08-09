package LEC_8;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr=new int [5];
         System.out.println(arr);
         System.out.println(arr[0]);
         arr[0]=4;
         arr[1]=7;
         arr[2]=11;
         arr[3]=6;
         arr[4]=-9;
         System.out.println(arr.length);
         for (int i =0; i<arr.length; i++) {
        	 System.out.print(arr[i] + " ");
         }
	}

}
