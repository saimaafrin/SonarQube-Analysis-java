import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input to this function is a string represented multiple groups for nested parentheses separated by spaces.
    // For each of the group, output the deepest level of nesting of parentheses.
    // E.g. (()()) has maximum two levels of nesting while ((())) has three.
    // >>> parseNestedParens(("(()()) ((())) () ((())()())"))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))
    public static ArrayList<Long> parseNestedParens(String paren_string) {

        // Write your code here
        // Stack is used to keep track of opened groups of parentheses
        Stack<Long> stack = new Stack<Long>();
        // Keep track of the maximum nesting level
        long max_level = 0;
        // Keep track of the current nesting level
        long current_level = 0;
        // List to keep track of nesting levels of different groups
        ArrayList<Long> levels = new ArrayList<Long>();
        for (char c : paren_string.toCharArray()) {
            // If the current character is an opening parenthesis, then push it onto the stack and increment the current nesting level
            if (c == '(') {
                stack.push((long)current_level);
                current_level++;
            } else if (c == ')') {
                // If the current character is a closing parenthesis, then pop the topmost element from the stack and decrement the current nesting level
                stack.pop();
                current_level--;
            }
            // If the stack is empty, then it means that the current group of parentheses has ended and therefore, we need to update the maximum nesting level
            if (stack.isEmpty()) {
                max_level = Math.max(max_level, current_level);
                current_level = 0;
                continue;
            }
            // Otherwise, update the current nesting level to the maximum nesting level of the current group of parentheses
            current_level = Math.max(current_level, stack.peek());
        }
        // Push the maximum nesting level to the list of nesting levels
        levels.add(max_level);
        return levels;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
