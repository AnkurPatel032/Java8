package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class CombiningArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 2,6};

        int[] combinedArray = IntStream
                .concat(Arrays.stream(array1), Arrays.stream(array2))
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("Combined Array: " + Arrays.toString(combinedArray));
    }
}
