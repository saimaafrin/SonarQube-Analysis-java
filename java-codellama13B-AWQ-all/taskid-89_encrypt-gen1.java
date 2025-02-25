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

        String a = "";
        int s1 = s.length();
        for (int i = 0; i < s1; i++) {
            if (s.charAt(i) == 'a') {
                a += "x";
            } else if (s.charAt(i) == 'b') {
                a += "y";
            } else if (s.charAt(i) == 'c') {
                a += "z";
            } else if (s.charAt(i) == 'd') {
                a += "a";
            } else if (s.charAt(i) == 'e') {
                a += "b";
            } else if (s.charAt(i) == 'f') {
                a += "c";
            } else if (s.charAt(i) == 'g') {
                a += "d";
            } else if (s.charAt(i) == 'h') {
                a += "e";
            } else if (s.charAt(i) == 'i') {
                a += "f";
            } else if (s.charAt(i) == 'j') {
                a += "g";
            } else if (s.charAt(i) == 'k') {
                a += "h";
            } else if (s.charAt(i) == 'l') {
                a += "i";
            } else if (s.charAt(i) == 'm') {
                a += "j";
            } else if (s.charAt(i) == 'n') {
                a += "k";
            } else if (s.charAt(i) == 'o') {
                a += "l";
            } else if (s.charAt(i) == 'p') {
                a += "m";
            } else if (s.charAt(i) == 'q') {
                a += "n";
            } else if (s.charAt(i) == 'r') {
                a += "o";
            } else if (s.charAt(i) == 's') {
                a += "p";
            } else if (s.charAt(i) == 't') {
                a += "q";
            } else if (s.charAt(i) == 'u') {
                a += "r";
            } else if (s.charAt(i) == 'v') {
                a += "s";
            } else if (s.charAt(i) == 'w') {
                a += "t";
            } else if (s.charAt(i) == 'x') {
                a += "u";
            } else if (s.charAt(i) == 'y') {
                a += "v";
            } else if (s.charAt(i) == 'z') {
                a += "w";
            } else if (s.charAt(i) == 'A') {
                a += "X";
            } else if (s.charAt(i) == 'B') {
                a += "Y";
            } else if (s.charAt(i) == 'C') {
                a += "Z";
            } else if (s.charAt(i) == 'D') {
                a += "A";
            } else if (s.charAt(i) == 'E') {
                a += "B";
            } else if (s.charAt(i) == 'F') {
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
