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

        char[] chars = paren_string.replaceAll("\\s", "").toCharArray();
        ArrayList<String> result = new ArrayList<String>();
        int index = 0;
        int depth = 0;
        while(index < chars.length) {
            char cur = chars[index];
            if (cur == '(') {
                depth++;
                int start = index;
                while (depth > 0) {
                    index++;
                    if (index >= chars.length) {
                        break;
                    }
                    cur = chars[index];
                    if (cur == '(') {
                        depth++;
                    }
                    if (cur == ')') {
                        depth--;
                    }
                }
                if (depth == 0) {
                    result.add(new String(Arrays.copyOfRange(chars, start, index+1)));
                } else {
                    throw new RuntimeException("Unbalanced!");
                }
            }
            index++;
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
