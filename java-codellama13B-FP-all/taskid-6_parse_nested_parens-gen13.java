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

        // Tokenize the input string.
        String[] tokens = paren_string.split(" ");
        // Initialize the array to store the levels of nesting.
        long[] levels = new long[tokens.length];
        long level = 0;
        int index = 0;
        // Iterate through each token.
        for (String token : tokens) {
            // If the token is an open paren, then increase the level of nesting.
            if (token.equals("(")) {
                level++;
            }
            // If the token is a close paren, then decrease the level of nesting.
            else if (token.equals(")")) {
                level--;
            }
            // Store the current level of nesting.
            levels[index++] = level;
        }
        // Create an ArrayList from the levels array.
        ArrayList<Long> level_list = new ArrayList<Long>();
        for (long l : levels) {
            level_list.add(l);
        }
        return level_list;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
