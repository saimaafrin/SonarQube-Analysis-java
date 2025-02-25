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

        int[] result = new int[paren_string.length()];
        // ^ to keep track of the maximum depth of the current nesting level.
        int current_depth = 0;
        int max_depth = 0;
        // ^ initialize the maximum nesting level
        for (int i = 0; i < paren_string.length(); i++) {
            char c = paren_string.charAt(i);
            if (c == '(') {
                current_depth += 1;
                result[i] = current_depth;
                max_depth = Math.max(max_depth, current_depth);
            } else if (c == ')') {
                current_depth -= 1;
                result[i] = current_depth;
            }
        }
        ArrayList<Long> resultLong = new ArrayList<Long>();
        for (int r : result) {
            resultLong.add((long) r);
        }
        return resultLong;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
