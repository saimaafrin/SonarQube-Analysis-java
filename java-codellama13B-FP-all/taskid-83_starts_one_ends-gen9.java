import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the count of the numbers of n-digit
    // positive integers that start or end with 1.
    public static long startsOneEnds(long n) {

        // 0-9
        // 1-9
        // 10-99
        // 100-999
        // 1000-9999
        // 10000-99999
        // 100000-999999
        // 1000000-9999999
        // 10000000-99999999
        // 100000000-999999999
        long result = 0;
        long maxNumber = (long) Math.pow(10, n) - 1;
        long oneCount = 1;
        long otherCount = 1;
        for (long i = 1; i < n; i++) {
            oneCount = oneCount * 10;
            otherCount = otherCount * 9;
        }
        result += oneCount + otherCount;
        for (long i = 1; i < n; i++) {
            long lastDigit = (maxNumber % 10) - 1;
            long firstDigit = 1;
            result += lastDigit * 10 + firstDigit;
            maxNumber /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
