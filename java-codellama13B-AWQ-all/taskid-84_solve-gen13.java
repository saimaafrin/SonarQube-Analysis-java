import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer N, return the total sum of its digits in binary.
    // Example
    // >>> solve((1000l))
    // ("1")
    // >>> solve((150l))
    // ("110")
    // >>> solve((147l))
    // ("1100")
    // Variables:
    // @N integer
    // Constraints: 0 ≤ N ≤ 10000.
    // Output:
    // a string of binary number
    public static String solve(long N) {

        String res = "";
        String binary = "";
        for (int i = 0; i < 32; i++) {
            long temp = N;
            if ((temp & 1) == 1) binary = binary + "1";
            else binary = binary + "0";
            N = N >> 1;
        }
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                res += (binary.length() - i - 1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
    assert(solve((1000l)).equals(("1")));
    assert(solve((150l)).equals(("110")));
    assert(solve((147l)).equals(("1100")));
    assert(solve((333l)).equals(("1001")));
    assert(solve((963l)).equals(("10010")));
    }

}
