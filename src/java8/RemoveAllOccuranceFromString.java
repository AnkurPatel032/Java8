package java8;

import java.util.stream.Collectors;

public class RemoveAllOccuranceFromString {

    public static void main(String[] args) {

        String s="java interview";
        char ch='v';
        String collect = s.chars().filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(collect);

    }
}
