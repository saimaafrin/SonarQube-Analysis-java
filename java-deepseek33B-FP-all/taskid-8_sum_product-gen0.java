import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given array list of integers, return a pair consisting of a sum and a product of all the integers in an array array list.
    // Empty sum should be equal to 0 and empty product should be equal to 1.
    // >>> sumProduct((new ArrayList<Long>(Arrays.asList())))
    // (Pair.with(0l, 1l))
    // >>> sumProduct((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))))
    // (Pair.with(10l, 24l))
    public static Pair<Long, Long> sumProduct(ArrayList<Long> numbers) {

        long sum = 0;
        long product = 1;
        for (long number : numbers) {
            sum += number;
            product *= number;
        }
        return Pair.with(sum, product);
    }
    public static void main(String[] args) {
    assert(sumProduct((new ArrayList<Long>(Arrays.asList()))).equals((Pair.with(0l, 1l))));
    assert(sumProduct((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l)))).equals((Pair.with(3l, 1l))));
    assert(sumProduct((new ArrayList<Long>(Arrays.asList((long)100l, (long)0l)))).equals((Pair.with(100l, 0l))));
    assert(sumProduct((new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)7l)))).equals((Pair.with(15l, 105l))));
    assert(sumProduct((new ArrayList<Long>(Arrays.asList((long)10l)))).equals((Pair.with(10l, 10l))));
    }

}
