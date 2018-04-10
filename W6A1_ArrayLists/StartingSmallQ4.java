package W6A1_ArrayLists;

public class StartingSmallQ4 {
	public static void main(String[] args) {
		arrayClass s = new arrayClass();
		s.addString("red");
		s.addString("green");
		s.addString("orange");
		s.addString("white");
		s.addString("black");
		
		s.removeElement(2);   // third element is at index 2
		s.printArray();
	}
}
