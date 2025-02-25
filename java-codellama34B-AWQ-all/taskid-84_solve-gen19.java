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

        if (N == 0) {
            return "0";
        } else if (N == 1) {
            return "1";
        } else {
            StringBuilder builder = new StringBuilder();
            while (N != 1) {
                long[] qr = divide(N, 2);
                builder.append(qr[1]);
                N = qr[0];
            }
            builder.append("1");
            return builder.toString();
        }
    }
    public static void main(String[] args) {
    assert(solve((1000l)).equals(("1")));
    assert(solve((150l)).equals(("110")));
    assert(solve((147l)).equals(("1100")));
    assert(solve((333l)).equals(("1001")));
    assert(solve((963l)).equals(("10010")));
    }

}
