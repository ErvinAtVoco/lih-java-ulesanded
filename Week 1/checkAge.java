import java.util.Scanner;

public class checkAge {
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please input your age: ");
		int age = Integer.parseInt(reader.nextLine());
		
		if (age >= 1 && age <= 120) {
			System.out.println("That's an okay age!");
		} else {
			System.out.println("That's impossible!!");
		}
	}
}
