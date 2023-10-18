import java.util.Scanner;

public class main {
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		printRectangle(4, 10);
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
	
	public static void printRectangle (int height, int width) {
		int i = 1;
		while (i <= height) {
			printStars(width);
			i++;
		};
	};
};