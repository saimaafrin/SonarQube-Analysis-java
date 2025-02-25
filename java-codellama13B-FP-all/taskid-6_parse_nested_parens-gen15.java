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

        String[] groups = paren_string.split(" ");
        ArrayList<Long> depths = new ArrayList<Long>();
        for (String group : groups) {
            long depth = 0;
            long max = 0;
            for (char c : group.toCharArray()) {
                if (c == '(') {
                    depth += 1;
                }
                else if (c == ')') {
                    depth -= 1;
                }
                max = Math.max(depth, max);
            }
            depths.add(max);
        }
        return depths;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
