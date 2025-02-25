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

        // If you are given this array
        // 1 2 3 2 4 5 5 5 5 5 5 5
        // and you are told to remove all duplicates
        // The correct solution is 1 2 3 4 5
        // Not 1 3 4 5
        // So you must keep track of the original number order

        // Keep a map of how many times each number appears
        HashMap<Long, Long> number_counts = new HashMap<Long, Long>();
        numbers.stream().forEach(n -> {
            if (number_counts.containsKey(n)) {
                long count = number_counts.get(n);
                number_counts.put(n, count + 1);
            } else {
                number_counts.put(n, 1L);
            }
        });

        // Now that you have the counts, simply remove any that don't have a count of 1
        // A map is not ordered so you must use the original input list
        // and check if it has a count of 1
        // If it does, add it to a new list
        ArrayList<Long> non_duplicate_numbers = new ArrayList<Long>();
        numbers.stream().forEach(n -> {
            if (number_counts.get(n) == 1) {
                non_duplicate_numbers.add(n);
            }
        });

        return non_duplicate_numbers;
    }
    public static void main(String[] args) {
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)4l, (long)3l, (long)5l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)5l)))));
    }

}
