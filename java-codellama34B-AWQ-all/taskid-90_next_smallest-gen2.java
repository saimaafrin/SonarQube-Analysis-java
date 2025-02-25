import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given an array array list of integers.
    // Write a function next_smallest() that returns the 2nd smallest element of the array list.
    // Return null if there is no such element.
    // >>> nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l))))
    // 2l
    // >>> nextSmallest((new ArrayList<Long>(Arrays.asList((long)5l, (long)1l, (long)4l, (long)3l, (long)2l))))
    // 2l
    // >>> nextSmallest((new ArrayList<Long>(Arrays.asList())))
    // Optional.empty()
    // >>> nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l))))
    // Optional.empty()
    public static Optional<Long> nextSmallest(ArrayList<Long> lst) {

        ArrayList<Long> sorted = new ArrayList<>(lst);
        sorted.sort(null);
        Long smallest = sorted.get(0);
        int smallest_index = 0;
        for (int i = 0; i < sorted.size(); i++) {
            if (sorted.get(i) > smallest) {
                smallest = sorted.get(i);
                smallest_index = i;
                break;
            }
        }
        if (smallest_index + 1 < sorted.size()) {
            return Optional.of(sorted.get(smallest_index + 1));
        } else {
            return Optional.empty();
        }
    }
    public static void main(String[] args) {
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l)))).equals(2l));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)5l, (long)1l, (long)4l, (long)3l, (long)2l)))).equals(2l));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList()))).equals(Optional.empty()));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l)))).equals(Optional.empty()));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l, (long)0l)))).equals(1l));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l)))).equals(Optional.empty()));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)-35l, (long)34l, (long)12l, (long)-45l)))).equals(-35l));
    }

}
