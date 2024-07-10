package java8;

import java.util.Arrays;

public class FindSumOfDigitInString {

    public static void main(String[] args) {
        String s = "ab1234pq";
        int sum = s.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
        System.out.println("Sum of Digit From String:" + sum);
    }
}
