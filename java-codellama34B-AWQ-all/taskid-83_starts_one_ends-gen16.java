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

        if (n < 10) {
            return 2;
        }
        if (n < 100) {
            return 20;
        }
        long sum = 0;
        long divisor = 10;
        for (int i = 2; i < n; i++) {
            long ones = i % 10;
            sum += 10 - ones;
            if (ones == 1) {
                sum += 9;
            } else {
                sum += 1;
            }
            divisor *= 10;
        }
        sum += divisor;
        return sum;
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
