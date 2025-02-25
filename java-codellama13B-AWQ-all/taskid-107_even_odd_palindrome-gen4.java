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

        // The number of integer palindromes is equal to the number of integers
        // less than n that have the same value as the reversed version of that
        // integer.  Since a palindrome has the same number of digits as the
        // original integer, and each digit is equal to the corresponding digit
        // in the original integer (reversed), the number of integer palindromes
        // will be half of the number of integers in the range [1,n] (inclusive).
        // Since n is odd, there will be one odd palindrome in the range [1,n].
        // Since n is even, there will be n/2 even palindromes in the range [1,n].
        // For example, when n is 12, there are 6 even palindromes: 1, 2, 3, 4, 5, 6.
        // When n is 13, there is 1 odd palindrome: 1.
        long numPalindromes = n / 2;
        if (n % 2 == 1) {
            numPalindromes++;
        }
        return Pair.with(numPalindromes, n - numPalindromes);
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
