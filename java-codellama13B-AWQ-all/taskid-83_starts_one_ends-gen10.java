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

        long nDigits = (long)Math.pow(10, n);
        long count = nDigits;
        long digits = n - 1;
        long count1 = count;
        for (int i = 1; i <= digits; i++) {
            count1 /= 10;
        }
        count -= count1;
        long count2 = count;
        for (int i = 1; i <= digits; i++) {
            count2 /= 10;
        }
        count -= count2;
        long count3 = count;
        for (int i = 1; i <= digits; i++) {
            count3 /= 10;
        }
        count -= count3;
        return count;
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
