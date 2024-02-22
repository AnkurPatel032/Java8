
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class SortWithLength {

    //sort them according to increasing order of their length?
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

    }



        }
