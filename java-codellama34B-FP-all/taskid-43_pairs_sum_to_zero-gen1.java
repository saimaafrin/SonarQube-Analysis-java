import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // pairs_sum_to_zero takes an array array list of integers as an input.
    // it returns true if there are two distinct elements in the array list that
    // sum to zero, and false otherwise.
    // >>> pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)5l, (long)0l))))
    // (false)
    // >>> pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)-2l, (long)1l))))
    // (false)
    // >>> pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)7l))))
    // (false)
    // >>> pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)-5l, (long)3l, (long)5l, (long)7l))))
    // (true)
    // >>> pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)1l))))
    // (false)
    public static boolean pairsSumToZero(ArrayList<Long> l) {

        // We can solve this problem in n log n time with the following strategy:
        //
        // 1. First sort the input array.
        // 2. Iterate through the input array. For each index i, find the closest
        // index j such that j is to the right of i and the sum of the two
        // numbers is 0. We can use binary search to find j.
        //
        // We can also solve this problem in n^2 time with the following
        // strategy:
        //
        // 1. For each index i, we iterate through the rest of the array
        // starting at i+1, and see if we can find an element that is the
        // negative of the element at index i.
        //
        // Your task is to implement both solutions.
        //
        //
        // This function takes an array list of integers as input.
        // It returns true if there are two distinct elements in the array list
        // that sum to zero, and false otherwise.
        //
        // This function should run in O(n log n) time.
        // l.sort(Comparator.naturalOrder());
        // for (int i = 0; i < l.size(); i++) {
        //     long x = l.get(i);
        //     long target = -1 * x;
        //     int left = i + 1;
        //     int right = l.size() - 1;
        //     while (left <= right) {
        //         int middle = (left + right) / 2;
        //         long y = l.get(middle);
        //         if (y == target) {
        //             return true;
        //         } else if (y < target) {
        //             left = middle + 1;
        //         } else {
        //             right = middle - 1;
        //         }
        //     }
        // }
        // return false;

        // Implement the correct solution here.
        l.sort(Comparator.naturalOrder());
        for (int i = 0; i < l.size(); i++) {
            long x = l.get(i);
            long target = -1 * x;
            for (int j = i + 1; j < l.size(); j++) {
                long y = l.get(j);
                if (y == target) {
                    return true;
                } else if (y > target) {
                    break;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
    assert(pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)5l, (long)0l)))) == (false));
    assert(pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)-2l, (long)1l)))) == (false));
    assert(pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)7l)))) == (false));
    assert(pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)-5l, (long)3l, (long)5l, (long)7l)))) == (true));
    assert(pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)1l)))) == (false));
    assert(pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)-3l, (long)9l, (long)-1l, (long)3l, (long)2l, (long)30l)))) == (true));
    assert(pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)-3l, (long)9l, (long)-1l, (long)3l, (long)2l, (long)31l)))) == (true));
    assert(pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)-3l, (long)9l, (long)-1l, (long)4l, (long)2l, (long)30l)))) == (false));
    assert(pairsSumToZero((new ArrayList<Long>(Arrays.asList((long)-3l, (long)9l, (long)-1l, (long)4l, (long)2l, (long)31l)))) == (false));
    }

}
