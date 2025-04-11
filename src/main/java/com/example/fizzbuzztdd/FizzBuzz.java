package com.example.fizzbuzztdd;

public class FizzBuzz {

    private static final int FIZZ_NUMBER = 3;
    private static final int BUZZ_NUMBER = 5;

    public String convert(int number) {
        StringBuilder sb = new StringBuilder();
        if(number % FIZZ_NUMBER == 0) sb.append("Fizz");
        if(number % BUZZ_NUMBER == 0) sb.append("Buzz");
        return sb.isEmpty() ? String.valueOf(number) : sb.toString();
    }

}
