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

        ArrayList<Long> nested_levels = new ArrayList<Long>();
        ArrayList<Long> stack = new ArrayList<Long>();
        for (int i = 0; i < paren_string.length(); i++) {
            char c = paren_string.charAt(i);
            if (c == '(') {
                stack.add(0, (long) 0);
            } else if (c == ')') {
                long top = stack.get(0);
                stack.set(0, stack.get(0) + 1);
                if (stack.size() > 1) {
                    long second = stack.get(1);
                    stack.set(1, Math.max(second, stack.get(0)));
                }
                if (top == 0) {
                    stack.remove(0);
                }
            }
        }
        long max_level = 0;
        for (long level : stack) {
            max_level = Math.max(max_level, level);
        }
        for (String group : paren_string.split(" ")) {
            nested_levels.add(max_level);
        }
        return nested_levels;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
