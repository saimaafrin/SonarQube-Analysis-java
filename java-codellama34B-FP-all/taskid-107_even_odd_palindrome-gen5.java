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

        // Write your code here
        long nn = n;
        long even = 0, odd = 0;
        long min = 0, max = 9;
        while (min <= max) {
            int m = (int) min;
            int M = (int) max;
            boolean[] is_palindrome = new boolean[(int) (max - min + 1)];
            for (int i = 0; i <= 9; i++) {
                int x = i;
                if (x == m || x == M) {
                    is_palindrome[x - m] = true;
                } else {
                    int x0 = x;
                    int x1 = x;
                    while (x0 > 0) {
                        int q = x0 % 10;
                        x1 = (x1 * 10) + q;
                        x0 = x0 / 10;
                    }
                    is_palindrome[x - m] = (x1 == i);
                }
            }
            if (m == M) {
                if (is_palindrome[m - min]) {
                    even += 1;
                    odd += 1;
                }
            } else {
                for (int i = m; i <= M; i++) {
                    if (is_palindrome[i - min]) {
                        even += 1;
                        odd += 1;
                    }
                }
            }
            min = (min * 10) + 1;
            max = (max * 10) + 9;
        }
        return Pair.with(even, odd);
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
