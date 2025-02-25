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

        // Initialize a stack to hold the opening brackets.
        // Create a map to hold the closing brackets and their corresponding opening brackets.
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');
        // Iterate through each character in the input string.
        for (char c : string.toCharArray()) {
            // If the current character is an opening bracket, push it onto the stack.
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }
            // If the current character is a closing bracket ...
            else {
                // If the stack is empty, return false.
                if (stack.isEmpty()) {
                    return false;
                }
                // If the top element of the stack is not the corresponding opening bracket, return false.
                else if (map.get(c) != stack.peek()) {
                    return false;
                }
                // Pop the top element off the stack.
                stack.pop();
            }
        }
        // If the stack is not empty, return false.
        if (!stack.isEmpty()) {
            return false;
        }
        // If the string is valid, return true.
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
