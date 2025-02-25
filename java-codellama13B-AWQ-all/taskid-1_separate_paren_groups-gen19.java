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

        if (paren_string == null) {
            return null;
        }
        if (paren_string.isEmpty()) {
            return new ArrayList<String>();
        }
        int open_parens = 0;
        int close_parens = 0;
        StringBuilder group = new StringBuilder();
        ArrayList<String> groups = new ArrayList<String>();
        for (int i = 0; i < paren_string.length(); i++) {
            if (paren_string.charAt(i) == '(') {
                if (open_parens == 0) {
                    if (group.length() > 0) {
                        groups.add(group.toString());
                        group = new StringBuilder();
                    }
                }
                group.append('(');
                open_parens++;
            } else if (paren_string.charAt(i) == ')') {
                group.append(')');
                close_parens++;
                if (open_parens == close_parens) {
                    groups.add(group.toString());
                    group = new StringBuilder();
                    open_parens = 0;
                    close_parens = 0;
                }
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
