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

        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                res += 'k';
            }
            else if(s.charAt(i) == 'b'){
                res += 'l';
            }
            else if(s.charAt(i) == 'c'){
                res += 'm';
            }
            else if(s.charAt(i) == 'd'){
                res += 'n';
            }
            else if(s.charAt(i) == 'e'){
                res += 'o';
            }
            else if(s.charAt(i) == 'f'){
                res += 'p';
            }
            else if(s.charAt(i) == 'g'){
                res += 'q';
            }
            else if(s.charAt(i) == 'h'){
                res += 'r';
            }
            else if(s.charAt(i) == 'i'){
                res += 's';
            }
            else if(s.charAt(i) == 'j'){
                res += 't';
            }
            else if(s.charAt(i) == 'k'){
                res += 'u';
            }
            else if(s.charAt(i) == 'l'){
                res += 'v';
            }
            else if(s.charAt(i) == 'm'){
                res += 'w';
            }
            else if(s.charAt(i) == 'n'){
                res += 'x';
            }
            else if(s.charAt(i) == 'o'){
                res += 'y';
            }
            else if(s.charAt(i) == 'p'){
                res += 'z';
            }
            else if(s.charAt(i) == 'q'){
                res += 'a';
            }
            else if(s.charAt(i) == 'r'){
                res += 'b';
            }
            else if(s.charAt(i) == 's'){
                res += 'c';
            }
            else if(s.charAt(i) == 't'){
                res += 'd';
            }
            else if(s.charAt(i) == 'u'){
                res += 'e';
            }
            else if(s.charAt(i) == 'v'){
                res += 'f';
            }
            else if(s.charAt(i) == 'w'){
                res += 'g';
            }
            else if(s.charAt(i) == 'x'){
                res += 'h';
            }
            else if(s.charAt(i) == 'y'){
                res += 'i';
            }
            else if(s.charAt(i) == 'z'){
                res += 'j';
            }
            else{
                res += s.charAt(i);
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
