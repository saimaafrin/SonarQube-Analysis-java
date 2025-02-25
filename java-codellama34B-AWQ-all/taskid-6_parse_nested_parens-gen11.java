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

        // Remove unnecessary spaces
        paren_string = paren_string.replaceAll("\\s+", "");
        // Split the string based on "("
        String[] splits = paren_string.split("\\(");
        // Initialize a stack
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Long> result = new ArrayList<Long>();
        for (String split : splits) {
            // Iterate through the string and push the indices of the opening parentheses
            // to the stack
            for (int i = 0; i < split.length(); i++) {
                if (split.charAt(i) == ')') {
                    stack.push(i);
                }
            }
            // Calculate the number of pairs of parentheses
            long count = 0;
            while (stack.size() > 0) {
                int index = stack.pop();
                count++;
            }
            // Add the number of pairs of parentheses to the result
            result.add(count);
        }
        return result;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
