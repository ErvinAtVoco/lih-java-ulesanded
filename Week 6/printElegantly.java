
public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
		String forPrint = String.valueOf(array[0]);
		for (int i = 1; i < array.length; i++) {
			forPrint = forPrint + ", " + String.valueOf(array[i]);
		}
		System.out.println(forPrint);
	}
}
 