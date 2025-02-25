import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that takes a string as input which contains only square brackets.
    // The function should return true if and only if there is a valid subsequence of brackets 
    // where at least one bracket in the subsequence is nested.
    // >>> isNested(("[[]]"))
    // (true)
    // >>> isNested(("[]]]]]]][[[[[]"))
    // (false)
    // >>> isNested(("[][]"))
    // (false)
    // >>> isNested(("[]"))
    // (false)
    // >>> isNested(("[[][]]"))
    // (true)
    // >>> isNested(("[[]][["))
    // (true)
    public static boolean isNested(String string) {

        int leftBracketCounter = 0;
        int rightBracketCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '[') {
                leftBracketCounter++;
            }
            if (string.charAt(i) == ']') {
                rightBracketCounter++;
            }
        }
        // The number of left brackets needs to be equal to the number of right brackets in order for the string to be valid
        if (leftBracketCounter == rightBracketCounter) {
            // The string is valid if at least one left bracket is nested within another
            for (int i = 0; i < string.length() - 1; i++) {
                if (string.charAt(i) == '[' && string.charAt(i + 1) == ']') {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
    assert(isNested(("[[]]")) == (true));
    assert(isNested(("[]]]]]]][[[[[]")) == (false));
    assert(isNested(("[][]")) == (false));
    assert(isNested(("[]")) == (false));
    assert(isNested(("[[[[]]]]")) == (true));
    assert(isNested(("[]]]]]]]]]]")) == (false));
    assert(isNested(("[][][[]]")) == (true));
    assert(isNested(("[[]")) == (false));
    assert(isNested(("[]]")) == (false));
    assert(isNested(("[[]][[")) == (true));
    assert(isNested(("[[][]]")) == (true));
    assert(isNested(("")) == (false));
    assert(isNested(("[[[[[[[[")) == (false));
    assert(isNested(("]]]]]]]]")) == (false));
    }

}
