package com.example.fizzbuzztdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzBuzzTests {

	@Test
	void testNumberNotMultipleOfThreeOrFive() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("1", fizzBuzz.convert(1));
		assertEquals("2", fizzBuzz.convert(2));
	}

	@Test
	void testNumberMultipleOfThreeAndFive() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz", fizzBuzz.convert(15));
		assertEquals("FizzBuzz", fizzBuzz.convert(30));
	}

	@Test
	void testNumberMultipleOfThree() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.convert(3));
		assertEquals("Fizz", fizzBuzz.convert(9));
	}

	@Test
	void testNumberMultipleOfFive() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Buzz", fizzBuzz.convert(5));
		assertEquals("Buzz", fizzBuzz.convert(10));
	}

}
