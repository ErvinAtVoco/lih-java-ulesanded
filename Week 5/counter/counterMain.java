import java.util.Scanner;

public class main {
	 public static void main(String[] args) {
		Counter counter1 = new Counter();
		counter1.increase();
		System.out.println("The value of Counter 1 after increase is " + counter1.value());
		counter1.decrease();
		System.out.println("The value of Counter 1 after decrease  is " + counter1.value());
		
		
		Scanner reader = new Scanner(System.in);
        System.out.print("Input starting value: ");
        int input = Integer.parseInt(reader.nextLine());
		Counter counter2 = new Counter(input, true);
		System.out.println("The starting value of Counter 2 is " + counter2.value());
		counter2.increase();
		System.out.println("The value of Counter 2 after increase is " + counter2.value());
		counter2.decrease();
		System.out.println("The value of Counter 2 after decrease is " + counter2.value());
	 }
}