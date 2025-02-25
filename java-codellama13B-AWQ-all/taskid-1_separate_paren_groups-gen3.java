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

        ArrayList<String> result = new ArrayList<>();
        StringBuffer curr_group = new StringBuffer();
        boolean in_parens = false;
        for (int i = 0; i < paren_string.length(); i++) {
            char curr_char = paren_string.charAt(i);
            if (curr_char == '(') {
                in_parens = true;
                curr_group.append(curr_char);
            } else if (curr_char == ')') {
                in_parens = false;
                curr_group.append(curr_char);
            } else if (in_parens) {
                curr_group.append(curr_char);
            }
            if (!in_parens && curr_group.length() != 0) {
                result.add(curr_group.toString());
                curr_group = new StringBuffer();
            }
        }
        if (curr_group.length() != 0) {
            result.add(curr_group.toString());
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
