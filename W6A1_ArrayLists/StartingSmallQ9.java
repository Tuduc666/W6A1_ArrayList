/*
 * 9. Comparing
Write a method that will compare two ArrayLists, printing out which elements they have in common.

 */
package W6A1_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class StartingSmallQ9 {
	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);

		List<Integer> s2 = new ArrayList<Integer>();
		s2.add(1);
		s2.add(6);
		s2.add(4);	
		
		compareList(s,s2);
	}
	
	public static void compareList(List<Integer> s, List<Integer> s2) {
		for(int i=0; i<s.size();i++)
			for(int j=0; j<s2.size();j++)
				if (s.get(i)==s2.get(j)) System.out.println(s.get(i));
	}
}
