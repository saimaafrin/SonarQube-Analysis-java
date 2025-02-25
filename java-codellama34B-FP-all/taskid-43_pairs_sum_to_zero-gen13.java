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

        // HashSet<Long> numbers = new HashSet<Long>(l);
        // for (Long number : numbers) {
        //     if (numbers.contains(-number)) {
        //         return true;
        //     }
        // }
        // return false;

        // return l.stream().collect(Collectors.toSet()).stream().anyMatch(x -> l.stream().anyMatch(y -> x.longValue() + y.longValue() == 0l));

        // HashSet<Long> seen = new HashSet<Long>();
        // return l.stream().anyMatch(x -> seen.contains(-x) || (seen.add(x)));
        for (int i = 0; i < l.size(); i++) {
            if (l.indexOf(-l.get(i)) != -1 && l.indexOf(-l.get(i)) != i) {
                return true;
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
