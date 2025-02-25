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

        String one = lst.get(0);
        String two = lst.get(1);
        System.out.println("Testing: " + one + " and " + two);

        // Find if parens are balanced
        int open = 0;
        int close = 0;
        for (char c : one.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                close++;
            }
        }
        System.out.println("Open: " + open + " and close: " + close);
        if (open != close) {
            System.out.println("Parens not balanced");
            return "No";
        }
        open = 0;
        close = 0;
        for (char c : two.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                close++;
            }
        }
        System.out.println("Open: " + open + " and close: " + close);
        if (open != close) {
            System.out.println("Parens not balanced");
            return "No";
        }

        // If we're here, parens are balanced.
        int totalOpen = 0;
        int totalClose = 0;
        for (char c : one.toCharArray()) {
            if (c == '(') {
                totalOpen++;
            } else {
                totalClose++;
            }
        }
        for (char c : two.toCharArray()) {
            if (c == '(') {
                totalOpen++;
            } else {
                totalClose++;
            }
        }
        System.out.println("Total open: " + totalOpen + " and total close: " + totalClose);
        if (totalOpen == totalClose) {
            System.out.println("Yes, parens are balanced and all are closed");
            return "Yes";
        } else {
            System.out.println("Yes, parens are balanced but all are not closed");
            return "Yes";
        }
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
