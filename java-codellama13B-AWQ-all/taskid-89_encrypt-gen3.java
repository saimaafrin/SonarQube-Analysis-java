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

        // Create a char array of the original string.
        char[] arr = s.toCharArray();
        
        // Create a for loop to iterate through each character of the string.
        for (int i = 0; i < arr.length; i++) {
            // Use a switch statement to determine what letter to replace it with based on the letter and the index.
            switch (arr[i]) {
                case 'a':
                case 'b':
                case 'c':
                    arr[i] = 'w';
                    break;
                case 'd':
                case 'e':
                case 'f':
                    arr[i] = 'e';
                    break;
                case 'g':
                case 'h':
                case 'i':
                    arr[i] = 'k';
                    break;
                case 'j':
                case 'k':
                case 'l':
                    arr[i] = 'm';
                    break;
                case 'm':
                case 'n':
                case 'o':
                    arr[i] = 'n';
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    arr[i] = 's';
                    break;
                case 't':
                case 'u':
                case 'v':
                    arr[i] = 't';
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    arr[i] = 'z';
                    break;
            }
        }
        
        // Return the encrypted string.
        return String.valueOf(arr);
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
