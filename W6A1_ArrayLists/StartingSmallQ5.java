package W6A1_ArrayLists;

public class StartingSmallQ5 {
	public static void main(String[] args) {
		arrayClass s = new arrayClass();
		s.addString("red");
		s.addString("green");
		s.addString("orange");
		s.addString("white");
		s.addString("black");
		
		int i = s.searchElement("white");   // search for "white" 
		System.out.println("Color white is at index " + i);
		s.printArray();
	}
}
