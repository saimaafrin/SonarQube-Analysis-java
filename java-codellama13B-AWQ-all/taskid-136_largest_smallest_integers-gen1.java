import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that returns a pair (a, b), where 'a' is
    // the largest of negative integers, and 'b' is the smallest
    // of positive integers in an array array list.
    // If there is no negative or positive integers, return them as null.
    // Examples:
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)1l, (long)3l, (long)5l, (long)7l))))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(1l))
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList())))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)0l))))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))
    public static Pair<Optional<Long>, Optional<Long>> largestSmallestIntegers(ArrayList<Long> lst) {

        Optional<Long> largest = Optional.of(null);
        Optional<Long> smallest = Optional.of(null);
        boolean negative = false;
        boolean positive = false;
        for (Long i : lst) {
            if (i < 0) {
                negative = true;
                if (largest.isPresent()) {
                    largest = Optional.of(Math.max(largest.get(), i));
                } else {
                    largest = Optional.of(i);
                }
            } else if (i > 0) {
                positive = true;
                if (smallest.isPresent()) {
                    smallest = Optional.of(Math.min(smallest.get(), i));
                } else {
                    smallest = Optional.of(i);
                }
            }
        }
        if (!negative && !positive) {
            return Pair.with(Optional.of(null), Optional.of(null));
        } else if (!negative) {
            return Pair.with(Optional.of(null), smallest);
        } else if (!positive) {
            return Pair.with(largest, Optional.of(null));
        } else {
            return Pair.with(largest, smallest);
        }
    }
    public static void main(String[] args) {
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)1l, (long)3l, (long)5l, (long)7l)))).equals(Pair.with(Optional.of(Optional.empty()), Optional.of(1l))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)1l, (long)3l, (long)5l, (long)7l, (long)0l)))).equals(Pair.with(Optional.of(Optional.empty()), Optional.of(1l))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)4l, (long)5l, (long)6l, (long)-2l)))).equals(Pair.with(-2l, 1l)));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)4l, (long)5l, (long)3l, (long)6l, (long)2l, (long)7l, (long)-7l)))).equals(Pair.with(-7l, 2l)));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)7l, (long)3l, (long)8l, (long)4l, (long)9l, (long)2l, (long)5l, (long)-9l)))).equals(Pair.with(-9l, 2l)));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList()))).equals(Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)0l)))).equals(Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)-1l, (long)-3l, (long)-5l, (long)-6l)))).equals(Pair.with(Optional.of(-1l), Optional.of(Optional.empty()))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)-1l, (long)-3l, (long)-5l, (long)-6l, (long)0l)))).equals(Pair.with(Optional.of(-1l), Optional.of(Optional.empty()))));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)-6l, (long)-4l, (long)-4l, (long)-3l, (long)1l)))).equals(Pair.with(-3l, 1l)));
    assert(largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)-6l, (long)-4l, (long)-4l, (long)-3l, (long)-100l, (long)1l)))).equals(Pair.with(-3l, 1l)));
    }

}
