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

        // split into individual group strings
        String[] paren_strings = paren_string.split(" ");
        // array to store the maximum level of nesting for each group
        ArrayList<Long> levels = new ArrayList<Long>();
        // check each group for maximum nesting level
        for (String paren_string_group: paren_strings) {
            long max_level = 0;
            // array to store nesting level for each parenthesis
            ArrayList<Long> levels_paren = new ArrayList<Long>();
            // iterate through each character in group string
            for (char paren_char: paren_string_group.toCharArray()) {
                // opening parentheses
                if (paren_char == '(') {
                    // increment nesting level
                    levels_paren.add(new Long(levels_paren.size() + 1));
                }
                // closing parentheses
                else if (paren_char == ')') {
                    // decrement nesting level
                    levels_paren.remove(levels_paren.size() - 1);
                }
            }
            // get the maximum level
            max_level = Collections.max(levels_paren);
            // add maximum level to the array
            levels.add(new Long(max_level));
        }
        return levels;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
