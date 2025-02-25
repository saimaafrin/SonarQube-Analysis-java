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

        char[] sArr = s.toCharArray();
        int lastLetter = -1;
        for(int i = 0; i < sArr.length; i++) {
            if(Character.isLetter(sArr[i])) {
                lastLetter = i;
            }
        }
        for(int i = 0; i <= lastLetter; i++) {
            if(Character.isLowerCase(sArr[i])) {
                sArr[i] = Character.toUpperCase(sArr[i]);
            } else {
                sArr[i] = Character.toLowerCase(sArr[i]);
            }
        }
        return new String(sArr);
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
