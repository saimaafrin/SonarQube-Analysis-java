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

        ArrayList<Long> result = new ArrayList<Long>();
        Stack<Character> stack = new Stack<Character>();
        for (Character c : paren_string.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return new ArrayList<Long>();
                }
                stack.pop();
            } else if (c == ' ') {
                if (!stack.isEmpty()) {
                    return new ArrayList<Long>();
                }
                result.add((long) 0);
            }
        }
        if (!stack.isEmpty()) {
            return new ArrayList<Long>();
        }
        long current_max_depth = 0;
        for (Character c : paren_string.toCharArray()) {
            if (c == '(') {
                current_max_depth += 1;
            } else if (c == ')') {
                current_max_depth -= 1;
                if (current_max_depth < 0) {
                    return new ArrayList<Long>();
                }
            } else if (c == ' ') {
                if (current_max_depth > 0) {
                    return new ArrayList<Long>();
                }
                result.add(current_max_depth);
            }
        }
        return result;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
