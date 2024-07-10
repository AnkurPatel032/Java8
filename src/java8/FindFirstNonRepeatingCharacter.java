package java8;

import java.util.*;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String s="iindiiia";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (char ch:s.toCharArray()) {
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(entry.getValue()==1){
                System.out.println("Nonrepeating Characters:"+entry.getKey());
                break;
            }

        }

    }
}
