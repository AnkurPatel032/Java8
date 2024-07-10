package java8;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNoStartWithOne {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(11, 12, 10, 8, 89, 21);

        List<Integer> collect = a.stream().filter(n -> String.valueOf(n).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
