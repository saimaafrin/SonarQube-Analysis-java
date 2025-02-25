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

        int n = a.length();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = a.charAt(i) - '0';
            arr1[i] = b.charAt(i) - '0';
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0 && arr1[i] == 0) {
                sb.append("0");
            }
            else if(arr[i] == 0 && arr1[i] == 1) {
                sb.append("1");
            }
            else if(arr[i] == 1 && arr1[i] == 0) {
                sb.append("1");
            }
            else {
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
