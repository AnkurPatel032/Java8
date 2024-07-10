package java8;


import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortTheArray {

    public static void main(String[] args) {

        Integer numbers[]={1,12,5,7,2,9};

        Arrays.sort(numbers);
        System.out.println("****************");
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
        System.out.println("****************");
        Arrays.sort(numbers,Collections.reverseOrder());
        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));

        System.out.println("****************");

        Integer[] sortedArray = Arrays.stream(numbers).sorted().toArray(Integer[]::new);
        System.out.println("using ascending java 8 :"+Arrays.toString(sortedArray));

        System.out.println("****************");
        Integer[] sortedDescArray = Arrays.stream(numbers).sorted(Collections.reverseOrder()).toArray(Integer[]::new);
        System.out.println("using descending java 8 :"+Arrays.toString(sortedDescArray));

        System.out.println("****************");

    }


}
