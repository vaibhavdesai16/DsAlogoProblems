package TwoSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class TwoSetsProblem {
	
	public static void main(String args[]) {

	 ArrayList<Integer> list = new ArrayList<Integer>();
	 for(int i= 1; i < 11; i ++){
		 list.add(i);
	 }
	 	splitIntoSets(list);
		
	}
	
	public static void splitIntoSets(List<Integer> list) {
		Collections.sort(list);
		LinkedHashSet<Integer> vaulesSet = new LinkedHashSet<Integer>(list);
		LinkedList<Integer> list_of_unique = new LinkedList<Integer>(vaulesSet);
		
		int mid = list_of_unique.size() /2 ;
		System.out.println(mid);

		List<Integer> list_of_lower = list_of_unique.subList(0, mid);
		List<Integer> list_of_upper = list_of_unique.subList(mid, list_of_unique.size());

		int sum_of_lower = 0;
		int sum_of_upper = 0;

		for (int var : list_of_lower) {
			sum_of_lower +=  var;
		}

		for (int var : list_of_upper) {
			sum_of_upper +=  var;
		}


	}

}
