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

        Stack<Long> stack = new Stack<Long>();
        ArrayList<Long> paren_stack = new ArrayList<Long>();
        long max_depth = 0;
        for (char ch : paren_string.toCharArray()) {
            if (ch == '(') {
                stack.push(1L);
            } else if (ch == ')') {
                if (stack.size() == 0) {
                    continue;
                }
                stack.pop();
                if (stack.size() == 0) {
                    paren_stack.add(max_depth);
                } else {
                    stack.set(stack.size() - 1, stack.get(stack.size() - 1) + 1);
                }
            }
        }
        return paren_stack;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
