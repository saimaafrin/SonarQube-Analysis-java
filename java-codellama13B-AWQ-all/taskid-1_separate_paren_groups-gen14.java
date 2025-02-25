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

        // Use this to generate separate strings.
        ArrayList<String> list = new ArrayList<String>();
        // You can create a string and append to it if you want.
        // StringBuilder sb = new StringBuilder();
        // You can use this to get the length of the string.
        // int length = paren_string.length();
        // Iterate over the string and append characters to sb.
        // When you reach an unbalanced open brace, add it to the list.
        int i = 0;
        String temp = "";
        while (i < paren_string.length()) {
            if (paren_string.charAt(i) == '(') {
                temp += paren_string.charAt(i);
                if (isBalanced(temp)) {
                    list.add(temp);
                    temp = "";
                }
            } else if (paren_string.charAt(i) == ')') {
                temp += paren_string.charAt(i);
                if (isBalanced(temp)) {
                    list.add(temp);
                    temp = "";
                }
            } else {
                temp += paren_string.charAt(i);
            }
            i++;
        }
        if (temp.length() > 0 && isBalanced(temp)) {
            list.add(temp);
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
