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

        ArrayList<Long> ret_list = new ArrayList<Long>();
        String[] paren_list = paren_string.split(" ");
        // Iterate through each group
        for(String paren_group: paren_list) {
            // Count nesting level for the group
            long nesting_level = 0;
            int count = 0;
            char[] paren_chars = paren_group.toCharArray();
            for(char paren: paren_chars) {
                if(paren == '(') {
                    nesting_level += 1;
                }
                else if(paren == ')') {
                    nesting_level -= 1;
                }
                count += 1;
            }
            // Add nesting level for each group to the return list
            ret_list.add(nesting_level);
        }
        return ret_list;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
