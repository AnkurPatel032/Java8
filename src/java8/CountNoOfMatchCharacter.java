package java8;

import java.util.HashSet;
import java.util.Set;

public class CountNoOfMatchCharacter {

    public static void main(String[] args) {
        String s1 = "ABCDF";
        String s2 = "ABDFG";
        int k = countNoOfMatchingCharacter(s1, s2);
        System.out.println("No of Matching character:" + k);
    }

    public static int countNoOfMatchingCharacter(String s1, String s2) {
//        int count=0;
//        int length=Math.min(s1.length(),s2.length());
//        for (int i = 0; i < length; i++) {
//            if(s1.charAt(i)==s2.charAt(i)){
//                count++;
//            }
//        }
//
//        return count;
        Set<Character> h1 = new HashSet<>();
        Set<Character> h2 = new HashSet<>();
        for (char c:s1.toCharArray()) {
            h1.add(c);
        }
        System.out.println("h1:"+h1);
        for (char c:s2.toCharArray()) {
            h2.add(c);
        }
        System.out.println("h2:"+h2);
        h1.retainAll(h2);//intersection
        System.out.println("After Retain h1:"+h1);
        return h1.size();

    }
}
