import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // From an array array list of integers, remove all elements that occur more than once.
    // Keep order of elements left the same as in the input.
    // >>> removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)4l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)4l)))
    public static ArrayList<Long> removeDuplicates(ArrayList<Long> numbers) {

        // Use a set to keep track of which elements have been seen
        HashSet<Long> seen = new HashSet<Long>();
        // Use an iterator to iterate through the list of numbers
        ListIterator<Long> i = numbers.listIterator();
        // Loop through the list
        while (i.hasNext()) {
            // Get the next element in the list
            Long num = i.next();
            // If the element has been seen before (is in the set)
            if (seen.contains(num)) {
                // Remove the element from the list
                i.remove();
            } else {
                // Otherwise add the element to the set so that we can test for it in the future
                seen.add(num);
            }
        }
        // Return the list
        return numbers;
    }
    public static void main(String[] args) {
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)4l, (long)3l, (long)5l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)5l)))));
    }

}
