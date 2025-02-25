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

        // Create an empty ArrayList to store the unique numbers.
        ArrayList<Long> uniqueNumbers = new ArrayList<Long>();
        // Iterate through the input list
        for (Long number : numbers) {
            // If the current number has not been added to the list yet,
            // add it to the list of unique numbers.
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        // Return the list of unique numbers
        return uniqueNumbers;
    }
    public static void main(String[] args) {
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)4l, (long)3l, (long)5l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)5l)))));
    }

}
