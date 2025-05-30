import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Everyone knows Fibonacci sequence, it was studied deeply by mathematicians in 
    // the last couple centuries. However, what people don't know is Tribonacci sequence.
    // Tribonacci sequence is defined by the recurrence:
    // tri(1) = 3
    // tri(n) = 1 + n / 2, if n is even.
    // tri(n) =  tri(n - 1) + tri(n - 2) + tri(n + 1), if n is odd.
    // For example:
    // tri(2) = 1 + (2 / 2) = 2
    // tri(4) = 3
    // tri(3) = tri(2) + tri(1) + tri(4)
    // = 2 + 3 + 3 = 8 
    // You are given a non-negative integer number n, you have to a return an array array list of the 
    // first n + 1 numbers of the Tribonacci sequence.
    // Examples:
    // >>> tri((3l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)8l)))
    public static ArrayList<Long> tri(long n) {

        long a = 3, b = 1, c = 2, d = 8;
        ArrayList<Long> result = new ArrayList<>();
        if (n >= 0) result.add(a);
        if (n >= 1) result.add(b);
        if (n >= 2) result.add(c);
        if (n >= 3) result.add(d);
        for (long i = 4; i <= n; i++) {
            if (i % 2 == 0) {
                long newElement = 1 + i / 2;
                result.add(newElement);
            } else {
                long newElement = result.get((int) i - 1) + result.get((int) i - 2) + result.get((int) i - 3);
                result.add(newElement);
            }
        }
        return result;
    }
    public static void main(String[] args) {
    assert(tri((3l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)8l)))));
    assert(tri((4l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)8l, (long)3l)))));
    assert(tri((5l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)8l, (long)3l, (long)15l)))));
    assert(tri((6l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)8l, (long)3l, (long)15l, (long)4l)))));
    assert(tri((7l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)8l, (long)3l, (long)15l, (long)4l, (long)24l)))));
    assert(tri((8l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)8l, (long)3l, (long)15l, (long)4l, (long)24l, (long)5l)))));
    assert(tri((9l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)8l, (long)3l, (long)15l, (long)4l, (long)24l, (long)5l, (long)35l)))));
    assert(tri((20l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)8l, (long)3l, (long)15l, (long)4l, (long)24l, (long)5l, (long)35l, (long)6l, (long)48l, (long)7l, (long)63l, (long)8l, (long)80l, (long)9l, (long)99l, (long)10l, (long)120l, (long)11l)))));
    assert(tri((0l)).equals((new ArrayList<Long>(Arrays.asList((long)1l)))));
    assert(tri((1l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l)))));
    }

}
