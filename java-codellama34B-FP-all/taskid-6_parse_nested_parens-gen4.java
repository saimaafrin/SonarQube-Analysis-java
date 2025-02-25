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

        // Split the groups by spaces.
        ArrayList<String> groups = new ArrayList<>(Arrays.asList(paren_string.split(" ")));
        ArrayList<Long> result = new ArrayList<Long>();
        for (String group : groups) {
            long counter = 0L;
            long max = 0L;
            // For each group, iterate over the string and increment/decrement the counter when opening/closing parentheses are found.
            // Maintain the maximum value of the counter seen so far which will be the answer for that group.
            for (int i = 0; i < group.length(); i++) {
                if (group.charAt(i) == '(') {
                    counter++;
                } else if (group.charAt(i) == ')') {
                    counter--;
                }
                max = Math.max(max, counter);
            }
            result.add(max);
        }
        return result;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
