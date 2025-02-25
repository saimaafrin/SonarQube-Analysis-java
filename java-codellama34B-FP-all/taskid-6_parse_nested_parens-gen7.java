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
        ArrayList<Long> results = new ArrayList<Long>();
        String[] groups = paren_string.split(" ");
        for (String group : groups) {
            ArrayList<String> stack = new ArrayList<String>();
            long max_level = 0;
            for (int i = 0; i < group.length(); i++) {
                String charAt = group.substring(i, i + 1);
                if (charAt.equals("(")) {
                    stack.add(charAt);
                } else if (charAt.equals(")")) {
                    stack.remove(stack.size() - 1);
                    if (stack.size() > max_level) {
                        max_level = stack.size();
                    }
                }
            }
            results.add(max_level);
        }
        return results;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
