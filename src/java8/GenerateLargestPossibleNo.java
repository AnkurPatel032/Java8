package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class GenerateLargestPossibleNo {

    public static void main(String[] args) {
        Integer s[] = {2, 3, 1, 2, 3, 2};
        System.out.println("Before Reverse No:" + Arrays.toString(s));
        Arrays.sort(s, Collections.reverseOrder());
        System.out.println("After Reverse No:" + Arrays.toString(s));
        StringBuilder n = new StringBuilder();
        for (int digit : s) {
            n.append(digit);
        }
        System.out.println("largest No:" + n.toString());
    }
}
