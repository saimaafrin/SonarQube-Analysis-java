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

        String s = paren_string.trim();
        List<String> res = new ArrayList<String>();
        while(s.length() > 0) {
            char c = s.charAt(0);
            s = s.substring(1);
            if(c == '(') {
                int i = 0;
                while(i < s.length()) {
                    char x = s.charAt(i);
                    if(x == '(') {
                        i++;
                    } else if(x == ')') {
                        i--;
                    }
                    if(i == 0) break;
                    s = s.substring(1);
                }
                res.add("(" + s.substring(0, s.length()-1) + ")");
                s = s.substring(1);
            } else {
                s = s.substring(1);
            }
        }
        return new ArrayList<String>(res);
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
