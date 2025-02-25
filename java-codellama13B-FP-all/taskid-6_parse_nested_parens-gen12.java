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

        // Initialize the levels array to store the levels of the parens and make sure to initialize it to 0
        ArrayList<Long> levels = new ArrayList<Long>(Arrays.asList((long)0l));
        // Split the paren_string by spaces to get the groups of parentheses
        String[] groups = paren_string.split(" ");
        // Iterate over each group of parentheses
        for(String group: groups) {
            // If the group is not empty
            if(!group.isEmpty()) {
                // Get the deepest level of the current group
                long level = getDeepestLevel(group, 0l);
                // Add the deepest level to the levels array
                levels.add(level);
            }
        }
        // Return the deepest level array
        return levels;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
