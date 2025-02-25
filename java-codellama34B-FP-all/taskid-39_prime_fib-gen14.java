import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // prime_fib returns n-th number that is a Fibonacci number and it's also prime.
    // >>> primeFib((1l))
    // (2l)
    // >>> primeFib((2l))
    // (3l)
    // >>> primeFib((3l))
    // (5l)
    // >>> primeFib((4l))
    // (13l)
    // >>> primeFib((5l))
    // (89l)
    public static long primeFib(long n) {

        long a = 0;
        long b = 1;
        long c = 0;
        long d = 1;
        long i = 0;
        long j = 0;
        long k = 0;
        long l = 0;
        long m = 0;
        long s = 0;
        long t = 0;
        long w = 0;
        long z = 0;
        // f(n) = f(n-1) + f(n-2)
        // f(n-1) = a * f(m) + b * f(m+1)
        // f(n-2) = c * f(m) + d * f(m+1)
        // f(n-1) * f(n-2) = (ad - bc) * f(m) * f(m+1)
        // f(n) = (a * d - b * c) * f(m) * f(m+1) + (a * b + c * d) * f(m+1) * f(m+2)
        //
        // f(n) = f(n-1) + f(n-2)
        // a * b + c * d = 1
        // a * d - b * c = 0
        // a^2 - b^2 = 1
        // (a - b) * (a + b) = 1
        // (a - b) = 1
        // (a + b) = 1
        // a = 1/sqrt(5)
        // b = 1/sqrt(5)
        // c = (-1/sqrt(5))
        // d = 1/sqrt(5)
        //
        // f(n) = (1/sqrt(5)) * (f(m) * f(m+1) * sqrt(5) - f(m+1) * f(m+2)) + (1/sqrt(5))^2 * f(m+1) * f(m+2)
        // f(n) = f(m) * f(m+1) * sqrt(5) - f(m+1) * f(m+2) + f(m+1) * f(m+2)
        // f(n) = f(m) * f(m+1) * sqrt(5)
        //
        // f(n) = f(m) * f(m+1) * sqrt(5)
        // f(m) * f(m+1) = phi^m / sqrt(5)
        // f(m+1) * f(m+2) = phi^(m+1) / sqrt(5)
        // phi is the golden ratio (1 + sqrt(5)) / 2
        //
        // f(m) * f(m+1) * sqrt(5) = phi^(m) * phi^(m+1) / 5
        // f(n) = phi^(m) * phi^(m+1) / 5
        //
        // f(m) * f(m+1) = phi^m / sqrt(5)
        // f(m+1) * f(m+2) = phi^(m+1) / sqrt(5)
        //
        // phi = (1 + sqrt(5)) / 2
        // phi = 1.618033988749895
        //
    }
    public static void main(String[] args) {
    assert(primeFib((1l)) == (2l));
    assert(primeFib((2l)) == (3l));
    assert(primeFib((3l)) == (5l));
    assert(primeFib((4l)) == (13l));
    assert(primeFib((5l)) == (89l));
    assert(primeFib((6l)) == (233l));
    assert(primeFib((7l)) == (1597l));
    assert(primeFib((8l)) == (28657l));
    assert(primeFib((9l)) == (514229l));
    assert(primeFib((10l)) == (433494437l));
    }

}
