import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Imagine a road that's a perfectly straight infinitely long line.
    // n cars are driving left to right;  simultaneously, a different set of n cars
    // are driving right to left.   The two sets of cars start out being very far from
    // each other.  All cars move in the same speed.  Two cars are said to collide
    // when a car that's moving left to right hits a car that's moving right to left.
    // However, the cars are infinitely sturdy and strong; as a result, they continue moving
    // in their trajectory as if they did not collide.
    // This function outputs the number of such collisions.
    public static long carRaceCollision(long n) {

        long a = 0;
        long b = n;
        long c = 0;
        long d = 0;
        long e = 0;
        long f = 0;
        long g = 0;
        while (b - a >= 1 && d - c >= 1) {
            if (a <= b && c <= d && e + f <= g) {
                long h = a;
                long i = c;
                long j = b;
                long k = d;
                a = h;
                c = i;
                b = j;
                d = k;
                e = 0;
                f = 0;
                g = 0;
            }
            a++;
            b--;
            c++;
            d--;
            e = 0;
            f = 0;
            g = 0;
        }
        return e;
    }
    public static void main(String[] args) {
    assert(carRaceCollision((2l)) == (4l));
    assert(carRaceCollision((3l)) == (9l));
    assert(carRaceCollision((4l)) == (16l));
    assert(carRaceCollision((8l)) == (64l));
    assert(carRaceCollision((10l)) == (100l));
    }

}
