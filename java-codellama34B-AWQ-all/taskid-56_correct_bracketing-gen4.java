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

        int leftBrackets = 0;
        for (char bracket : brackets.toCharArray()) {
            if (bracket == '<') {
                leftBrackets++;
            } else {
                leftBrackets--;
            }
            if (leftBrackets < 0) {
                return false;
            }
        }
        return leftBrackets == 0;
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
