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

        var separators = new ArrayList<String>();
        var current = new StringBuilder();
        int i = 0;
        char c = ' ';
        char last = ' ';
        while (i < paren_string.length()) {
            c = paren_string.charAt(i);
            if (c == '(') {
                if (last == ')') {
                    separators.add(current.toString());
                    current = new StringBuilder();
                }
                current.append(c);
            } else if (c == ')') {
                if (last == '(') {
                    separators.add(current.toString());
                    current = new StringBuilder();
                } else {
                    current.append(c);
                }
            } else {
                current.append(c);
            }
            last = c;
            i += 1;
        }
        separators.add(current.toString());
        return separators;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
