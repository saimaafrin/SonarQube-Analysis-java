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

        String[] alpha = {
            "abcdefghijklmnopqrstuvwxyz",
            "cdefghijklmnopqrstuvwxyzab",
            "defghijklmnopqrstuvwxyzabc",
            "efghijklmnopqrstuvwxyzabcd",
            "fghijklmnopqrstuvwxyzabcde",
            "ghijklmnopqrstuvwxyzabcdef",
            "hijklmnopqrstuvwxyzabcdefg",
            "ijklmnopqrstuvwxyzabcdefgh",
            "jklmnopqrstuvwxyzabcdefghi",
            "klmnopqrstuvwxyzabcdefghij",
            "lmnopqrstuvwxyzabcdefghijk",
            "mnopqrstuvwxyzabcdefghijkl",
            "nopqrstuvwxyzabcdefghijklm",
            "opqrstuvwxyzabcdefghijklmn",
            "pqrstuvwxyzabcdefghijklmno",
            "qrstuvwxyzabcdefghijklmnop",
            "rstuvwxyzabcdefghijklmnopq",
            "stuvwxyzabcdefghijklmnopqr",
            "tuvwxyzabcdefghijklmnopqrs",
            "uvwxyzabcdefghijklmnopqrst",
            "vwxyzabcdefghijklmnopqrstu",
            "wxyzabcdefghijklmnopqrstuv",
            "xyzabcdefghijklmnopqrstuvw",
            "yzabcdefghijklmnopqrstuvwx",
            "zabcdefghijklmnopqrstuvwxy",
            "abcdefghijklmnopqrstuvwxyz"
        };
        String ret = "";
        for (int i = 0; i < s.length(); i++) {
            ret += alpha[2].charAt(alpha[0].indexOf(s.charAt(i)));
        }
        return ret;
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
