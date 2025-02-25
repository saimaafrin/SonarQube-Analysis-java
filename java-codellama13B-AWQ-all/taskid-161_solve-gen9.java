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

        char[] array = s.toCharArray();
        for(int i=0; i < array.length; i++) {
            if(Character.isLetter(array[i])) {
                if(Character.isUpperCase(array[i])) {
                    array[i] = Character.toLowerCase(array[i]);
                }
                else {
                    array[i] = Character.toUpperCase(array[i]);
                }
            }
        }
        if(array.length == 0) {
            String revString = "";
            for(int i = array.length-1; i >= 0; i--) {
                revString += array[i];
            }
            return revString;
        }
        return new String(array);
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
