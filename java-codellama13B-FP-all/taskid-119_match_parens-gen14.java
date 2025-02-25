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

        String result = "";
        int len = lst.size();
        if (len == 0)
            return "Yes";
        if (len == 1)
            return "No";
        if (len == 2) {
            if (lst.get(0).equals("()") && lst.get(1).equals("()"))
                return "Yes";
            else if (lst.get(0).equals("()") && lst.get(1).equals(")"))
                return "No";
            else if (lst.get(0).equals(")") && lst.get(1).equals("()"))
                return "No";
            else if (lst.get(0).equals(")") && lst.get(1).equals(")"))
                return "No";
            else
                return "Yes";
        }
        if (len >= 3) {
            String str = lst.get(0) + lst.get(1) + lst.get(2);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    count++;
                } else if (str.charAt(i) == ')') {
                    count--;
                }
                if (count < 0) {
                    return "No";
                }
            }
            if (count == 0) {
                result = "Yes";
            } else {
                result = matchParens(new ArrayList<>(lst.subList(1, len)));
            }
        }
        return result;
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
