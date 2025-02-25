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

        if(n <= 1)
            return n;
        long dp[][] = new long[(int)n][2];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j++) {
                dp[i][j] = 0;
            }
        }
        dp[0][0] = 1; dp[0][1] = 1;
        for(int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][1] * 9;
            dp[i][1] = dp[i - 1][0] + dp[i - 1][1] * 9;
        }
        return dp[n - 1][0] + dp[n - 1][1];
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
