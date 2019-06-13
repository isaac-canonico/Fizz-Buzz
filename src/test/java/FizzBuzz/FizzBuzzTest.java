package FizzBuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz underTest;

	private void assertFizzBuzzSays(int input, String expectedWord) {
		String spokenWord = underTest.say(input);
		assertThat(spokenWord, is(expectedWord));
	}

	// Arrangement
	@Before
	public void setup() {
		underTest = new FizzBuzz();

	}

	@Test
	public void oneShouldSayOne() {
		assertFizzBuzzSays(1, "1");

	}

	@Test
	public void twoShouldSayTwo() {
		assertFizzBuzzSays(2, "2");
	}

	@Test
	public void threeShouldSayThree() {
		assertFizzBuzzSays(3, "Fizz");
		;
	}

	@Test
	public void fiveShouldSayBuzz() {
		assertFizzBuzzSays(5, "Buzz");

	}

	@Test
	public void sixShouldSaySix() {
		assertFizzBuzzSays(6, "Fizz");
	}

	@Test
	public void nineShouldSayNine() {
		assertFizzBuzzSays(9, "Fizz");
	}

	@Test
	public void tenShouldSayTen() {
		assertFizzBuzzSays(10, "Buzz");
	}

	@Test
	public void fifteenShouldSayFizzBuzz() {
		assertFizzBuzzSays(15, "FizzBuzz");
	}

	@Test
	public void thirtyShouldSayThirty() {
		assertFizzBuzzSays(30, "FizzBuzz");
	}

}
