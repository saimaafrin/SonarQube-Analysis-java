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

        String o = "";
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (c >= 65 && c <= 66) {
                c += 2;
            } else if (c >= 67 && c <= 68) {
                c += 2;
            } else if (c >= 69 && c <= 70) {
                c += 2;
            } else if (c >= 71 && c <= 72) {
                c += 2;
            } else if (c >= 73 && c <= 74) {
                c += 2;
            } else if (c >= 75 && c <= 76) {
                c += 2;
            } else if (c >= 77 && c <= 78) {
                c += 2;
            } else if (c >= 79 && c <= 80) {
                c += 2;
            } else if (c >= 81 && c <= 82) {
                c += 2;
            } else if (c >= 83 && c <= 84) {
                c += 2;
            } else if (c >= 85 && c <= 86) {
                c += 2;
            } else if (c >= 87 && c <= 88) {
                c += 2;
            } else if (c >= 89 && c <= 90) {
                c += 2;
            } else if (c >= 97 && c <= 98) {
                c += 2;
            } else if (c >= 99 && c <= 100) {
                c += 2;
            } else if (c >= 101 && c <= 102) {
                c += 2;
            } else if (c >= 103 && c <= 104) {
                c += 2;
            } else if (c >= 105 && c <= 106) {
                c += 2;
            } else if (c >= 107 && c <= 108) {
                c += 2;
            } else if (c >= 109 && c <= 110) {
                c += 2;
            } else if (c >= 111 && c <= 112) {
                c += 2;
            } else if (c >= 113 && c <= 114) {
                c += 2;
            } else if (c >= 115 && c <= 116) {
                c += 2;
            } else if (c >= 117 && c <= 118) {
                c += 2;
            } else if (c >= 119 && c <= 120) {
                c += 2;
            } else if (c >= 121 && c <= 122) {
                c += 2;
            }
            if (c > 122) {
                c -= 26;
            }
            char ch = (char) c;
            o += ch;
        }
        return o;
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
