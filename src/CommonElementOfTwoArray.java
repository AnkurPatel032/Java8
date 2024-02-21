
import java.util.*;
public class CommonElementOfTwoArray {

    public static void main(String[] args) {
        // find common elements between two arrays

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28,44);

        List<Integer> list2 = Arrays.asList(12,44, 56, 17, 21, 94, 34);

        list1.stream().filter(list2::contains).map(i->i + " ").forEach(System.out::print);

    }
}
