import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // In this Kata, you have to sort an array array list of non-negative integers according to
    // number of ones in their binary representation in ascending order.
    // For similar number of ones, sort based on decimal value.
    // It must be implemented like this:
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)2l, (long)3l, (long)4l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l)))
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)-2l, (long)-3l, (long)-4l, (long)-5l, (long)-6l))))
    // (new ArrayList<Long>(Arrays.asList((long)-6l, (long)-5l, (long)-4l, (long)-3l, (long)-2l)))
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)1l, (long)0l, (long)2l, (long)3l, (long)4l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)2l, (long)3l, (long)4l)))
    public static ArrayList<Long> sortArray(ArrayList<Long> arr) {

        // 1. Make a list of pairs of numbers and their binary string
        // 2. Sort that list by the second value, which is the binary
        // 3. Return the first element of the sorted list
        // The method you'll use to sort an ArrayList is .sort()
        // It takes an anonymous Comparator class as an argument
        // Look up Comparator and how to implement a Comparator
        // The Comparator class should compare two instances of Pair<Long,String>
        // and return their relative positions
        ArrayList<Pair<Long, String>> sorted = new ArrayList<>();
        arr.stream().forEach(n -> {
            sorted.add(new Pair<Long, String>(n, Long.toBinaryString(n)));
        });
        sorted.sort((Pair<Long, String> a, Pair<Long, String> b) -> {
            if (a.getValue1().length() > b.getValue1().length()) {
                return 1;
            } else if (a.getValue1().length() < b.getValue1().length()) {
                return -1;
            } else {
                if (a.getValue0() > b.getValue0()) {
                    return 1;
                } else if (a.getValue0() < b.getValue0()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        ArrayList<Long> out = new ArrayList<>();
        sorted.stream().forEach(s -> out.add(s.getValue0()));
        return out;
    }
    public static void main(String[] args) {
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)2l, (long)3l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)3l, (long)5l)))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)-2l, (long)-3l, (long)-4l, (long)-5l, (long)-6l)))).equals((new ArrayList<Long>(Arrays.asList((long)-4l, (long)-2l, (long)-6l, (long)-5l, (long)-3l)))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)1l, (long)0l, (long)2l, (long)3l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)2l, (long)4l, (long)3l)))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)5l, (long)77l, (long)4l, (long)5l, (long)3l, (long)5l, (long)7l, (long)2l, (long)3l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)4l, (long)4l, (long)3l, (long)3l, (long)5l, (long)5l, (long)5l, (long)7l, (long)77l)))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)3l, (long)6l, (long)44l, (long)12l, (long)32l, (long)5l)))).equals((new ArrayList<Long>(Arrays.asList((long)32l, (long)3l, (long)5l, (long)6l, (long)12l, (long)44l)))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)8l, (long)16l, (long)32l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)8l, (long)16l, (long)32l)))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)8l, (long)16l, (long)32l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)8l, (long)16l, (long)32l)))));
    }

}
