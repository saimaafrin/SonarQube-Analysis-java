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

        return arr.stream().sorted((a,b) -> {
            int aCount = countBits(a);
            int bCount = countBits(b);
            if (aCount != bCount) return aCount - bCount;
            else return a.compareTo(b);
        }).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
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
