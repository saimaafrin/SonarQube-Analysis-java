import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
    // Example
    // >>> isEqualToSumEven((4l))
    // (false)
    // >>> isEqualToSumEven((6l))
    // (false)
    // >>> isEqualToSumEven((8l))
    // (true)
    public static boolean isEqualToSumEven(long n) {

        // 1) We have that: n = a + b + c + d
        // 2) So we have: n - a = b + c + d
        // 3) So we have: (n-a)/2 = b + c + d
        // 4) So we have: n - a is even
        // 5) So we have: a is even
        // 6) So we have: a = 2p (with p integer)
        // 7) So we have: n - 2p = b + c + d
        // 8) So we have: (n-2p)/2 = b + c + d
        // 9) So we have: n - 2p is even
        // 10) So we have: b + c + d is even
        // 11) So we have: b is even
        // 12) So we have: b = 2q (with q integer)
        // 13) So we have: n - 2p = 2q + c + d
        // 14) So we have: (n-2p - 2q)/2 = c + d
        // 15) So we have: n - 2p - 2q is even
        // 16) So we have: c + d is even
        // 17) So we have: c is even
        // 18) So we have: c = 2r (with r integer)
        // 19) So we have: n - 2p - 2q = 2r + d
        // 20) So we have: (n-2p-2q - 2r)/2 = d
        // 21) So we have: n - 2p - 2q - 2r is even
        // 22) So we have: d is even
        // 23) So we have: d = 2s (with s integer)
        // 24) So we have: n - 2p - 2q - 2r = 2s
        // 25) So we have: n = 2p + 2q + 2r + 2s
        // 26) So we have: n = 2(p+q+r+s)
        long p = 0;
        long q = 0;
        long r = 0;
        long s = 0;
        if (n % 2 == 0) {
            p = n / 2;
            if (p % 2 == 0) {
                q = p / 2;
                if (q % 2 == 0) {
                    r = q / 2;
                    if (r % 2 == 0) {
                        s = r / 2;
                        if (s % 2 == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
    assert(isEqualToSumEven((4l)) == (false));
    assert(isEqualToSumEven((6l)) == (false));
    assert(isEqualToSumEven((8l)) == (true));
    assert(isEqualToSumEven((10l)) == (true));
    assert(isEqualToSumEven((11l)) == (false));
    assert(isEqualToSumEven((12l)) == (true));
    assert(isEqualToSumEven((13l)) == (false));
    assert(isEqualToSumEven((16l)) == (true));
    }

}
