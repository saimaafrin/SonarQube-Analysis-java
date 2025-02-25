import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a non-empty array array list of integers arr and an integer k, return
    // the sum of the elements with at most two digits from the first k elements of arr.
    // Example:
    // >>> addElements((new ArrayList<Long>(Arrays.asList((long)111l, (long)21l, (long)3l, (long)4000l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l))), (4l))
    // (24l)
    // Constraints:
    // 1. 1 <= len(arr) <= 100
    // 2. 1 <= k <= len(arr)
    public static long addElements(ArrayList<Long> arr, long k) {

        // Fetch all of the numbers that are 1 digit
        ArrayList<Long> oneDigitArray = new ArrayList<Long>();
        // Fetch all of the numbers that are 2 digits
        ArrayList<Long> twoDigitArray = new ArrayList<Long>();
        // Fetch the first k numbers and add them together
        ArrayList<Long> firstKArray = new ArrayList<Long>();
        for (Long l : arr) {
            // Check if we are under the limit
            if (firstKArray.size() < k) {
                // Add the number
                firstKArray.add(l);
                // Check if we have 1 digit
                if (l < 10) {
                    // Add the number
                    oneDigitArray.add(l);
                } else {
                    // Add the number
                    twoDigitArray.add(l);
                }
            } else {
                // Check if we have 1 digit
                if (l < 10) {
                    // Add the number
                    oneDigitArray.add(l);
                } else {
                    // Add the number
                    twoDigitArray.add(l);
                }
            }
        }
        // Add the numbers
        long total = 0;
        for (Long l : oneDigitArray) {
            total += l;
        }
        for (Long l : twoDigitArray) {
            total += l;
        }
        return total;
    }
    public static void main(String[] args) {
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)1l, (long)-2l, (long)-3l, (long)41l, (long)57l, (long)76l, (long)87l, (long)88l, (long)99l))), (3l)) == (-4l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)111l, (long)121l, (long)3l, (long)4000l, (long)5l, (long)6l))), (2l)) == (0l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)11l, (long)21l, (long)3l, (long)90l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l))), (4l)) == (125l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)111l, (long)21l, (long)3l, (long)4000l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l))), (4l)) == (24l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)1l))), (1l)) == (1l));
    }

}
