import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class main {
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		
		ArrayList<String> brothers = new ArrayList<String>();
		
		brothers.add("Joonas");
		brothers.add("Margus");
		brothers.add("Aleks");
		brothers.add("Toomas");

		System.out.println("brothers:");
		System.out.println(brothers);

		Collections.sort(brothers);

		removeLast(brothers);

		System.out.println(brothers);
	};
	public static void removeLast(ArrayList<String> brothers){
		int brothersLast = (brothers.size()) - 1;
		brothers.remove(brothersLast);
	};
};