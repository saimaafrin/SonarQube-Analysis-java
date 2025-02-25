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

        int i;
        String group;
        ArrayList<String> groups;
        int num_open_braces;
        int open_brace_index;
        int close_brace_index;
        groups = new ArrayList<String>();
        group = "";
        num_open_braces = 0;
        open_brace_index = -1;
        close_brace_index = -1;
        i = 0;
        while (i < paren_string.length()) {
            if (paren_string.charAt(i) == '(') {
                if (num_open_braces == 0) {
                    open_brace_index = i;
                }
                num_open_braces += 1;
                group += paren_string.charAt(i);
            } else if (paren_string.charAt(i) == ')') {
                group += paren_string.charAt(i);
                close_brace_index = i;
                num_open_braces -= 1;
                if (num_open_braces == 0) {
                    groups.add(group);
                    group = "";
                }
            } else {
                group += paren_string.charAt(i);
            }
            i += 1;
        }
        return groups;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
