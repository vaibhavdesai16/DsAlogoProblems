package TwoSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TwoSetsProblem {
	
	public static void main(String args[]) {
		
	}
	
	public void splitIntoSets(List<Integer> list) {
		ArrayList<Integer> values = new ArrayList<Integer>(list);
		Collections.sort(values);
		LinkedHashSet<Integer> uniqueValues = new LinkedHashSet<Integer>(values);
		int mid = uniqueValues.size() / 2;
		
		System.out.println(mid);
		
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		int sum1 = 0;
		int sum2 = 0;
		
		int i = 0;
		for(int value: uniqueValues) {
			if(i > mid) {
				sum1 = sum1 + value;
				set2.add(value);
			}
			else {
				sum2 = sum2 + value;
				set1.add(value);
			}
		}
		
		
		
	}

}
