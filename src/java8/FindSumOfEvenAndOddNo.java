package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindSumOfEvenAndOddNo {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,3,4,5,2);

         Map<Boolean, Integer> collect = integerList.stream()
                 .collect(Collectors.partitioningBy
                         (n -> n % 2 == 0,
                          Collectors.summingInt(Integer::intValue)
                         )
                 );

        System.out.println("Even Sum:"+collect.get(true));
        System.out.println("Odd Sum:"+collect.get(false));

    }
}
