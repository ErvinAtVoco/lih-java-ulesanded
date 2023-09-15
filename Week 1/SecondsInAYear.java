
public class Main {
	public static void main(String[] args) {
		int daysInYear = 365;
		int hoursInDay = 24;
		int minutesInHour = 60;
		int secondsInMinute = 60;
		
		int secondsInYear = daysInYear * hoursInDay * minutesInHour * secondsInMinute;
		
		System.out.print("There are " + secondsInYear + " seconds in a year");
	}
}