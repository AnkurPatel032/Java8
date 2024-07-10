package collection;

public class Concatenation {

    public static void main(String[] args) {
        System.out.println(concatinationStr("Ankur"));
        System.out.println(concatinationStr("Ankur","Kumar"));
        System.out.println(concatinationStr("Ankur","Kumar","Gandabhai"));
    }

    public static String concatinationStr(String... str){
        StringBuilder sb=new StringBuilder();
        for (String st:str) {
             sb.append(st).append(" ");
        }
        return sb.toString();
    }
}
