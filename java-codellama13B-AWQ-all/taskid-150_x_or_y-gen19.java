import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // A simple program which should return the value of x if n is 
    // a prime number and should return the value of y otherwise.
    // Examples:
    // >>> xOrY((7l), (34l), (12l))
    // (34l)
    // >>> xOrY((15l), (8l), (5l))
    // (5l)
    public static long xOrY(long n, long x, long y) {

        // This is a basic problem description.
        // Given an integer n, returns the value of x if n is a prime number and returns the value of y otherwise.
        // Input Format:
        // The first line contains an integer T i.e. the number of test cases. The next T lines contain three space-separated integers n, x, y.
        // Output Format:
        // Print the value of x if n is a prime number and print the value of y otherwise.
        // Constraints:
        // 1 <= T <= 1000
        // 1 <= n, x, y <= 10^18
        // Subtasks:
        // Subtask #1 (100 points): 1 <= T <= 10, 1 <= n, x, y <= 10^5
        // Subtask #2 (100 points): 1 <= T <= 100, 1 <= n, x, y <= 10^7
        // Subtask #3 (300 points): Original Constraints
        // Sample Input:
        // 2
        // 7 12 34
        // 15 8 5
        // Sample Output:
        // 34
        // 5
        // Explanation:
        // In the first case, 7 is a prime number so print the value of x i.e. 12.
        // In the second case, 15 is not a prime number so print the value of y i.e. 5.
        if (n > 1) {
            for (long i = 2; i < n; i++) {
                if (n % i == 0) {
                    return y;
                }
            }
        }
        return x;
    }
    public static void main(String[] args) {
    assert(xOrY((7l), (34l), (12l)) == (34l));
    assert(xOrY((15l), (8l), (5l)) == (5l));
    assert(xOrY((3l), (33l), (5212l)) == (33l));
    assert(xOrY((1259l), (3l), (52l)) == (3l));
    assert(xOrY((7919l), (-1l), (12l)) == (-1l));
    assert(xOrY((3609l), (1245l), (583l)) == (583l));
    assert(xOrY((91l), (56l), (129l)) == (129l));
    assert(xOrY((6l), (34l), (1234l)) == (1234l));
    assert(xOrY((1l), (2l), (0l)) == (0l));
    assert(xOrY((2l), (2l), (0l)) == (2l));
    }

}
