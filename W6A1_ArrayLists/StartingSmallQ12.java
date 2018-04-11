/*
 * 12. Converting
Write a method that will convert a regular Array to an ArrayList.

 */


package W6A1_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartingSmallQ12 {
	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		Integer[] s2 = {1,6,4};
		
		s = Arrays.asList(s2);   // converts array to ArrayList

		System.out.println(s);

	}
	

}
