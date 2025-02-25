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

        // Create a new ArrayList with the first k elements from arr
        // Then sort it in descending order
        // Add elements to a variable which is the sum of all elements
        // in the ArrayList until k elements have been added
        ArrayList<Long> temp = arr.stream().limit(k).sorted(Collections.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += temp.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)1l, (long)-2l, (long)-3l, (long)41l, (long)57l, (long)76l, (long)87l, (long)88l, (long)99l))), (3l)) == (-4l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)111l, (long)121l, (long)3l, (long)4000l, (long)5l, (long)6l))), (2l)) == (0l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)11l, (long)21l, (long)3l, (long)90l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l))), (4l)) == (125l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)111l, (long)21l, (long)3l, (long)4000l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l))), (4l)) == (24l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)1l))), (1l)) == (1l));
    }

}
