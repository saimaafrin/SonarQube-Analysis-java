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

        Map<Long, Long> count = new HashMap<Long, Long>();
        for (Long number : numbers) {
            if (count.containsKey(number)) {
                count.put(number, count.get(number) + 1);
            }
            else {
                count.put(number, 1l);
            }
        }
        ArrayList<Long> result = new ArrayList<Long>();
        for (Map.Entry<Long, Long> entry : count.entrySet()) {
            if (entry.getValue() < 2) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
    public static void main(String[] args) {
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)4l, (long)3l, (long)5l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)5l)))));
    }

}
