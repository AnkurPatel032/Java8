import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEvenNumber {
    public static void main(String[] args) {

        //Given a list of integers, separate odd and even numbers?

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> oddEvenNumbersMap
                = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("oddEvenNumbersMap:"+oddEvenNumbersMap);
        // Extract the even and odd lists
        List<Integer> evenNumbers = oddEvenNumbersMap.get(true);
        List<Integer> oddNumbers = oddEvenNumbersMap.get(false);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}