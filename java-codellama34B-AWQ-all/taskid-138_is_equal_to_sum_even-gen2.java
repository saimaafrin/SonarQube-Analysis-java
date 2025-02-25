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

        long limit = n / 2;
        long a = 0, b = 0, c = 0, d = 0;
        long start = 0, end = limit;
        while (start < end) {
            long sum = start + end;
            if (sum == limit) {
                a = start;
                b = end;
                start++;
                end--;
                break;
            }
            if (sum < limit) {
                start++;
            } else {
                end--;
            }
        }
        long remaining = limit - a - b;
        if (remaining % 2 != 0) {
            return false;
        }
        start = 0;
        end = remaining / 2;
        while (start < end) {
            long sum = start + end;
            if (sum == remaining / 2) {
                c = start;
                d = end;
                start++;
                end--;
                break;
            }
            if (sum < remaining / 2) {
                start++;
            } else {
                end--;
            }
        }
        return a * a + b * b + c * c + d * d == n;
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
