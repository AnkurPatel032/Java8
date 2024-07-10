package java8;

import java.util.ArrayList;
import java.util.List;

public class SumSquares {


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int sumofSquare=  numbers.stream().mapToInt(n->n*n).sum();
        System.out.println("Sum Of Square:"+sumofSquare);
    }
}
