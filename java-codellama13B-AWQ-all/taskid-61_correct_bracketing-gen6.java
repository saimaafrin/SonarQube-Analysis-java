import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // brackets is a string of "(" and ")".
    // return true if every opening bracket has a corresponding closing bracket.
    // >>> correctBracketing(("("))
    // (false)
    // >>> correctBracketing(("()"))
    // (true)
    // >>> correctBracketing(("(()())"))
    // (true)
    // >>> correctBracketing((")(()"))
    // (false)
    public static boolean correctBracketing(String brackets) {

        // Create a stack and add the first bracket to it.
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            char c = brackets.charAt(i);
            if (c == '(') {
                stack.add(c);
            } else {
                // This is a closing bracket.
                if (stack.size() == 0) {
                    // There are no opening brackets.
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.size() == 0;
    }
    public static void main(String[] args) {
    assert(correctBracketing(("()")) == (true));
    assert(correctBracketing(("(()())")) == (true));
    assert(correctBracketing(("()()(()())()")) == (true));
    assert(correctBracketing(("()()((()()())())(()()(()))")) == (true));
    assert(correctBracketing(("((()())))")) == (false));
    assert(correctBracketing((")(()")) == (false));
    assert(correctBracketing(("(")) == (false));
    assert(correctBracketing(("((((")) == (false));
    assert(correctBracketing((")")) == (false));
    assert(correctBracketing(("(()")) == (false));
    assert(correctBracketing(("()()(()())())(()")) == (false));
    assert(correctBracketing(("()()(()())()))()")) == (false));
    }

}
