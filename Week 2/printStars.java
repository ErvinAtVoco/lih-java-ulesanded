import java.util.Scanner;

public class main {
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		printStars(4);
		printStars(7);
		printStars(2);
	};
	
	public static void printStars (int amount) {
		String stars = "*";
		int i = 1;
		while (i < amount) {
			stars = stars + "*";
			i++;
		};
		System.out.println(stars);
	};
};