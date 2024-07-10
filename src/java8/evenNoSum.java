package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class evenNoSum {


    public static void main(String[] args) {

        List<Integer> nos = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int evenSum = nos.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("EvenNo Sum:" + evenSum);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma");

        // Using forEach method with lambda expression to print each name in uppercase
        // names.forEach(name -> System.out.println(name.toUpperCase()));


        List data = names
                .stream()
                .filter(evenNoSum::isLengthGreaterThanThree)
                //.filter(s -> s.length() > 3)
               // .sorted(Collections.reverseOrder())
                //  .sorted(Comparator.reverseOrder())
                 .sorted(Comparator.comparingLong(String::length))
                .toList();
        System.out.println("name Length greater then 3:" + data);
        System.out.println("*****************************************");

    }

    private static boolean isLengthGreaterThanThree(String s) {
        return s.length() > 3;
    }
}
