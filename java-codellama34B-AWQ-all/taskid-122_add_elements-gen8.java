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

        // If k is greater than or equal to 100, return all the elements in the array
        if (k >= 100) {
            long result = 0;
            for (long i = 0; i < arr.size(); i++) {
                result += arr.get((int)i);
            }
            return result;
        }
        // Initialize a list of all the numbers with at most two digits
        ArrayList<Long> resultList = new ArrayList<Long>();
        // If a number has at most two digits, add it to the list
        for (long i = 0; i < k; i++) {
            if (String.valueOf(arr.get((int)i)).length() <= 2) {
                resultList.add(arr.get((int)i));
            }
        }
        // Initialize a sum to add up all the numbers in the list
        long result = 0;
        for (long i = 0; i < resultList.size(); i++) {
            result += resultList.get((int)i);
        }
        return result;
    }
    public static void main(String[] args) {
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)1l, (long)-2l, (long)-3l, (long)41l, (long)57l, (long)76l, (long)87l, (long)88l, (long)99l))), (3l)) == (-4l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)111l, (long)121l, (long)3l, (long)4000l, (long)5l, (long)6l))), (2l)) == (0l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)11l, (long)21l, (long)3l, (long)90l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l))), (4l)) == (125l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)111l, (long)21l, (long)3l, (long)4000l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l))), (4l)) == (24l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)1l))), (1l)) == (1l));
    }

}
