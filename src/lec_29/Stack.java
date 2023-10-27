package lec_29;

public class Stack {
	
	
   private int[] arr;
   private int idx = -1;
   

    public Stack() {
    	// TODO Auto-generated method stub
    	arr = new int[5];
    }
    public Stack(int n) {
    	// TODO Auto-generated method stub
    	arr = new int[n];
    }
    //0(1)
    public boolean isEmpty() {
    	return idx == -1;
    }
    public void push(int item) {
    	idx++;
    	arr[idx]= item;
    }
    public int pop() {
     int rv = arr[idx];
    		 idx--;
         return rv;
}
    public int peak() {
    	int rv = arr[idx];
    	return rv;
    }
    
    
    public int size() {
    	return idx +1 ;
    }
    public void Display() {
    	for(int i=0; i<=idx; i++) {
    		System.out.println(arr[i]+" ");
    	}
    	System.out.println();
    	
    	
    }
}
