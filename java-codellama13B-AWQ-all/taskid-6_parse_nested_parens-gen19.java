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

        ArrayList<Long> max_levels = new ArrayList<Long>();
        for(String group : paren_string.split(" ")) {
            long curr_max_level = 0l;
            int curr_level = 0;
            boolean is_open = false;
            for(char c : group.toCharArray()) {
                if(c == '(' && !is_open) {
                    curr_level += 1;
                    if(curr_level > curr_max_level) {
                        curr_max_level = curr_level;
                    }
                    is_open = true;
                } else if(c == ')' && is_open) {
                    curr_level -= 1;
                    is_open = false;
                }
            }
            max_levels.add(curr_max_level);
        }
        return max_levels;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
