import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given two intervals,
    // where each interval is a pair of integers. For example, interval = (start, end) = (1, 2).
    // The given intervals are closed which means that the interval (start, end)
    // includes both start and end.
    // For each given interval, it is assumed that its start is less or equal its end.
    // Your task is to determine whether the length of intersection of these two 
    // intervals is a prime number.
    // Example, the intersection of the intervals (1, 3), (2, 4) is (2, 3)
    // which its length is 1, which not a prime number.
    // If the length of the intersection is a prime number, return "YES",
    // otherwise, return "NO".
    // If the two intervals don't intersect, return "NO".
    // [input/output] samples:
    // >>> intersection((Pair.with(1l, 2l)), (Pair.with(2l, 3l)))
    // ("NO")
    // >>> intersection((Pair.with(-1l, 1l)), (Pair.with(0l, 4l)))
    // ("NO")
    // >>> intersection((Pair.with(-3l, -1l)), (Pair.with(-5l, 5l)))
    // ("YES")
    public static String intersection(Pair<Long, Long> interval1, Pair<Long, Long> interval2) {

        if (interval1._0 == interval2._0 && interval1._1 == interval2._1)
            return "YES";
        long min1 = Math.min(interval1._0, interval1._1);
        long max1 = Math.max(interval1._0, interval1._1);
        long min2 = Math.min(interval2._0, interval2._1);
        long max2 = Math.max(interval2._0, interval2._1);
        if (min2 > max1 || max2 < min1)
            return "NO";
        long length = Math.min(max1, max2) - Math.max(min1, min2);
        return isPrime(length) ? "YES" : "NO";
    }
    public static void main(String[] args) {
    assert(intersection((Pair.with(1l, 2l)), (Pair.with(2l, 3l))).equals(("NO")));
    assert(intersection((Pair.with(-1l, 1l)), (Pair.with(0l, 4l))).equals(("NO")));
    assert(intersection((Pair.with(-3l, -1l)), (Pair.with(-5l, 5l))).equals(("YES")));
    assert(intersection((Pair.with(-2l, 2l)), (Pair.with(-4l, 0l))).equals(("YES")));
    assert(intersection((Pair.with(-11l, 2l)), (Pair.with(-1l, -1l))).equals(("NO")));
    assert(intersection((Pair.with(1l, 2l)), (Pair.with(3l, 5l))).equals(("NO")));
    assert(intersection((Pair.with(1l, 2l)), (Pair.with(1l, 2l))).equals(("NO")));
    assert(intersection((Pair.with(-2l, -2l)), (Pair.with(-3l, -2l))).equals(("NO")));
    }

}
