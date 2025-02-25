import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given an array array list of two strings, both strings consist of open
    // parentheses '(' or close parentheses ')' only.
    // Your job is to check if it is possible to concatenate the two strings in
    // some order, that the resulting string will be good.
    // A string S is considered to be good if and only if all parentheses in S
    // are balanced. For example: the string '(())()' is good, while the string
    // '())' is not.
    // Return 'Yes' if there's a way to make a good string, and return 'No' otherwise.
    // Examples:
    // >>> matchParens((new ArrayList<String>(Arrays.asList((String)"()(", (String)")"))))
    // ("Yes")
    // >>> matchParens((new ArrayList<String>(Arrays.asList((String)")", (String)")"))))
    // ("No")
    public static String matchParens(ArrayList<String> lst) {

        String a = (String) lst.get(0), b = (String) lst.get(1);
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            if (x == '(') {
                c++;
            } else if (x == ')') {
                if (c == 0) {
                    return "No";
                }
                c--;
            }
        }
        c = 0;
        for (int i = 0; i < b.length(); i++) {
            char x = b.charAt(i);
            if (x == '(') {
                c++;
            } else if (x == ')') {
                if (c == 0) {
                    return "No";
                }
                c--;
            }
        }
        if (c != 0) {
            return "No";
        }
        String s = a + b;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(') {
                c++;
            } else if (x == ')') {
                if (c == 0) {
                    return "No";
                }
                c--;
            }
        }
        if (c != 0) {
            return "No";
        }
        return "Yes";
    }
    public static void main(String[] args) {
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)"()(", (String)")")))).equals(("Yes")));
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)")", (String)")")))).equals(("No")));
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)"(()(())", (String)"())())")))).equals(("No")));
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)")())", (String)"(()()(")))).equals(("Yes")));
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)"(())))", (String)"(()())((")))).equals(("Yes")));
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)"()", (String)"())")))).equals(("No")));
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)"(()(", (String)"()))()")))).equals(("Yes")));
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)"((((", (String)"((())")))).equals(("No")));
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)")(()", (String)"(()(")))).equals(("No")));
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)")(", (String)")(")))).equals(("No")));
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)"(", (String)")")))).equals(("Yes")));
    assert(matchParens((new ArrayList<String>(Arrays.asList((String)")", (String)"(")))).equals(("Yes")));
    }

}
