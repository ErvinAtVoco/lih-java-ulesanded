import java.util.Scanner;

public class main {
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		printSquare(4);
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
	
	public static void printSquare (int size) {
		int i = 1;
		while (i <= size) {
			printStars(size);
			i++;
		};
	};
};