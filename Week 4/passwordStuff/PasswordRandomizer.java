import java.util.Random;

public class PasswordRandomizer {
    private int passwordLength;
	private String password;

    public PasswordRandomizer(int length) {
        passwordLength = length;
		password = "";
    }

    public String createPassword() {
		int i;
		password = "";
		i = passwordLength;
		Random rand = new Random();
	  
		while(i > 0) {
			int number = rand.nextInt(26);
			char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
			password = password + symbol;
			i--;
		};
	  
		return password;
    };
}