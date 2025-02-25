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

        String regex = "(\\(|\\))";
        paren_string = paren_string.replaceAll("\\s", "");
        ArrayList<String> result = new ArrayList<>();
        String[] temp = paren_string.split(regex);
        int count = 0;
        for (String x : temp) {
            if (x.equals("("))
                count++;
            if (x.equals(")"))
                count--;
        }
        int start = 0;
        String t = "";
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals("(")) {
                start = i;
                break;
            }
        }
        if (temp[start].equals("(")) {
            for (int i = start; i < temp.length; i++) {
                if (temp[i].equals(")"))
                    break;
                t += temp[i];
            }
            result.add(t);
            t = "";
            start = i + 1;
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
