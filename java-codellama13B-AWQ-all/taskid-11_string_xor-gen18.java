import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input are two strings a and b consisting only of 1s and 0s.
    // Perform binary XOR on these inputs and return result also as a string.
    // >>> stringXor(("010"), ("110"))
    // ("100")
    public static String stringXor(String a, String b) {

        // Perform binary XOR on these inputs and return result also as a string.
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        // convert String to int
        for(int i = 0;i<a.length();i++) {
            if(a.charAt(i)=='1') {
                c = c+1;
            }
        }
        // convert String to int
        for(int i = 0;i<b.length();i++) {
            if(b.charAt(i)=='1') {
                d = d+1;
            }
        }
        // convert int to binary
        String binary = Integer.toBinaryString(c^d);
        // convert binary to String
        if(binary.length()==4) {
            binary = binary.replace("1","");
            binary = binary.replace("0","");
            if(binary.length()==3) {
                binary = "0"+binary;
            }
            binary = "0"+binary;
        }
        else if(binary.length()==3) {
            binary = binary.replace("1","");
            binary = binary.replace("0","");
            if(binary.length()==2) {
                binary = "00"+binary;
            }
            binary = "00"+binary;
        }
        else if(binary.length()==2) {
            binary = binary.replace("1","");
            binary = binary.replace("0","");
            if(binary.length()==1) {
                binary = "000"+binary;
            }
            binary = "000"+binary;
        }
        else if(binary.length()==1) {
            binary = binary.replace("1","");
            binary = binary.replace("0","");
            if(binary.length()==0) {
                binary = "0000"+binary;
            }
            binary = "0000"+binary;
        }
        // convert String to int
        for(int i = 0;i<binary.length();i++) {
            if(binary.charAt(i)=='1') {
                e = e+1;
            }
        }
        // convert String to int
        for(int i = 0;i<binary.length();i++) {
            if(binary.charAt(i)=='1') {
                f = f+1;
            }
        }
        // convert String to int
        for(int i = 0;i<binary.length();i++) {
            if(binary.charAt(i)=='1') {
                g = g+1;
            }
        }
        // convert String to int
        for(int i = 0;i<binary.length();i++) {
            if(binary.charAt(i)=='1') {
                h = h+1;
            }
        }
        if(binary.length()==4) {
            if((c+d)==(e+f+g+h)) {
                return binary;
            }
        }
        else if(binary.length()==3) {
            if((c+d)==(e+f+g+h)) {
                return binary;
            }
        }
        else if(binary.length()==2) {
            if((c+d)==(e+f+g+h)) {
                return binary;
            }
        }
        else if(binary.length()==1) {
            if((c+d)==(e+f+g+h)) {
                return binary;
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
