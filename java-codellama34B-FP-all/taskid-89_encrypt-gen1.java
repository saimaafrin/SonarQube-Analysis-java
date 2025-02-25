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

        // Method 1: Using an Array
        // int[] arr = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
        // String[] newArr = new String[s.length()];
        // for(int i = 0; i < s.length(); i++){
        //     newArr[i] = (char) (arr[s.charAt(i) - 'a']);
        // }
        // String str = "";
        // for(int i = 0; i < newArr.length; i++){
        //     str += newArr[i];
        // }
        // return str;

        // Method 2: Using the modulo operator
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                res += (char) ((((s.charAt(i) - 'a' + 2) % 26) + 'a'));
            } else {
                res += " ";
            }
        }
        return res;
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
