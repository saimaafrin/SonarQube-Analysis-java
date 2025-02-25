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

        // Stack for opening brackets.
        Stack<Character> opening = new Stack<Character>();
        // For every character in the input string:
        for (char c : string.toCharArray()) {
            // If the current character is an opening bracket:
            if (c == '[') {
                // Push it onto the stack of opening brackets.
                opening.push(c);
            }
            // If the current character is a closing bracket:
            else {
                // If there are no more closing brackets to match,
                if (opening.isEmpty()) {
                    // return false
                    return false;
                }
                // Pop the top opening bracket from the stack.
                opening.pop();
            }
        }
        // If there are no more brackets to match,
        if (!opening.isEmpty()) {
            // return false
            return false;
        }
        // Otherwise, return true.
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
