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

        char[] cArr = string.toCharArray();
        int leftBrackets = 0;
        int rightBrackets = 0;
        for (char c : cArr) {
            if (c == '[') {
                leftBrackets++;
            } else {
                rightBrackets++;
            }
        }
        if (leftBrackets == rightBrackets) {
            return false;
        }
        return true;
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
