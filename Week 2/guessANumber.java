import java.util.Scanner;

public class main {
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		int guess;
		int number = 39;
		int attempts = 0;
		while(true){
			System.out.print("Guess a number: ");
			guess = Integer.parseInt(reader.nextLine());
			if (guess == number) {
				System.out.println("You got it!");
				attempts += 1;
				System.out.println("It took you " + attempts + " attempts!");
				break;
			};
			
			if (guess > number) {
				System.out.println("The number is lesser than " + guess);
				attempts += 1;
			} else {
				System.out.println("The number is greater than " + guess);
				attempts += 1;
			};
			
			System.out.println("Attempts: " + attempts);
		}; 
	};
};
