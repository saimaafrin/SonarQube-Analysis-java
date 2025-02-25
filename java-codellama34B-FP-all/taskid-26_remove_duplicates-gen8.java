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

        // We'll use a HashSet as auxiliary structure to detect duplicates
        Set<Long> set = new HashSet<>();
        // We'll use a LinkedHashSet to keep order of elements
        // (LinkedHashSet is a HashSet with an underlying linked list)
        Set<Long> unique = new LinkedHashSet<>();
        // Now we add all elements to the set and, at the same time,
        // to the unique list
        for (Long number : numbers) {
            if (set.add(number)) {
                unique.add(number);
            }
        }
        // We transform the set into an array list, as requested
        return new ArrayList<Long>(unique);
    }
    public static void main(String[] args) {
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)4l, (long)3l, (long)5l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)5l)))));
    }

}
