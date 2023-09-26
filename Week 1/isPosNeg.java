import java.util.Scanner;

public class isPosNeg {
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please input a number: ");
		int number = Integer.parseInt(reader.nextLine());
		
		if (number > 0) {
			System.out.println(number + " is positive");
		} else if (number < 0) {
			System.out.println(number + " is negative");
		} else {
			System.out.println(number + " is zero!");
		}
	}
}