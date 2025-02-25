import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function encrypt that takes a string as an argument and
    // returns a string encrypted with the alphabet being rotated. 
    // The alphabet should be rotated in a manner such that the letters 
    // shift down by two multiplied to two places.
    // For example:
    // >>> encrypt(("hi"))
    // ("lm")
    // >>> encrypt(("asdfghjkl"))
    // ("ewhjklnop")
    // >>> encrypt(("gf"))
    // ("kj")
    // >>> encrypt(("et"))
    // ("ix")
    public static String encrypt(String s) {

        String cipher = "";
        int a = 'a';
        int z = 'z';
        int A = 'A';
        int Z = 'Z';
        for (int i = 0; i < s.length(); i++) {
            int j = (int) s.charAt(i);
            if (j >= a && j <= z) {
                j += 2;
                if (j > z)
                    j = (j - z) - 1 + a;
                cipher += (char) j;
            } else if (j >= A && j <= Z) {
                j += 2;
                if (j > Z)
                    j = (j - Z) - 1 + A;
                cipher += (char) j;
            } else {
                cipher += s.charAt(i);
            }
        }
        return cipher;
    }
    public static void main(String[] args) {
    assert(encrypt(("hi")).equals(("lm")));
    assert(encrypt(("asdfghjkl")).equals(("ewhjklnop")));
    assert(encrypt(("gf")).equals(("kj")));
    assert(encrypt(("et")).equals(("ix")));
    assert(encrypt(("faewfawefaewg")).equals(("jeiajeaijeiak")));
    assert(encrypt(("hellomyfriend")).equals(("lippsqcjvmirh")));
    assert(encrypt(("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh")).equals(("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl")));
    assert(encrypt(("a")).equals(("e")));
    }

}
