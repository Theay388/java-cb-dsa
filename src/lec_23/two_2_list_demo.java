package lec_23;

import java.util.ArrayList;
import java.util.List;

public class two_2_list_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ll = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		ll.add(l);

		System.out.println(ll.get(0));
		ll.get(0).add(6);
		System.out.println(ll);
		System.out.println(ll.get(0));
                                                                          
	}

}
