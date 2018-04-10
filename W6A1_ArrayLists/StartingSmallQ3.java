package W6A1_ArrayLists;

public class StartingSmallQ3 {
	public static void main(String[] args) {
		arrayClass s = new arrayClass();
		s.addString("red");
		s.addString("green");
		s.addString("orange");
		s.addString("white");
		s.addString("black");
		
		s.changeElement(4, "Magenta");   // fifth element is at index 4
		s.printArray();
	}
}
