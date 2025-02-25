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

        ArrayList<String> list = new ArrayList<>();
        int start = 0, length = paren_string.length();
        while(start < length) {
            // 1st paren
            if(paren_string.charAt(start) == '(') {
                int end = paren_string.indexOf(')', start + 1);
                if(end == -1) break;
                // 2nd paren
                if(paren_string.charAt(end - 1) == ')') {
                    list.add(paren_string.substring(start, end + 1));
                    start = end + 1;
                    continue;
                }
            }
            start++;
        }
        return list;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
