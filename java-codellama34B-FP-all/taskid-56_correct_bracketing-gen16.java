import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // brackets is a string of "<" and ">".
    // return true if every opening bracket has a corresponding closing bracket.
    // >>> correctBracketing(("<"))
    // (false)
    // >>> correctBracketing(("<>"))
    // (true)
    // >>> correctBracketing(("<<><>>"))
    // (true)
    // >>> correctBracketing(("><<>"))
    // (false)
    public static boolean correctBracketing(String brackets) {

        Stack<Character> stack = new Stack<Character>();
        for(char b : brackets.toCharArray()) {
            if (b == '<') {
                stack.push('>');
            } else if (stack.isEmpty() || stack.pop() != b) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
    assert(correctBracketing(("<>")) == (true));
    assert(correctBracketing(("<<><>>")) == (true));
    assert(correctBracketing(("<><><<><>><>")) == (true));
    assert(correctBracketing(("<><><<<><><>><>><<><><<>>>")) == (true));
    assert(correctBracketing(("<<<><>>>>")) == (false));
    assert(correctBracketing(("><<>")) == (false));
    assert(correctBracketing(("<")) == (false));
    assert(correctBracketing(("<<<<")) == (false));
    assert(correctBracketing((">")) == (false));
    assert(correctBracketing(("<<>")) == (false));
    assert(correctBracketing(("<><><<><>><>><<>")) == (false));
    assert(correctBracketing(("<><><<><>><>>><>")) == (false));
    }

}
