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

        // Initialize an array list to hold the maximum depth of each set of parens.
        ArrayList<Long> max_depth_array = new ArrayList<Long>();
        // Split the input string into individual sets of parens.
        String[] paren_sets = paren_string.split(" ");
        // Iterate over each set of parens.
        for (String paren_set : paren_sets) {
            // Calculate the maximum depth of the current set of parens.
            long max_depth = findMaxDepth(paren_set);
            // Add the maximum depth to the array list.
            max_depth_array.add(max_depth);
        }
        // Return the array list with the maximum depths of each set of parens.
        return max_depth_array;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
