package W6A1_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayClass {
	protected List<String> s = new ArrayList<>();
	
	public arrayClass() { super();  }       // constructor

	public arrayClass(List<String> s) {      // constructor
		super();  
		this.s = s;
	}

	public void addString(String i) {
		this.s.add(i);
	}
	
	public void changeElement(int i, String a) {
		this.s.set(i, a);
	}

	public void removeElement(int i) {
		this.s.remove(i);
	}

	public int searchElement(String a) {
		return(this.s.indexOf(a));
	}

	// return sorted array (ascending order)
	public List<String> sortArray() {
		Collections.sort(this.s);
		return(this.s);
	}
	
	// return sorted array (descending order)
	public List<String> sortArrayDesc() {
		Collections.sort(this.s, Collections.reverseOrder());
		return(this.s);
	}
	
	// copy inputed array
//	public void copyArray(List<String> s2) {
//		for (String i : s2) this.s.add(i);
//	}
//	public List<String> copyArray() {       // not working!!!!!!!  did it in MainRunner
//		List<String> s2 = new ArrayList<>();
//		for (int i = 0; i<s.size(); i++) s2.add(this.s.get(i));
//	return(s2);
//	}
	
	public void printArray() {
		for (String i : this.s)  System.out.println("Today's Color is [" + i + "]!");
	}
	
	public void printArrayTwo() {
		for (String i : this.s)  System.out.println("[" + i + "] ");
	}
}
