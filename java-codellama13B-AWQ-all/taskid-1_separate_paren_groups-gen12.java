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

        int startIndex = 0;
        int endIndex = 0;
        char[] paren_array = paren_string.toCharArray();
        ArrayList<String> paren_groups = new ArrayList<String>();
        while (endIndex < paren_array.length) {
            int open_count = 0;
            while (endIndex < paren_array.length) {
                if (paren_array[endIndex] == '(') {
                    open_count += 1;
                } else if (paren_array[endIndex] == ')') {
                    open_count -= 1;
                }
                if (open_count == 0) {
                    break;
                }
                endIndex += 1;
            }
            paren_groups.add(paren_string.substring(startIndex, endIndex));
            startIndex = endIndex;
            if (startIndex == paren_string.length()) {
                break;
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
