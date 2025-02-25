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

        // Use a stack to keep track of the current level of nesting, and the current maximum level of nesting.
        // If you enter a left paren, push the current level of nesting onto the stack. If you enter a right paren, pop the stack
        // and compare the current level of nesting to the popped element. If the popped element is greater, the current
        // level of nesting is the new maximum. Push the popped element back onto the stack.
        // If a stack underflow occurs, return -1.
        long max_level = 0;
        Stack<Long> stack = new Stack<Long>();
        stack.push(0L);
        String[] parens = paren_string.split(" ");
        ArrayList<Long> levels = new ArrayList<Long>();
        for(int i=0; i<parens.length; i++) {
            char[] paren = parens[i].toCharArray();
            for(int j=0; j<paren.length; j++) {
                if(paren[j] == '(')
                    stack.push(stack.peek() + 1);
                else if(paren[j] == ')') {
                    if(stack.peek() > max_level)
                        max_level = stack.peek();
                    stack.pop();
                }
                else
                    return new ArrayList<Long>();
            }
            levels.add(stack.peek());
            stack.push(0L);
        }
        return levels;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
