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

        if (brackets.length() == 0) {
            return true;
        }
        if (brackets.length() == 1) {
            return false;
        }
        int i = 0;
        int len = brackets.length();
        // System.out.println(brackets);
        while (i < len) {
            if (brackets.charAt(i) == '(') {
                int j = i + 1;
                int n = 0;
                while (j < len) {
                    if (brackets.charAt(j) == '(') {
                        n++;
                    }
                    if (brackets.charAt(j) == ')') {
                        if (n == 0) {
                            break;
                        }
                        n--;
                    }
                    j++;
                }
                if (j == len) {
                    return false;
                }
                brackets = brackets.substring(0, i) + brackets.substring(j + 1, brackets.length());
                len = brackets.length();
            } else {
                i++;
            }
        }
        return len == 0;
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
