package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ListReverse {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,9,44,56,10);
        System.out.println(list);
        reverseArrayList(list);
        System.out.println(list);
    }

    private static void reverseArrayList(List<Integer> list) {
        for (int i = 0; i < list.size()/2; i++) {
            ListSwaping.swap(list,i,list.size()-1-i);
        }

    }
}
