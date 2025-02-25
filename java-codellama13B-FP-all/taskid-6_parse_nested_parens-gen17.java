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

        // Replace all whitespace characters with single space
        paren_string = paren_string.replaceAll("\\s+"," ");

        // Replace all closing parenthesis with a new token
        String new_token = "!@#$%^&*";
        paren_string = paren_string.replaceAll("\\)",new_token);

        // Split by whitespace
        String[] split_paren_string = paren_string.split("\\s+");
        int length = split_paren_string.length;

        // Keep track of number of nested parentheses
        ArrayList<Long> level_list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String s = split_paren_string[i];
            long level = 0;
            int l = s.length();
            for (int j = 0; j < l; j++) {
                if (s.charAt(j) == '(') {
                    level++;
                }
            }
            level_list.add(level);
        }
        return level_list;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
