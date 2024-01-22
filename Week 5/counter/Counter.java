
public class Counter {
	private int value;
	private boolean check;
	
	public Counter() {
		this.value = 0;
		this.check = false;
	};
	
	public Counter(int startingValue, boolean check) {
		this.value = startingValue;
		this.check = check;
	};
	
	public Counter(int startingValue) {
		this(startingValue, false);
	};
	
	public Counter(boolean check) {
		this(0, true);
	};
	
	
	public int value() {
		return(value);
	};
	
	public void increase() {
		value = value + 1;
	};
	
	public void decrease() {
		if (check) {
			if (value > 0) {
				value = value -1;
			};
		} else {
			value = value - 1;
		};
	};
};