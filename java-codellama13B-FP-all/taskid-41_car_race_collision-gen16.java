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

        long c = 0;
        // 1 car
        if (n == 1) return 0;
        // 2 cars
        if (n == 2) return 1;
        // 3 cars
        if (n == 3) return 1;
        // 4 cars
        if (n == 4) return 2;
        // 5 cars
        if (n == 5) return 2;
        // 6 cars
        if (n == 6) return 3;
        // 7 cars
        if (n == 7) return 3;
        // 8 cars
        if (n == 8) return 4;
        // 9 cars
        if (n == 9) return 4;
        // 10 cars
        if (n == 10) return 5;
        // 11 cars
        if (n == 11) return 5;
        // 12 cars
        if (n == 12) return 6;
        // 13 cars
        if (n == 13) return 6;
        // 14 cars
        if (n == 14) return 7;
        // 15 cars
        if (n == 15) return 7;
        // 16 cars
        if (n == 16) return 8;
        // 17 cars
        if (n == 17) return 8;
        // 18 cars
        if (n == 18) return 9;
        // 19 cars
        if (n == 19) return 9;
        // 20 cars
        if (n == 20) return 10;
        // 21 cars
        if (n == 21) return 10;
        // 22 cars
        if (n == 22) return 11;
        // 23 cars
        if (n == 23) return 11;
        // 24 cars
        if (n == 24) return 12;
        // 25 cars
        if (n == 25) return 12;
        // 26 cars
        if (n == 26) return 13;
        // 27 cars
        if (n == 27) return 13;
        // 28 cars
        if (n == 28) return 14;
        // 29 cars
        if (n == 29) return 14;
        // 30 cars
        if (n == 30) return 15;
        // 31 cars
        if (n == 31) return 15;
        // 32 cars
        if (n == 32) return 16;
        // 33 cars
        if (n == 33) return 16;
        // 34 cars
        if (n == 34) return 17;
        // 35 cars
        if (n == 35) return 17;
        // 36 cars
        if (n == 36) return 18;
        // 37 cars
        if (n == 37) return 18;
        // 38 cars
        if (n == 38)
    }
    public static void main(String[] args) {
    assert(carRaceCollision((2l)) == (4l));
    assert(carRaceCollision((3l)) == (9l));
    assert(carRaceCollision((4l)) == (16l));
    assert(carRaceCollision((8l)) == (64l));
    assert(carRaceCollision((10l)) == (100l));
    }

}
