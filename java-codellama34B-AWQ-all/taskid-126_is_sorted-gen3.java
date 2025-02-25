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

        // Create a copy of the list to iterate through
        ArrayList<Long> lst_copy = new ArrayList<Long>(lst);
        // Initialize prev_num to 0, since we know that the list is of integers and can't be negative
        long prev_num = 0L;
        // Iterate through each number in the list
        for (long num : lst_copy) {
            // If this number is less than the previous number, return false
            if (num < prev_num) {
                return false;
            }
            // Set the previous number to the current number
            prev_num = num;
            // Remove the current number from the copy of the list
            lst_copy.remove(Long.valueOf(num));
        }
        // If the copy of the list is empty, return true
        if (lst_copy.size() == 0) {
            return true;
        }
        // Return false
        return false;
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
