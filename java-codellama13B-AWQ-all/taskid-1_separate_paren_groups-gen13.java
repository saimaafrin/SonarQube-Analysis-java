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

        String temp = paren_string.replaceAll("\\s", "");
        ArrayList<String> temp_list = new ArrayList<String>();
        String temp_str = "";
        int index = 0;
        while (index < temp.length()) {
            if (temp.charAt(index) == '(') {
                int open = 1;
                int close = 0;
                for (int i = index + 1; i < temp.length(); i++) {
                    if (temp.charAt(i) == '(') {
                        open++;
                    } else if (temp.charAt(i) == ')') {
                        close++;
                    }
                    if (open == close) {
                        temp_str += temp.substring(index, i + 1);
                        temp_list.add(temp_str);
                        temp_str = "";
                        index = i + 1;
                        break;
                    }
                }
            } else {
                temp_str += temp.charAt(index);
                index++;
            }
        }
        return temp_list;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
