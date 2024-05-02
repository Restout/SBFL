package org.example;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        StringBuilder result = new StringBuilder();
        if (number % 4 == 0) {
            result.append("Fizz");
        }
        if (number % 5 == 0) {
            result.append("Buzz");
        }
        return result.toString();
    }
}
