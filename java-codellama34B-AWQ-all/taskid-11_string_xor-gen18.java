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

        int[] arr = new int[a.length()];
        int[] brr = new int[b.length()];
        for(int i=0; i<a.length(); i++) {
            arr[i] = (int)(a.charAt(i)-'0');
        }
        for(int i=0; i<b.length(); i++) {
            brr[i] = (int)(b.charAt(i)-'0');
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a.length(); i++) {
            if(arr[i]^brr[i]==1) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
    assert(stringXor(("111000"), ("101010")).equals(("010010")));
    assert(stringXor(("1"), ("1")).equals(("0")));
    assert(stringXor(("0101"), ("0000")).equals(("0101")));
    }

}
