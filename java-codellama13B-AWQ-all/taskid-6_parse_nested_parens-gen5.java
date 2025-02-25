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
        ArrayList<Long> out = new ArrayList<Long>();
        String[] groups = paren_string.split(" ");
        for (String group : groups) {
            long current = 0;
            Stack<Long> nesting_stack = new Stack<Long>();
            nesting_stack.push(0l);
            for (char c : group.toCharArray()) {
                if (c == '(') {
                    nesting_stack.push(nesting_stack.pop() + 1);
                }
                else if (c == ')') {
                    nesting_stack.pop();
                }
            }
            current = nesting_stack.peek();
            out.add(current);
        }
        return out;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
