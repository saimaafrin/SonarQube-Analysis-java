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

        // 1) calculate when the first collision will happen
        // 2) calculate how many cars will collide
        // 3) count the number of collisions

        // 1) the first collision will happen when the first car that's moving left to right
        //    hits the last car that's moving right to left
        long left = 1;
        long right = n;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (mid <= n / 2)
                left = mid + 1;
            else
                right = mid;
        }
        // distance between first collision and the first car moving left to right
        long dist = left - 1;
        // number of cars that will collide
        long collide = Math.min(n / 2, n - n / 2);
        // number of collisions
        return collide * (dist * 2 - 1);
    }
    public static void main(String[] args) {
    assert(carRaceCollision((2l)) == (4l));
    assert(carRaceCollision((3l)) == (9l));
    assert(carRaceCollision((4l)) == (16l));
    assert(carRaceCollision((8l)) == (64l));
    assert(carRaceCollision((10l)) == (100l));
    }

}
