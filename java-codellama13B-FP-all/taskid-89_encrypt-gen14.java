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

        String s1 = s.toLowerCase();
        String s2 = "";
        int i = 0;
        for (i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a') {
                s2 += 'c';
            }
            if (s1.charAt(i) == 'b') {
                s2 += 'd';
            }
            if (s1.charAt(i) == 'c') {
                s2 += 'e';
            }
            if (s1.charAt(i) == 'd') {
                s2 += 'f';
            }
            if (s1.charAt(i) == 'e') {
                s2 += 'g';
            }
            if (s1.charAt(i) == 'f') {
                s2 += 'h';
            }
            if (s1.charAt(i) == 'g') {
                s2 += 'i';
            }
            if (s1.charAt(i) == 'h') {
                s2 += 'j';
            }
            if (s1.charAt(i) == 'i') {
                s2 += 'k';
            }
            if (s1.charAt(i) == 'j') {
                s2 += 'l';
            }
            if (s1.charAt(i) == 'k') {
                s2 += 'm';
            }
            if (s1.charAt(i) == 'l') {
                s2 += 'n';
            }
            if (s1.charAt(i) == 'm') {
                s2 += 'o';
            }
            if (s1.charAt(i) == 'n') {
                s2 += 'p';
            }
            if (s1.charAt(i) == 'o') {
                s2 += 'q';
            }
            if (s1.charAt(i) == 'p') {
                s2 += 'r';
            }
            if (s1.charAt(i) == 'q') {
                s2 += 's';
            }
            if (s1.charAt(i) == 'r') {
                s2 += 't';
            }
            if (s1.charAt(i) == 's') {
                s2 += 'u';
            }
            if (s1.charAt(i) == 't') {
                s2 += 'v';
            }
            if (s1.charAt(i) == 'u') {
                s2 += 'w';
            }
            if (s1.charAt(i) == 'v') {
                s2 += 'x';
            }
            if (s1.charAt(i) == 'w') {
                s2 += 'y';
            }
            if (s1.charAt(i) == 'x') {
                s2 += 'z';
            }
            if (s1.charAt(i) == 'y') {
                s2 += 'a';
            }
            if (s1.charAt(i) == 'z') {
                s2 += 'b';
            }
        }
        return s2;
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
