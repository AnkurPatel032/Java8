
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> opMap = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(opMap);

        Map.Entry<String, Long> stringLongEntry = opMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry);

        List<String> listOfStringsNo = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        listOfStringsNo.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);

        List<Integer> listOfIntegersElement = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements = listOfIntegersElement.stream().filter(i -> ! uniqueElements.add(i)).collect(Collectors.toSet());

        System.out.println(duplicateElements);

    }
}



