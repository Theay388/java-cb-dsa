package lec_17;

import java.util.*;

public class array_list_demo {

	public static void main(String[] args) {
		// TODO Auto-generated Integerstub
        ArrayList<Integer>ll=new ArrayList<>();
        System.out.println(ll);
        
        //add
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);
        ll.add(3,89);//
        System.out.println(ll);
        System.out.println(ll.size());
        
        //get
        System.out.println(ll.get(3));//0 to size-1
        System.out.println(ll.get(0));
        System.out.println(ll);
        
        //remove
        System.out.println(ll.remove(1));
        System.out.println(ll);
        ll.add(201);
        ll.add(-30);
        System.out.println(ll);
       
        //update
        ll.set(2, -97);
        System.out.println(ll);
        
        //sort
        Collections.sort(ll);
        System.out.println(ll);
        
        //display
        for(int i=0; i<ll.size(); i++) {
        	System.out.println(ll.get(i) + " ");
        }
        System.out.println();
        for(int i :ll)  {
        	System.out.println(i+" ");
        }
        System.out.println(); 
        
        
        
	}

}
