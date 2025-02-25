import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return a pair that has the number of even and odd
    // integer palindromes that fall within the range(1, n), inclusive.
    // Example 1:
    // >>> evenOddPalindrome((3l))
    // (Pair.with(1l, 2l))
    // Explanation:
    // Integer palindrome are 1, 2, 3. one of them is even, and two of them are odd.
    // Example 2:
    // >>> evenOddPalindrome((12l))
    // (Pair.with(4l, 6l))
    // Explanation:
    // Integer palindrome are 1, 2, 3, 4, 5, 6, 7, 8, 9, 11. four of them are even, and 6 of them are odd.
    // Note:
    // 1. 1 <= n <= 10^3
    // 2. returned pair has the number of even and odd integer palindromes respectively.
    public static Pair<Long, Long> evenOddPalindrome(long n) {

        long[] count = new long[1];
        long[] dp = new long[3];
        // count[0] = number of even palindromes, count[1] = number of odd palindromes
        count[0] = dp[0] = dp[1] = dp[2] = 0;
        for (long i = 1; i <= n; i++) {
            // Check if i is palindrome
            int j = 0;
            int k = 0;
            long t = i;
            while (t != 0) {
                int c = t % 10;
                if (c == j)
                    k++;
                else if (c == k)
                    j++;
                else
                    break;
                t /= 10;
            }
            if (k == 0) {
                dp[(int) (i % 3)] += 1;
            } else if (k == 1) {
                dp[(int) (i % 3)] += 1;
                count[(int) (i % 2)] += 1;
            } else if (k == 2) {
                dp[(int) (i % 3)] += 1;
                count[(int) (i % 2)] += 1;
            }
            count[0] += dp[0];
            count[1] += dp[1];
        }
        return Pair.with(count[0], count[1]);
    }
    public static void main(String[] args) {
    assert(evenOddPalindrome((123l)).equals((Pair.with(8l, 13l))));
    assert(evenOddPalindrome((12l)).equals((Pair.with(4l, 6l))));
    assert(evenOddPalindrome((3l)).equals((Pair.with(1l, 2l))));
    assert(evenOddPalindrome((63l)).equals((Pair.with(6l, 8l))));
    assert(evenOddPalindrome((25l)).equals((Pair.with(5l, 6l))));
    assert(evenOddPalindrome((19l)).equals((Pair.with(4l, 6l))));
    assert(evenOddPalindrome((9l)).equals((Pair.with(4l, 5l))));
    assert(evenOddPalindrome((1l)).equals((Pair.with(0l, 1l))));
    }

}
