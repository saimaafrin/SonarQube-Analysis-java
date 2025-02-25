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

        String[] groups = paren_string.trim().split(" ");
        ArrayList<Long> output = new ArrayList<>();
        for (String group : groups) {
            // First remove all white spaces from the group
            group = group.replaceAll("\\s", "");
            int max_level = 0;
            int level = 0;
            for (char c : group.toCharArray()) {
                if (c == '(') {
                    level++;
                    max_level = Math.max(max_level, level);
                } else if (c == ')') {
                    level--;
                }
            }
            // The answer should never be negative
            output.add((long)Math.max(max_level, 0));
        }
        return output;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
