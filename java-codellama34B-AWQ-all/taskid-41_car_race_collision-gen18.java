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

        if (n % 2 != 0) {
            return 0;
        }
        // We know the cars are infinitely sturdy, so they will never
        // collide with each other once they have collided.
        // As a result, the number of collisions for the first set of cars
        // will be equal to the number of collisions for the second set of cars.
        // As a result, we only need to calculate for the first set of cars.

        // The first car will collide with the last car, the second car
        // will collide with the second to last car, and so on.
        // The number of cars is even, so we can determine that the first car
        // will always collide with the last car in the first set.
        // As a result, we can deduce that the number of collisions will always be
        // equal to the total number of cars divided by 2.
        return n / 2;
    }
    public static void main(String[] args) {
    assert(carRaceCollision((2l)) == (4l));
    assert(carRaceCollision((3l)) == (9l));
    assert(carRaceCollision((4l)) == (16l));
    assert(carRaceCollision((8l)) == (64l));
    assert(carRaceCollision((10l)) == (100l));
    }

}
