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

        String[] paren_strings = paren_string.split(" ");
        ArrayList<Long> paren_levels = new ArrayList<Long>();
        for (String paren_string_ : paren_strings) {
            long paren_level = 0;
            boolean balanced = true;
            Stack<Character> stack = new Stack<Character>();
            for (char c : paren_string_.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                    paren_level += 1;
                } else if (c == ')') {
                    if (stack.empty()) {
                        balanced = false;
                        break;
                    } else {
                        stack.pop();
                        paren_level = Math.max(paren_level - 1, paren_level);
                    }
                }
            }
            if (balanced && stack.empty()) {
                paren_levels.add(paren_level);
            } else {
                paren_levels.add((long) -1l);
            }
        }
        return paren_levels;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
