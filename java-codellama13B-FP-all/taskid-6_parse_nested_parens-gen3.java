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

        // Write your code here
        ArrayList<Long> result = new ArrayList<Long>();
        long deepest_nesting_level = 0;
        String[] groups = paren_string.split(" ");
        for (int i = 0; i < groups.length; i++) {
            String group = groups[i];
            int level = 0;
            int max_level = 0;
            for (int j = 0; j < group.length(); j++) {
                if (group.charAt(j) == '(')
                    level++;
                else if (group.charAt(j) == ')')
                    level--;
                else
                    return null;
                max_level = Math.max(max_level, level);
            }
            result.add(max_level);
            deepest_nesting_level = Math.max(deepest_nesting_level, max_level);
        }
        return result;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
