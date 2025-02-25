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

        // Use a hash map to keep track of the numbers that have been seen.
        // The hash map maps each number to the count of how many times that number appears.
        HashMap<Long, Integer> num_count_map = new HashMap<>();
        for (Long num : numbers) {
            if (num_count_map.containsKey(num)) {
                num_count_map.put(num, num_count_map.get(num) + 1);
            }
            else {
                num_count_map.put(num, 1);
            }
        }
        // Go through the list of numbers in the hash map and add
        // all numbers that have not been seen more than once to a new list.
        ArrayList<Long> unique_numbers = new ArrayList<>();
        for (Map.Entry<Long, Integer> entry : num_count_map.entrySet()) {
            if (entry.getValue() == 1) {
                unique_numbers.add(entry.getKey());
            }
        }
        return unique_numbers;
    }
    public static void main(String[] args) {
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)4l, (long)3l, (long)5l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)5l)))));
    }

}
