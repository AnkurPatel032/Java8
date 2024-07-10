package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,3,2,3,5,2,1,1,1);
        System.out.println(Collections.frequency(list,1));
    }

}
