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

        var paren_level = new ArrayList<Long>();
        var stack = new ArrayList<Long>();
        for (var i = 0l; i < paren_string.length(); i++) {
            var char_i = paren_string.charAt((int)i);
            switch (char_i) {
            case '(':
                stack.add(i);
                break;
            case ')':
                stack.remove(stack.size() - 1);
                var level = stack.isEmpty() ? 0l : stack.get(stack.size() - 1) + 1;
                paren_level.add(level);
                break;
            default:
                throw new IllegalArgumentException("Unexpected character");
            }
        }
        if (!stack.isEmpty()) {
            throw new IllegalArgumentException("Unbalanced parentheses");
        }
        return paren_level;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
