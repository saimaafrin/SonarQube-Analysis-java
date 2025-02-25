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

        long a, b, c, d, left, right;
        boolean intersection = false;
        a = interval1.getValue0();
        b = interval1.getValue1();
        c = interval2.getValue0();
        d = interval2.getValue1();
        // Sort the intervals
        if(a > b) {
            left = b;
            right = a;
        } else {
            left = a;
            right = b;
        }
        if(c > d) {
            a = d;
            b = c;
        } else {
            a = c;
            b = d;
        }
        // Determine whether the intervals intersect
        if((right > a) && (left < b)) {
            intersection = true;
        }
        if(intersection) {
            long len = right - left;
            if((len == 2) || (len == 3) || (len == 5) || (len == 7) || (len == 11) || (len == 13) || (len == 17) || (len == 19) || (len == 23) || (len == 29) || (len == 31) || (len == 37) || (len == 41) || (len == 43) || (len == 47) || (len == 53) || (len == 59) || (len == 61) || (len == 67) || (len == 71) || (len == 73) || (len == 79) || (len == 83) || (len == 89) || (len == 97) || (len == 101) || (len == 103) || (len == 107) || (len == 109) || (len == 113) || (len == 127) || (len == 131) || (len == 137) || (len == 139) || (len == 149) || (len == 151) || (len == 157) || (len == 163) || (len == 167) || (len == 173) || (len == 179) || (len == 181) || (len == 191) || (len == 193) || (len == 197) || (len == 199) || (len == 211) || (len == 223) || (len == 227) || (len == 229) || (len == 2
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
