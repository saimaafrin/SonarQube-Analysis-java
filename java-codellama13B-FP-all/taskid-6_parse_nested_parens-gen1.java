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

        ArrayList<String> parens = new ArrayList<String>(Arrays.asList(paren_string.split(" ")));
        ArrayList<Long> output = new ArrayList<Long>();
        for(String p : parens) {
            int depth = 0;
            char last_paren = ' ';
            for(char c : p.toCharArray()) {
                if(c == '(') {
                    depth += 1;
                    last_paren = '(';
                } else if(c == ')') {
                    depth -= 1;
                }
            }
            if(last_paren == '(') {
                output.add((long) depth);
            } else {
                output.add((long) (depth + 1));
            }
        }
        return output;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
