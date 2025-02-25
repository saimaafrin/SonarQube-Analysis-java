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

        // Write your code here
        ArrayList<String> groups = new ArrayList<String>();
        
        StringBuffer buffer = new StringBuffer(paren_string.length());
        StringBuffer currentGroup = new StringBuffer(paren_string.length());
        int open_count = 0;
        
        for(int i = 0; i < paren_string.length(); i++) {
            char c = paren_string.charAt(i);
            if(c == '(') {
                if(open_count == 0) {
                    groups.add(currentGroup.toString());
                    currentGroup = new StringBuffer();
                }
                currentGroup.append(c);
                open_count++;
            } else if(c == ')') {
                if(open_count > 0) {
                    currentGroup.append(c);
                    open_count--;
                }
            } else if(c == ' ') {
                // ignore the spaces
            } else {
                System.out.println("invalid character: " + c);
            }
        }
        
        groups.add(currentGroup.toString());
        return groups;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
