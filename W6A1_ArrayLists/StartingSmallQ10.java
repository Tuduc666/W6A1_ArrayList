/*
 * 10. Appending
Write a method that will append the contents of one ArrayList to another.

 */

package W6A1_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class StartingSmallQ10 {
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
		
		s.addAll(s2);   // s = s + s2
		System.out.println(s);
		System.out.println("===========");
		System.out.println(s2);
	}
	

}
