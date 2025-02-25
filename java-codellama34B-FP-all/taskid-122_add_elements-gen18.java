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

        // Assign the values of each two digit number to the respective index of an array
        ArrayList<Long> twoDigit = new ArrayList<Long>(Arrays.asList((long)10l, (long)11l, (long)12l, (long)13l, (long)14l, (long)15l, (long)16l, (long)17l, (long)18l, (long)19l, (long)20l, (long)21l, (long)22l, (long)23l, (long)24l, (long)25l, (long)26l, (long)27l, (long)28l, (long)29l, (long)30l, (long)31l, (long)32l, (long)33l, (long)34l, (long)35l, (long)36l, (long)37l, (long)38l, (long)39l, (long)40l, (long)41l, (long)42l, (long)43l, (long)44l, (long)45l, (long)46l, (long)47l, (long)48l, (long)49l, (long)50l, (long)51l, (long)52l, (long)53l, (long)54l, (long)55l, (long)56l, (long)57l, (long)58l, (long)59l, (long)60l, (long)61l, (long)62l, (long)63l, (long)64l, (long)65l, (long)66l, (long)67l, (long)68l, (long)69l, (long)70l, (long)71l, (long)72l, (long)73l, (long)74l, (long)75l, (long)76l, (long)77l, (long)78l, (long)79l, (long)80l, (long)81l, (long)82l, (long)83l, (long)84l, (long)85l, (long)86l, (long)87l, (long)88l, (long)89l, (long)90l, (long)91l, (long)92l, (long)93l, (long)94l, (long)95l, (long)96l, (long)97l, (long)98l, (long)99l));
        // Initialize the sum variable to 0
        long sum = 0l;
        // Iterate through each element in the first k elements of arr
        for (int i = 0; i < k; i++) {
            // Check if the current element is in the twoDigit array
            if (twoDigit.contains(arr.get(i))) {
                // Add the current element to the sum variable
                sum += arr.get(i);
            }
    }
    public static void main(String[] args) {
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)1l, (long)-2l, (long)-3l, (long)41l, (long)57l, (long)76l, (long)87l, (long)88l, (long)99l))), (3l)) == (-4l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)111l, (long)121l, (long)3l, (long)4000l, (long)5l, (long)6l))), (2l)) == (0l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)11l, (long)21l, (long)3l, (long)90l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l))), (4l)) == (125l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)111l, (long)21l, (long)3l, (long)4000l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l))), (4l)) == (24l));
    assert(addElements((new ArrayList<Long>(Arrays.asList((long)1l))), (1l)) == (1l));
    }

}
