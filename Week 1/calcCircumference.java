import java.util.Scanner;

public class calcCircumference {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		float pi = 3.14159265359f;
		
		System.out.print("Please input radius: ");
		double radius = Integer.parseInt(reader.nextLine());
		
		double circumference = 2 * pi * (double)radius;
		
		System.out.println("The circumference of the circle is: " + circumference);
	}	
}