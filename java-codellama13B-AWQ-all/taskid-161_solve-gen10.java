import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a string s.
    // if s[i] is a letter, reverse its case from lower to upper or vise versa, 
    // otherwise keep it as it is.
    // If the string contains no letters, reverse the string.
    // The function should return the resulted string.
    // Examples
    // >>> solve(("1234"))
    // ("4321")
    // >>> solve(("ab"))
    // ("AB")
    // >>> solve(("#a@C"))
    // ("#A@c")
    public static String solve(String s) {

        // Your code here
        char[] c = s.toCharArray();
        boolean letter = false;
        for (int i = 0; i < c.length; i++) {
            if (Character.isLetter(c[i])) {
                letter = true;
                if (Character.isUpperCase(c[i])) {
                    c[i] = Character.toLowerCase(c[i]);
                } else if (Character.isLowerCase(c[i])) {
                    c[i] = Character.toUpperCase(c[i]);
                }
            }
        }
        if (!letter) {
            String reverse = new StringBuilder(s).reverse().toString();
            return reverse;
        } else {
            return String.valueOf(c);
        }
    }
    public static void main(String[] args) {
    assert(solve(("AsDf")).equals(("aSdF")));
    assert(solve(("1234")).equals(("4321")));
    assert(solve(("ab")).equals(("AB")));
    assert(solve(("#a@C")).equals(("#A@c")));
    assert(solve(("#AsdfW^45")).equals(("#aSDFw^45")));
    assert(solve(("#6@2")).equals(("2@6#")));
    assert(solve(("#$a^D")).equals(("#$A^d")));
    assert(solve(("#ccc")).equals(("#CCC")));
    }

}
