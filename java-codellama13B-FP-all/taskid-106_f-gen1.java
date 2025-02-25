import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Implement the function f that takes n as a parameter,
    // and returns an array array list of size n, such that the value of the element at index i is the factorial of i if i is even
    // or the sum of numbers from 1 to i otherwise.
    // i starts from 1.
    // the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    // Example:
    // >>> f((5l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l, (long)24l, (long)15l)))
    public static ArrayList<Long> f(long n) {

        // Implement your solution here
        // Implement your solution here
        ArrayList<Long> result = new ArrayList<>();
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                result.add(i);
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            else {
                BigInteger sum = BigInteger.valueOf(1);
                for (int j = 1; j <= i; j++) {
                    sum = sum.add(BigInteger.valueOf(j));
                }
                result.add(sum.longValue());
            }
        }
        return result;
    }
    public static void main(String[] args) {
    assert(f((5l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l, (long)24l, (long)15l)))));
    assert(f((7l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l, (long)24l, (long)15l, (long)720l, (long)28l)))));
    assert(f((1l)).equals((new ArrayList<Long>(Arrays.asList((long)1l)))));
    assert(f((3l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l)))));
    }

}
