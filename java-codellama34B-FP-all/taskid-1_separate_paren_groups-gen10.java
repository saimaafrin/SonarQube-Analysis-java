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

        // Ignore any spaces in the input string
        paren_string = paren_string.replaceAll(" ", "");
        // Initialize variables
        int open_count = 0;
        int close_count = 0;
        String temp = "";
        int start_index = 0;
        int index = 0;
        ArrayList<String> paren_groups = new ArrayList<String>();
        for (index = 0; index < paren_string.length(); index++) {
            if (paren_string.charAt(index) == '(') {
                open_count += 1;
                if (open_count == 1) {
                    start_index = index;
                }
            }
            if (paren_string.charAt(index) == ')') {
                close_count += 1;
            }
            if (open_count != 0 && open_count == close_count) {
                temp = paren_string.substring(start_index, index + 1);
                paren_groups.add(temp);
                open_count = 0;
                close_count = 0;
            }
        }
        return paren_groups;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
