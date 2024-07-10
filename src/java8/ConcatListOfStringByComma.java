package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatListOfStringByComma {

    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple","Cherry","Mango","Cherry");

        String collect = fruits.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(collect);
    }
}
