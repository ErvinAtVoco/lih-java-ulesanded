import java.util.Scanner;

public class divideTwoInputs {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please input the first number: ");
		int x = Integer.parseInt(reader.nextLine());
		
		System.out.print("Please input the second number: ");
		int y = Integer.parseInt(reader.nextLine());
		
		double z = (double)x / y;
		
		System.out.println("Division result: " + z);
	}
}