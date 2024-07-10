package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateInList {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(2,4,5,1,7,9,5,2,6,9);
            Set s=new HashSet();
          List<Integer> dupList=integerList.stream()
                   .filter(n->!s.add(n))
                   .collect(Collectors.toList());
        System.out.println("Duplicate element:"+dupList);
    }
}
