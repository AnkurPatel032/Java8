import  java.util.*;
import java.util.stream.Collectors;

public class JoinStringUsingSpecialCharacterUsingJava8 {
   //Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));

        System.out.println(joinedString);


        List<String> listOfInputStrings = Arrays.asList("Facebook:Mark Zuckerberg", "Twitter: Jack Dorsey", "YouTube:Chad Hurley"
                , "WhatsApp:Jan Koum", "LinkedIn: Reid Hoffman");

        String json = "[" + listOfInputStrings.stream()
                .map(s -> {
                    String[] parts = s.split(":");
                    return "{\"company\":\"" + parts[0] + "\",\"founder\":\"" + parts[1] + "\"}";
                })
                .collect(Collectors.joining(",")) + "]";

        System.out.println(json);

    }
}
