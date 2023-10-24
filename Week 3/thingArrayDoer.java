import java.util.ArrayList;

public class main {
	public static void main (String[] args) {
		ArrayList<String> things = new ArrayList<String>();
		
		things.add("Apple");
		things.add("Juice");
		things.add("Computer");
		things.add("1 Euro Cent");
		things.add("AAAA Battery");
		
		System.out.println(things);
		
		System.out.println(thingCounter(things));
		
		thingRemover(things);
		System.out.println(things);
		
		System.out.println(thingCounter(things));
		
	};
	
	public static int thingCounter(ArrayList<String> things) {
		int thingsAmount = things.size();
		return thingsAmount;
	};
	
	public static void thingRemover(ArrayList<String> things) {
		things.remove(0);
	};
}