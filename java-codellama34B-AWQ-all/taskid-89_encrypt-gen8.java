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

        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String c = "0123456789";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (a.contains(Character.toString(ch))) {
                int num = a.indexOf(ch);
                num += 2;
                if (num >= 26)
                    num -= 26;
                ans += a.charAt(num);
            } else if (b.contains(Character.toString(ch))) {
                int num = b.indexOf(ch);
                num += 2;
                if (num >= 26)
                    num -= 26;
                ans += b.charAt(num);
            } else if (c.contains(Character.toString(ch))) {
                int num = c.indexOf(ch);
                num += 2;
                if (num >= 10)
                    num -= 10;
                ans += c.charAt(num);
            } else {
                ans += ch;
            }
        }
        return ans;
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
