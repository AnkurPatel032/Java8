
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class mergeTwoArrayIntoSingleArray {

    public static void main(String[] args) {
        // merge two unsorted arrays into single sorted array using Java 8 stream
        int[] a={1,5,6,8};
        int[] b={9,3,5,8,7,2};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));

        //three maximum numbers and three minimum numbers from the given list of integers?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        //3 minimum Numbers
        System.out.println("-----------------");
        System.out.println("Minimum 3 Numbers");
        System.out.println("-----------------");

        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

        //3 Maximum Numbers
        System.out.println("-----------------");
        System.out.println("Maximum 3 Numbers");
        System.out.println("-----------------");

        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
