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

        if (brackets.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : brackets.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
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
