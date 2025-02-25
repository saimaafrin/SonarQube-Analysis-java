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

        // check the edge case where the input array list contains less than
        // 2 elements
        if (l.size() < 2) {
            return false;
        }
        // create a set containing the absolute values of the elements in the
        // input array list
        Set<Long> s = new HashSet<Long>();
        for (Long x : l) {
            s.add(x.longValue() < 0 ? -x : x);
        }
        // loop through the absolute values and check for pairs that sum to
        // zero
        for (Long x : s) {
            if (s.contains(x.longValue() * (-1))) {
                return true;
            }
        }
        // if no pairs sum to zero, return false
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
