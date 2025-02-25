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

        int len = lst.size();
        if (len == 1) {
            return (lst.get(0).length() % 2) == 0 ? "Yes" : "No";
        }
        String a = lst.get(0), b = lst.get(1);
        if (a.length() == 0) {
            return b.length() % 2 == 0 ? "Yes" : "No";
        }
        if (b.length() == 0) {
            return a.length() % 2 == 0 ? "Yes" : "No";
        }
        // We need to make sure that the sum of the length of both strings is even
        // and that both strings have the same number of opening parentheses.
        int sum = a.length() + b.length();
        int a_open = a.replaceAll("[^(]", "").length();
        int b_open = b.replaceAll("[^(]", "").length();
        if (sum % 2 != 0 || a_open != b_open) {
            return "No";
        }
        // We need to make sure that both strings have the same number of opening
        // and closing parentheses.
        int a_close = a.replaceAll("[^)]", "").length();
        int b_close = b.replaceAll("[^)]", "").length();
        if (a_close != b_close) {
            return "No";
        }
        // We need to make sure that the string we're constructing is balanced.
        int bal = 0;
        for (int i = 0; i < a.length(); ++i) {
            if (a.charAt(i) == '(') {
                ++bal;
            } else if (a.charAt(i) == ')') {
                --bal;
            }
            if (bal < 0) {
                return "No";
            }
        }
        for (int i = 0; i < b.length(); ++i) {
            if (b.charAt(i) == ')') {
                --bal;
            } else if (b.charAt(i) == '(') {
                ++bal;
            }
            if (bal < 0) {
                return "No";
            }
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
