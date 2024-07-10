package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Lion", "Ant");
        System.out.println(list);
        sortInString(list);

        System.out.println(list);

    }

    public static void sortInString(List<String> sortedList) {
        Collections.sort(sortedList,(o1, o2) -> o1.compareTo(o2));
    }

}
