package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContainsElement {


    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        String elementToFind = "Mango";

        // Check if the list contains the element using stream and anyMatch()
        boolean containsElement = fruits.stream()
                .anyMatch(fruit -> fruit.equals(elementToFind));

              boolean ele=fruits.stream().findAny().get().equalsIgnoreCase(elementToFind);
              if(ele){
                  System.out.println("Fruit "+elementToFind+"Present");
              }else {
                  System.out.println("Fruit "+elementToFind+" Not Present");
              }
        System.out.println("List contains '" + elementToFind + "'? " + containsElement);
    }
}
