import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of numbers, return whether or not they are sorted
    // in ascending order. If array list has more than 1 duplicate of the same
    // number, return false. Assume no negative numbers and only integers.
    // Examples
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)5l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)4l, (long)5l))))
    // (false)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)6l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)6l, (long)7l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)4l, (long)5l, (long)6l, (long)7l))))
    // (false)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)3l, (long)3l, (long)4l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)2l, (long)3l, (long)4l))))
    // (false)
    public static boolean isSorted(ArrayList<Long> lst) {

        // check if all numbers are equal
        if (lst.size() < 2) {
            return true;
        }
        // check if the first number is equal to the last number
        if (lst.get(0).equals(lst.get(lst.size() - 1))) {
            return false;
        }
        // check if there are any duplicates
        if (Stream.of(lst).collect(Collectors.groupingBy(Long::new, Collectors.counting())).values().stream().anyMatch(i -> i > 1)) {
            return false;
        }
        // check if the numbers are sorted in ascending order
        boolean sorted = true;
        for (int i = 0; i < lst.size() - 1; i++) {
            if (lst.get(i) > lst.get(i + 1)) {
                sorted = false;
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)5l)))) == (true));
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l)))) == (true));
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)4l, (long)5l)))) == (false));
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)6l)))) == (true));
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)6l, (long)7l)))) == (true));
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)4l, (long)5l, (long)6l, (long)7l)))) == (false));
    assert(isSorted((new ArrayList<Long>(Arrays.asList()))) == (true));
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)1l)))) == (true));
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)1l)))) == (false));
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)2l, (long)3l, (long)4l)))) == (false));
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)3l, (long)3l, (long)4l)))) == (false));
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)3l, (long)3l, (long)4l)))) == (true));
    assert(isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))) == (true));
    }

}
