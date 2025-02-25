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

        // A brute force solution is to iterate through all pairs of numbers
        // in the array list and check if they sum to zero. However, this
        // solution is O(n^2) and will not pass the time limits.
        //
        // One approach is to use a hash table to store the complement of each
        // element. In this case, the complement of a number is the desired
        // number that, when added to the original number, results in zero.
        //
        // We can iterate through each element in the array list and check if
        // its complement is already in the hash table. If it is, we have found
        // a pair of elements that sum to zero.
        //
        // This solution is O(n) and will pass the time limits.
        HashMap<Long, Boolean> h = new HashMap<Long, Boolean>();
        for (int i = 0; i < l.size(); i++) {
            Long c = l.get(i);
            if (h.containsKey(c)) {
                return true;
            } else {
                h.put(-c, true);
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
