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

        int i = 0;
        int len = paren_string.length();
        ArrayList<String> result = new ArrayList<String>();
        StringBuffer sb = new StringBuffer();
        while (i < len) {
            if (paren_string.charAt(i) == '(') {
                sb.append("(");
                int count = 1;
                i++;
                while (i < len) {
                    if (paren_string.charAt(i) == ')') {
                        if (count == 1) {
                            result.add(sb.toString());
                            sb = new StringBuffer();
                            i++;
                            break;
                        } else {
                            count--;
                            sb.append(")");
                            i++;
                        }
                    } else if (paren_string.charAt(i) == '(') {
                        count++;
                        sb.append("(");
                        i++;
                    } else {
                        sb.append(paren_string.charAt(i));
                        i++;
                    }
                }
            } else {
                i++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
