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

        if(n < 4) {
            return false;
        }
        long[] arr = new long[4];
        for(int i = 0; i < 4; i++) {
            arr[i] = 2;
        }
        long sum = 0;
        int p = 0;
        while(sum != n) {
            sum = arr[p] + arr[p + 1] + arr[p + 2] + arr[p + 3];
            if(sum > n) {
                return false;
            }
            arr[p] += 2;
            p++;
        }
        return true;
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
