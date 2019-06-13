package FizzBuzz;

public class FizzBuzz {

	public String say(int input) {
		String spokenWord = "";

		if (inputIsAFizzNumber(input)) {
			spokenWord += "Fizz";

		}
		if (inputIsABuzzNumber(input)) {
			spokenWord += "Buzz";

		}
		if (spokenWord.isEmpty()) {
			spokenWord += input;
		}
		return spokenWord;

	}

	private boolean inputIsABuzzNumber(int input) {
		return input % 5 == 0;
	}

	private boolean inputIsAFizzNumber(int input) {
		return input % 3 == 0;
	}

}
