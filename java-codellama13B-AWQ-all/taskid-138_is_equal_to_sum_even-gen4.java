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

        if (n <= 3 || n % 2 == 1) {
            return false;
        } else {
            long n_squared = (long) Math.pow(n, 2);
            for (long i = n_squared; i > n - 4; i--) {
                long j = n_squared - i;
                if (j <= 3 || j % 2 == 1) {
                    continue;
                }
                long k = n_squared - j;
                if (k <= 3 || k % 2 == 1) {
                    continue;
                }
                long l = n_squared - k;
                if (l <= 3 || l % 2 == 1) {
                    continue;
                }
                long m = n_squared - l;
                if (m <= 3 || m % 2 == 1) {
                    continue;
                }
                if (i + j + k + l == n_squared) {
                    return true;
                }
            }
            return false;
        }
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
