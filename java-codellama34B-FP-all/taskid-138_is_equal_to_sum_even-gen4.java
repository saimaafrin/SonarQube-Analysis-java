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

        ArrayList<Long> evens = new ArrayList<Long>();
        //write your code here
        for (long i = 2; i <= n; i = i + 2) {
            evens.add(i);
        }
        for (long i = 0; i < evens.size() - 3; i++) {
            for (long j = i + 1; j < evens.size() - 2; j++) {
                for (long k = j + 1; k < evens.size() - 1; k++) {
                    long sum = evens.get(i) + evens.get(j) + evens.get(k);
                    if (sum == n) {
                        return true;
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
