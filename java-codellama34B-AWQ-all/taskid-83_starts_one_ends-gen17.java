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

        if (n == 1)
            return 1;
        long firstDigit = 9;
        long lastDigit = 1;
        long endsOne = firstDigit * ((n - 1) * 9) + lastDigit;
        long startsOne = lastDigit * (n * 9);
        long endsEnds = endsOne + startsOne;
        return endsEnds;
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
