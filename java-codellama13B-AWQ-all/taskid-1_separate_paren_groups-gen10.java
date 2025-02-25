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

        ArrayList<String> groups = new ArrayList<String>();
        int curr_start_index = 0;
        int curr_end_index = 0;
        while(true) {
            if(paren_string.charAt(curr_start_index) != '(') {
                System.out.println("Error: Input to this function is a string containing multiple groups of nested parentheses.");
                return null;
            }
            curr_end_index = paren_string.indexOf(')', curr_start_index);
            if(curr_end_index == -1) {
                System.out.println("Error: Input to this function is a string containing multiple groups of nested parentheses.");
                return null;
            }
            groups.add(paren_string.substring(curr_start_index, curr_end_index+1));
            curr_start_index = curr_end_index+1;
            if(curr_start_index == paren_string.length()) {
                break;
            }
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
