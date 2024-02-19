import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyUsingJava8 {

    public static void main(String[] args) {
        // find frequency of each character in a string using Java 8 streams?
        String inputString = "java programming languages";

        Map<Character, Long> charCountMap =
                inputString.chars()
                        .filter(c->c!=' ')
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(),TreeMap::new, Collectors.counting()));
        System.out.println("Input String:"+inputString);
        System.out.println("Output Map:"+charCountMap);

        //Printing Unique with sorted data
        List<Integer> IntegerData=Arrays.asList(1,2,3,32,1,2,24,5,34,4,4);
        List<Integer> unique = IntegerData
                .stream()
                .distinct().sorted()
                .collect(Collectors.toList());
        System.out.println(unique);
        Map<Integer, Long> collect = IntegerData.stream().collect(Collectors.groupingBy(Function.identity(), TreeMap::new,Collectors.counting()));
        System.out.println("Input Data:"+IntegerData);
        System.out.println("Output Map:"+collect);

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> stationeryCountMap =
                stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),TreeMap::new, Collectors.counting()));
        System.out.println("Input Data:"+stationeryList);
        System.out.println("Output Map:"+stationeryCountMap);
    }
}
