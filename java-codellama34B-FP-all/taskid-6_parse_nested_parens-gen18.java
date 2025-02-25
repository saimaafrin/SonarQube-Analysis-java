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

        // The counter to keep track of the maximum number of nested parentheses
        int max_depth = 0;
        // The stack to keep track of the opening and closing parentheses
        Stack<Integer> paren_stack = new Stack<Integer>();
        // The list to keep track of the maximum number of nested parentheses for each group
        ArrayList<Long> depth_list = new ArrayList<Long>();
        for (int i = 0; i < paren_string.length(); i++) {
            // If the current character is an opening parenthesis, push it to the stack
            if (paren_string.charAt(i) == '(') {
                paren_stack.push(1);
            } else { // If the current character is a closing parenthesis
                // Pop the topmost element from the stack and increment it
                paren_stack.pop();
                // Check if the popped element was the last opening parenthesis in a group
                if (paren_stack.isEmpty()) {
                    // If the maximum depth so far is less than the depth of the current group
                    if (max_depth < paren_stack.peek()) {
                        // Update the maximum depth
                        max_depth = paren_stack.peek();
                    }
                    // Add the maximum depth of the current group to the list
                    depth_list.add((long) paren_stack.peek());
                }
            }
        }
        return depth_list;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
