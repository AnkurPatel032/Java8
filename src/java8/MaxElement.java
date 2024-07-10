package java8;

import java.util.Arrays;
import java.util.Optional;

public class MaxElement {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 35};

        // Find the maximum element using stream and max() (handles empty sequences)
        Optional<Integer> max = Arrays.stream(numbers).boxed().max(Integer::compareTo);
//                      Arrays.stream(numbers).boxed().max(Integer::compareTo);
        if (max.isPresent()) {
            System.out.println("Maximum element: " + max.get());
        } else {
            System.out.println("Array is empty");
        }
    }
}
