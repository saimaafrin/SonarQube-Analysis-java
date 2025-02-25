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

        // Implement your solution here.
        String encrypt = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char ch1;
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    ch1 = (char) (ch + 5);
                    if (ch1 > 'Z') {
                        ch1 = (char) (ch1 - 26);
                    }
                } else {
                    ch1 = (char) (ch + 5);
                    if (ch1 > 'z') {
                        ch1 = (char) (ch1 - 26);
                    }
                }
                encrypt += ch1;
            } else {
                encrypt += ch;
            }
        }
        return encrypt;
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
