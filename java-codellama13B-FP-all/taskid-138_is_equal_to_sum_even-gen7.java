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

        long[] arrs = new long[10];
        for (long i = 1; i < n; i++) {
            long s = 0;
            int cnt = 0;
            for (int j = 0; j < arrs.length; j++) {
                if (arrs[j] == i) {
                    continue;
                }
                if (arrs[j] > 0) {
                    s += arrs[j];
                    cnt++;
                }
                if (cnt > 3) {
                    break;
                }
            }
            if (s == n && cnt == 4) {
                return true;
            }
            for (int k = 0; k < arrs.length; k++) {
                if (arrs[k] == 0) {
                    arrs[k] = i;
                    break;
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
