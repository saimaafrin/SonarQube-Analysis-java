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
        ArrayList<String> ans = new ArrayList<>();
        int cnt = 0;
        String tmp = "";
        for (char i : paren_string.toCharArray()) {
            if (i != ' ' && i != '(' && i != ')') {
                throw new IllegalArgumentException("Invalid character!");
            }
            if (i == '(') {
                cnt++;
            } else if (i == ')') {
                cnt--;
            }
            if (cnt < 0) {
                throw new IllegalArgumentException("Unbalanced parenthesis!");
            }
            tmp += i;
            if (cnt == 0 && tmp.length() > 0) {
                ans.add(tmp);
                tmp = "";
            }
        }
        if (cnt != 0) {
            throw new IllegalArgumentException("Unbalanced parenthesis!");
        }
        return ans;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
