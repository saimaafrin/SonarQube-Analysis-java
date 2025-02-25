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

        paren_string = paren_string.replaceAll("\\s+", "");
        char[] chars = paren_string.toCharArray();
        long max_nesting_level = 0;
        long current_nesting_level = 0;
        boolean is_open_paren = false;
        ArrayList<Long> result = new ArrayList<Long>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                is_open_paren = true;
                current_nesting_level += 1;
            } else if (chars[i] == ')') {
                is_open_paren = false;
                current_nesting_level -= 1;
            }
            if (i == chars.length - 1) {
                if (is_open_paren) {
                    current_nesting_level += 1;
                }
                max_nesting_level = Math.max(max_nesting_level, current_nesting_level);
                result.add(current_nesting_level);
            } else if (chars[i] == ')' && chars[i + 1] == '(') {
                max_nesting_level = Math.max(max_nesting_level, current_nesting_level);
                result.add(current_nesting_level);
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
