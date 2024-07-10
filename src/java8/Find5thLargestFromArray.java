package java8;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.*;

public class Find5thLargestFromArray {

    public static void main(String[] args) {
        int[] array = {4, 5, 2, 3, 6, 7, 8};//2,3,4,5,6,7,8

        int k = stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(4)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Number not Found..."));
        System.out.println(k);
    }
}
