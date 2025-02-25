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

        final int N = 0; // 0 means not in parenthesis, 1 means in parenthesis
        final int S = 1; // 1 means in string literal
        final int C = 2; // 2 means in character literal
        final int P = 3; // 3 means in parenthesis
        final int E = 4; // 4 means error
        ArrayList<Long> ans = new ArrayList<Long>();
        int level = 0;
        int state = N;
        for (int i = 0; i < paren_string.length(); i++) {
            char c = paren_string.charAt(i);
            // System.out.println(i + " " + c + " " + state + " " + level);
            switch (state) {
                case N:
                    switch (c) {
                        case '(':
                            state = P;
                            level += 1;
                            break;
                        case '"':
                            state = S;
                            break;
                        case '\'':
                            state = C;
                            break;
                        case ' ':
                            break;
                        default:
                            state = E;
                    }
                    break;
                case S:
                    switch (c) {
                        case '\\':
                            state = S;
                            break;
                        case '"':
                            state = N;
                            break;
                        default:
                    }
                    break;
                case C:
                    switch (c) {
                        case '\\':
                            state = C;
                            break;
                        case '\'':
                            state = N;
                            break;
                        default:
                    }
                    break;
                case P:
                    switch (c) {
                        case '(':
                            state = P;
                            level += 1;
                            break;
                        case ')':
                            state = N;
                            level -= 1;
                            ans.add(new Long(level));
                            break;
                        default:
                    }
                    break;
                case E:
                    System.out.println("Error");
                    break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
