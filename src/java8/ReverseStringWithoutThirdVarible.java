package java8;

import java.util.Scanner;

public class ReverseStringWithoutThirdVarible {

    public static void main(String[] args) {
        //1.Using For Loop
        System.out.println("\n********Using For Loop**********");
        String s;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String to Reverse:");
        s=sc.nextLine();
        System.out.println("After Reverse String:");
        for (int i=s.length();i>0;i--){
            System.out.print(s.charAt(i-1));

        }

        //2.Using While Loop
        System.out.println("\n********Using While Loop**********");
        int i=s.length();
        while (i>0){
            System.out.print(s.charAt(i-1));
            i--;
        }

        //3.Using XOR
        System.out.println("\n********Using XOR Loop**********");
        char[] ch=s.toCharArray();
         int left=0;
         int right= ch.length-1;

         while (left<right){
             ch[left]^=ch[right];
             ch[right]^=ch[left];
             ch[left]^=ch[right];
             left++;
             right--;
         }

         String reverseString=new String(ch);
        System.out.println(reverseString);

        //4.Using String Builder
        System.out.println("\n********Using Same Order StringBuilder**********");
        String reversed =reverseEachWord(s);

        System.out.println("After Reverse String: " + reversed);
    }
    public static String reverseEachWord(String input) {
        // Split the input string into words
        String[] words = input.split(" ");

        // Reverse each word and join them with a space
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder wordReversed = new StringBuilder(word);
            reversed.append(wordReversed.reverse().toString()).append(" ");
        }

        // Trim the trailing space and return the result
        return reversed.toString().trim();
    }
}
