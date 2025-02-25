import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string representing a space separated lowercase letters, return a hash map
    // of the letter with the most repetition and containing the corresponding count.
    // If several letters have the same occurrence, return all of them.
    // Example:
    // >>> histogram(("a b c"))
    // (new HashMap<String,Long>(Map.of("a", 1l, "b", 1l, "c", 1l)))
    // >>> histogram(("a b b a"))
    // (new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))
    // >>> histogram(("a b c a b"))
    // (new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))
    // >>> histogram(("b b b b a"))
    // (new HashMap<String,Long>(Map.of("b", 4l)))
    // >>> histogram((""))
    // (new HashMap<String,Long>())
    public static HashMap<String,Long> histogram(String test) {

        String[] words = test.split(" ");
        List<String> list = Arrays.asList(words);
        HashMap<String,Long> map = new HashMap<>();
        for (String s : list) {
            long value = map.getOrDefault(s, 0l);
            value++;
            map.put(s, value);
        }
        long maxValue = 0;
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }
        }
        List<String> mostFrequent = new ArrayList<>();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                mostFrequent.add(entry.getKey());
            }
        }
        for (String s : mostFrequent) {
            map.put(s, maxValue);
        }
        return map;
    }
    public static void main(String[] args) {
    assert(histogram(("a b b a")).equals((new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))));
    assert(histogram(("a b c a b")).equals((new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))));
    assert(histogram(("a b c d g")).equals((new HashMap<String,Long>(Map.of("a", 1l, "b", 1l, "c", 1l, "d", 1l, "g", 1l)))));
    assert(histogram(("r t g")).equals((new HashMap<String,Long>(Map.of("r", 1l, "t", 1l, "g", 1l)))));
    assert(histogram(("b b b b a")).equals((new HashMap<String,Long>(Map.of("b", 4l)))));
    assert(histogram(("r t g")).equals((new HashMap<String,Long>(Map.of("r", 1l, "t", 1l, "g", 1l)))));
    assert(histogram(("")).equals((new HashMap<String,Long>())));
    assert(histogram(("a")).equals((new HashMap<String,Long>(Map.of("a", 1l)))));
    }

}
