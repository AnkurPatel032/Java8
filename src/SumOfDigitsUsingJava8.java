
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigitsUsingJava8 {

    public static void main(String[] args) {
      //  sum of all digits of a number in Java 8

        int i = 156239;

        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println(sumOfDigits);
    }
}
