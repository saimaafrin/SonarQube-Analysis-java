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

        // check for size of array list
        if (l.size() <= 1) {
            return false;
        }
        // sort the array list
        Collections.sort(l);
        // create a set to store the elements of the array list
        HashSet<Long> s = new HashSet<Long>();
        for (Long x : l) {
            s.add(x);
        }
        // create an iterator for the set
        Iterator<Long> it = s.iterator();
        // create two long variables, a and b
        Long a, b;
        // create two boolean variables, found and found_duplicate
        boolean found = false;
        boolean found_duplicate = false;
        // iterate over the set
        while (it.hasNext()) {
            // if a duplicate element is found, set found_duplicate to true
            if (s.contains(a = it.next())) {
                found_duplicate = true;
            }
            // if a is negative, set b to its absolute value
            if (a < 0) {
                b = -a;
            } else {
                // otherwise, set b to a
                b = a;
            }
            // check if b is in the set
            if (s.contains(b)) {
                // if a and b are equal, the set contains a duplicate
                if (a == b) {
                    found_duplicate = true;
                }
                // if found and found_duplicate are both true, return true
                if (found && found_duplicate) {
                    return true;
                }
                // if found is false, set found to true and set found_duplicate to false
                if (!found) {
                    found = true;
                    found_duplicate = false;
                }
            }
        }
        // if a duplicate element is found, set found_duplicate to true
        if (s.contains(a = it.next())) {
            found_duplicate = true;
        }
        // if found and found_duplicate are both true, return true
        if (found && found_duplicate) {
            return true;
        }
        // otherwise, return false
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
