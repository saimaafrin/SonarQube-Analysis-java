import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input to this function is a string containing multiple groups of nested parentheses. Your goal is to
    // separate those group into separate strings and return the array list of those.
    // Separate groups are balanced (each open brace is properly closed) and not nested within each other
    // Ignore any spaces in the input string.
    // >>> separateParenGroups(("( ) (( )) (( )( ))"))
    // (new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))
    public static ArrayList<String> separateParenGroups(String paren_string) {

        int length = paren_string.length();
        int start_pos = 0, end_pos = 0;
        ArrayList<String> group_list = new ArrayList<String>();
        while (start_pos < length && end_pos < length) {
            char current_char;
            while ((current_char = paren_string.charAt(start_pos)) == ' ') {
                ++start_pos;
            }
            if (current_char != '(') {
                break;
            }
            int count = 1;
            end_pos = start_pos + 1;
            while (count > 0) {
                if (paren_string.charAt(end_pos) == '(') {
                    ++count;
                } else if (paren_string.charAt(end_pos) == ')') {
                    --count;
                }
                ++end_pos;
                if (end_pos == length) {
                    break;
                }
            }
            String sub_string = paren_string.substring(start_pos, end_pos);
            group_list.add(sub_string);
            start_pos = end_pos;
        }
        return group_list;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
