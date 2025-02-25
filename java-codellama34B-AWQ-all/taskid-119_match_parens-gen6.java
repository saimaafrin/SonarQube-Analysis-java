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

        if (lst.size() == 0)
            return "Yes";
        String str1 = lst.get(0);
        String str2 = lst.get(1);
        if (str1.length() == 0 && str2.length() == 0)
            return "Yes";
        if (str1.length() == 0 || str2.length() == 0)
            return "No";
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '(')
                s.push(str1.charAt(i));
            else {
                if (s.size() == 0)
                    return "No";
                s.pop();
            }
        }
        if (s.size() == 0)
            return "Yes";
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == ')') {
                if (s.size() == 0)
                    return "No";
                s.pop();
            } else {
                s.push(str2.charAt(i));
            }
        }
        if (s.size() == 0)
            return "Yes";
        return "No";
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
