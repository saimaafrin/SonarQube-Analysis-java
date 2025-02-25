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

        // Code here
        char[] chars = paren_string.toCharArray();
        int count = 0;
        ArrayList<String> group = new ArrayList<String>();
        StringBuilder str = new StringBuilder();
        for (char c : chars) {
            if (c == '(') {
                str.append(c);
                count++;
            } else if (c == ')') {
                str.append(c);
                count--;
            } else if (c == ' ' && count != 0) {
                str.append(c);
            } else if (c == ' ' && count == 0) {
                group.add(str.toString());
                str = new StringBuilder();
            } else if (c != ' ' && count == 0) {
                group.add(str.toString());
                str = new StringBuilder();
                str.append(c);
            }
        }
        group.add(str.toString());
        return group;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
