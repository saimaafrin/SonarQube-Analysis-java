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

        if (n <= 1)
            return 1;
        long[][] dp = new long[2][(int) n + 1];
        for (int i = 1; i <= n; i++) {
            dp[0][i] = dp[0][i - 1] * 10 + 1;
            dp[1][i] = dp[1][i - 1] + 1;
        }
        return (dp[0][(int) n] + dp[1][(int) n]) % (1000000007);
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
