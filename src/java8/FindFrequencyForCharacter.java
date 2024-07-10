package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyForCharacter {

    public static void main(String[] args) {
        String s = "aaa aa cc bb";
        Map<Character, Long> collect =
                s.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(Function.identity(), c -> 1l, Long::sum));
        System.out.println(collect);

        Map<Character, Long> collect1 = s.chars()
                .filter(c->!Character.isWhitespace(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(Function.identity(), c -> 1L, Long::sum));
        System.out.println(collect1);
    }
}
