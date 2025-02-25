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

        // This is a classic problem of balancing parentheses.
        // It's a simple case of stack usage: you push onto the stack as you encounter
        // an opening parenthesis and pop from the stack as you encounter a closing
        // parenthesis. If at any point the stack is not empty, then the parentheses
        // are not balanced, and you can return False.
        //
        // If you encounter a closing parenthesis when the stack is empty, then the
        // parentheses are not balanced, and you can return False.
        //
        // If you make it through both strings without any mismatched parentheses,
        // then you can return True.
        //
        // I've chosen to use a list rather than a stack, as it's more convenient to
        // work with in Python. This means that the complexity of the algorithm is
        // O(n) rather than O(n log n) as it would be with a stack.
        int cnt = 0;
        // Initialize a stack with a capacity of 1000.
        // This is the maximum number of parentheses that will be encountered.
        ArrayList<String> st = new ArrayList<String>(1000);
        for (String s : lst) {
            if (s.charAt(0) == '(') {
                st.add(s);
                cnt += 1;
            } else {
                if (st.isEmpty()) {
                    return "No";
                } else {
                    st.remove(st.size() - 1);
                    cnt -= 1;
                }
            }
        }
        if (cnt != 0) {
            return "No";
        } else {
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
