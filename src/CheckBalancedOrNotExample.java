import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckBalancedOrNotExample {

    public static void main(String[] args) {
        String input = "[()]";// Test input string
        checkBalancedOrNot(input);
    }

    public static void checkBalancedOrNot(String in) {
        char[] chArray = in.toCharArray();
        // Using a Map to store the matching pairs of parentheses
        Map<Character, Character> hmap = new HashMap<>();
        hmap.put(')', '(');
        hmap.put('}', '{');
        hmap.put(']', '[');

        Stack<Character> s = new Stack<>();

        for (char c : chArray) {
            // If the current character is a closing parenthesis
            if (hmap.containsKey(c)) {
                // Check if the stack is empty or the top of the stack does not match the expected opening parenthesis
                if (s.isEmpty() || s.peek() != hmap.get(c)) {
                    System.out.println("Not balanced");
                    return;
                }
                s.pop(); // Remove the matched opening parenthesis from the stack
            } else {
                // Push the opening parenthesis onto the stack
                s.push(c);
            }
        }

        // If the stack is empty, all the parentheses were balanced
        if (s.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
}
