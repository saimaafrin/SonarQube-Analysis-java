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

        // I am going to assume that the sturdy cars will not collide.  They are going to pass
        // through each other, but not collide.  So, the cars will have to pass through each other
        // the same number of times as they are going to collide.  In other words, the cars are going
        // to have a "non-collision" as often as they are going to collide.
        // There are two sets of cars, and in the beginning, they are infinitely far away from each other.
        // As they move towards each other, there will be a point in time when the number of cars left to right
        // is equal to the number of cars right to left.  This is the point where they will start passing through
        // each other.  They will pass through each other "n" times.
        return n;
    }
    public static void main(String[] args) {
    assert(carRaceCollision((2l)) == (4l));
    assert(carRaceCollision((3l)) == (9l));
    assert(carRaceCollision((4l)) == (16l));
    assert(carRaceCollision((8l)) == (64l));
    assert(carRaceCollision((10l)) == (100l));
    }

}
