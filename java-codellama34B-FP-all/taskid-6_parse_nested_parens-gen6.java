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

        // Initialize a stack to keep track of opening parentheses.
        Stack<Character> paren_stack = new Stack<Character>();
        // Initialize a list to keep track of the maximum depths for each group.
        ArrayList<Long> max_depths = new ArrayList<Long>();
        // Iterate through each of the parentheses in the string.
        for (char c: paren_string.toCharArray()) {
            // If the character is an opening parenthesis, push it onto the stack.
            if (c == '(') {
                paren_stack.push(c);
            } else {
                // If the character is a closing parenthesis, pop the topmost opening parenthesis from the stack.
                paren_stack.pop();
                // If the stack is now empty, then we have reached the highest level of nesting for this group.
                // Add the maximum depth for this group to the list.
                if (paren_stack.isEmpty()) {
                    max_depths.add((long)(max_depths.size() + 1));
                } else {
                    // If the stack is not empty, then we are not yet at the highest level of nesting for this group.
                    // Decrement the maximum depth for this group since we have encountered a closing parenthesis.
                    max_depths.set(max_depths.size() - 1, (long)(max_depths.get(max_depths.size() - 1) + 1));
                }
            }
        }
        return max_depths;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
