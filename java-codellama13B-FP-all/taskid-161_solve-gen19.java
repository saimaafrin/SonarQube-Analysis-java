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

        char[] arr = s.toCharArray();
        boolean found = false;
        for (char c : arr) {
            if (Character.isLetter(c)) {
                found = true;
                break;
            }
        }
        if (!found) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    arr[i] = Character.toUpperCase(arr[i]);
                } else {
                    arr[i] = Character.toLowerCase(arr[i]);
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (Character.isLowerCase(arr[i])) {
                    arr[i] = Character.toUpperCase(arr[i]);
                } else {
                    arr[i] = Character.toLowerCase(arr[i]);
                }
            }
        }
        return String.valueOf(arr);
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
