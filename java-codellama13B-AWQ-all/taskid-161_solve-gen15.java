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

        char[] ch = s.toCharArray();
        if (s.length() == 0) {
            return "";
        }
        if (Character.isLetter(ch[0])) {
            if (Character.isUpperCase(ch[0])) {
                ch[0] = Character.toLowerCase(ch[0]);
            } else {
                ch[0] = Character.toUpperCase(ch[0]);
            }
        }
        boolean isLetter = false;
        for (int i = 1; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                isLetter = true;
                if (Character.isUpperCase(ch[i])) {
                    ch[i] = Character.toLowerCase(ch[i]);
                } else {
                    ch[i] = Character.toUpperCase(ch[i]);
                }
            } else {
                ch[i] = ch[i];
            }
        }
        if (isLetter) {
            return new String(ch);
        } else {
            return new StringBuffer(s).reverse().toString();
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
