package collection;

import java.util.Arrays;
import java.util.List;

public class ListSwaping
{
    public static void main(String[] args) {
        List<Integer> nosList= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        System.out.println("Before:" + nosList);
        swap(nosList,1,8);
        swap(nosList,2,7);
        System.out.println("After:" + nosList);
    }
    static void swap(List<Integer> noList,int x,int y){
         int swap=noList.get(x);
         noList.set(x,noList.get(y));
         noList.set(y,swap);
    }
}
