import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a positive integer n. You have to create an integer array array list a of length n.
    // For each i (1 ≤ i ≤ n), the value of a[i] = i * i - i + 1.
    // Return the number of triples (a[i], a[j], a[k]) of a where i < j < k, 
    // and a[i] + a[j] + a[k] is a multiple of 3.
    // Example :
    // >>> getMaxTriples((5l))
    // (1l)
    // Explanation: 
    // a = [1, 3, 7, 13, 21]
    // The only valid triple is (1, 7, 13).
    public static long getMaxTriples(long n) {

        // The array a is defined as: a[i] = i * i - i + 1
        // Hence, it can be represented by the following function: f(i) = i * i - i + 1
        // The sum of a[i], a[j], a[k] = f(i) + f(j) + f(k)
        // Since it needs to be a multiple of 3, the following is true:
        // f(i) + f(j) + f(k) = 3 * m
        // ... (1)
        // We can further rewrite the formula as:
        // i * i - i + 1 + j * j - j + 1 + k * k - k + 1 = 3 * m
        // ... (2)
        // By expanding (2), we get:
        // i * i + j * j + k * k - i - j - k + 3 = 3 * m
        // ... (3)
        // Simplifying (3), we get:
        // 2 * (i * i + j * j + k * k) - 3 * (i + j + k) + 3 = 3 * m
        // ... (4)
        // The first term of (4) is evenly divisible by 3, so the only thing that needs to be considered is:
        // 3 * (i + j + k) - 3 = 3 * m
        // ... (5)
        // By rearranging (5), we get:
        // i + j + k = m
        // ... (6)
        // From (6), we know that there is some integer m that satisfies the equation.
        // We need to find the maximum value of m such that the equation is satisfied.
        // To do this, we need to find the largest value of i + j + k such that i + j + k < n.
        // The largest value of i + j + k is when i = j = k = n - 1.
        // In that case, i + j + k = 3 * (n - 1).
        // If 3 * (n - 1) < n, then m = 3 * (n - 1).
        // If 3 * (n - 1) >= n, then m = n - 1.
        // The number of triples (a[i], a[j], a[k]) of a is the number of solutions to (6),
        // where 1 <= i < j < k <= n.
        // Hence, the answer is the number of solutions to (6), where 1 <= i < j < k <= n.
        // The number of solutions to (6) can be calculated using the following formula:
        // (n * (n - 1) * (n - 2)) / (3 * 2)
        // ... (7)
        // By simplifying (7), we get:
        // (n * (n - 1) * (n - 2)) / 6
        // ... (8)
        // The final answer is the value of (8), where n is the input number.
        // If 3 * (n - 1) < n, then the final answer is the value of (8), where n is n - 1.
        // If 3
    }
    public static void main(String[] args) {
    assert(getMaxTriples((5l)) == (1l));
    assert(getMaxTriples((6l)) == (4l));
    assert(getMaxTriples((10l)) == (36l));
    assert(getMaxTriples((100l)) == (53361l));
    }

}
