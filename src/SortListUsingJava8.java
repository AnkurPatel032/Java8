import  java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortListUsingJava8 {

    public static void main(String[] args) {
        //sort the given list of decimals in reverse order
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

      //  decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<String> result = decimalList.stream()
                .sorted(Comparator.reverseOrder())
                .map(Object::toString)
                .collect(Collectors.toList());
        System.out.println("Input:"+decimalList);
        System.out.println("Output:"+result);

        List<String> inputString=Arrays.asList("Anil","Amit","Vishal","Megha","Anil","Chetan");
        TreeMap<String, Long> outputData = inputString.stream().collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));

        System.out.println("OutputData:"+outputData);

        // Filter the map to keep only elements with count greater than or equal 2
        Map<String, Long> filteredResult = outputData.entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, TreeMap::new));

        System.out.println(filteredResult);
    }
}
