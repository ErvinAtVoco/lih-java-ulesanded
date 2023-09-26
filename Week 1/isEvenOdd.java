import java.util.Scanner;

public class isEvenOdd {
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please input a number: ");
		int number = Integer.parseInt(reader.nextLine());
		
		if (number%2==0) {
			System.out.println(number + " is even");
		} else if (number%2==1) {
			System.out.println(number + " is odd");
		}
	}
}