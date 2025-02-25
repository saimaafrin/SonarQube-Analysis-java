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

        StringBuffer binary = new StringBuffer("");
        // Your code is here!
        // convert N to a binary string
        // you can use the toBinaryString method on the Long object
        // Long.toBinaryString(N)
        binary.append(Long.toBinaryString(N));
        // sum up the digits of the binary string
        // String.chars() gives you a stream of integers representing the
        // Unicode value of each character in the string
        long sum = binary.toString().chars().map(c -> (int) c).sum();
        // convert sum to a string
        return String.valueOf(sum);
    }
    public static void main(String[] args) {
    assert(solve((1000l)).equals(("1")));
    assert(solve((150l)).equals(("110")));
    assert(solve((147l)).equals(("1100")));
    assert(solve((333l)).equals(("1001")));
    assert(solve((963l)).equals(("10010")));
    }

}
