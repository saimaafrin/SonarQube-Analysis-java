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

        ArrayList<Long> result = new ArrayList<Long>();
        if (paren_string == null || paren_string.equals("")) {
            return result;
        }

        Stack<Character> char_stack = new Stack<Character>();
        // Stack of stacks to keep track of the current level of nesting.
        Stack<Stack<Character>> stacks_stack = new Stack<Stack<Character>>();
        char_stack.push('*');
        stacks_stack.push(char_stack);
        for (Character paren : paren_string.toCharArray()) {
            if (paren == '(') {
                char_stack.push('(');
            } else if (paren == ')') {
                char_stack.pop();
            }
            if (char_stack.peek() == '(') {
                if (char_stack.size() > stacks_stack.peek().size()) {
                    stacks_stack.push(char_stack);
                }
            } else if (char_stack.peek() == '*' && !char_stack.empty()) {
                // When we complete a paren group, the peek element in the stacks stack
                // will have the correct size.
                result.add((long)stacks_stack.peek().size());
                stacks_stack.pop();
            }
        }
        return result;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
