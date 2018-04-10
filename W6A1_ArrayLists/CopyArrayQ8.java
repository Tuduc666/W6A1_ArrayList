package W6A1_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayQ8 {
	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		List<String> s2 = new ArrayList<String>();

   
		s.add("red");
		s.add("green");
		s.add("orange");
		s.add("white");
		s.add("black");
		copyArray(s,s2);
		System.out.println(s2);
} 
	// copy array
	public static void copyArray(List<String> s, List<String> s2) {
			for (int i=0; i<s.size(); i++) 
				s2.add(s.get(i));
	} }
