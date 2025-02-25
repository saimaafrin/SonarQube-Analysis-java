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

        int cur = 0, len = paren_string.length();
        ArrayList<Long> result = new ArrayList<Long>();
        while (cur < len) {
            int nxt = cur;
            int max_level = 0, cur_level = 0;
            while (nxt < len && paren_string.charAt(nxt) == '(') {
                cur_level++;
                nxt++;
            }
            max_level = Math.max(max_level, cur_level);
            while (nxt < len && paren_string.charAt(nxt) == ')') {
                cur_level--;
                nxt++;
            }
            max_level = Math.max(max_level, cur_level);
            result.add((long)max_level);
            cur = nxt + 1;
        }
        return result;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
