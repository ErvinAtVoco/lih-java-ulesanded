import java.util.Scanner;

public class main {
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		printLTriangle(5);
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
	
	public static void printLTriangle (int height) {
		int i = 1;
		while (i <= height) {
			printStars(i);
			i++;
		};
	};
};