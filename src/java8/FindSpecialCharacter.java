package java8;

import java.util.List;
import java.util.stream.Collectors;

public class FindSpecialCharacter {

    public static void main(String[] args) {
        String s=")Hello,world@123";

        String collect = s.chars().filter(c -> !Character.isAlphabetic(c))
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining());
        System.out.println(collect);
    }
}
