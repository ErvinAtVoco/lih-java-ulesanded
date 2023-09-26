import java.util.Scanner;

public class gradePoints {
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please input points: ");
		int points = Integer.parseInt(reader.nextLine());
		
		/* Points	Grade
		   0–29	    failed
		   30–34	1
		   35–39	2
		   40–44	3
		   45–49	4
		   50–60	5 */
		
		if (points <= 29) {
			System.out.println("You failed the test :C");
		} else if (points >= 30 && points <= 34) {
			System.out.println("Your grade is 1");
		} else if (points >= 35 && points <= 39) {
			System.out.println("Your grade is 2");
		} else if (points >= 40 && points <= 44) {
			System.out.println("Your grade is 3");
		} else if (points >= 45 && points <= 49) {
			System.out.println("Your grade is 4");
		} else if (points >= 50 && points <= 60) {
			System.out.println("Your grade is 5");
		} else {
			System.out.println("Something wrong with the point score that was input");
		}
	}
}

