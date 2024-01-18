
public class NumberStatistics {
    private int amountOfNumbers;
	private int sum;
	private double average;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
		this.sum = 0;
		this.average = 0;
    };

    public void addNumber(int number) {
		amountOfNumbers = amountOfNumbers + 1;
		sum = sum + number;
    };

    public int amountOfNumbers() {
        return amountOfNumbers;
    };
	
	public int sum() {
       return sum;
    };

    public double average() {
        average = sum / amountOfNumbers;
		return average;
    };
};
    