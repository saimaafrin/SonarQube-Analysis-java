import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Out of array list of strings, return the longest one. Return the first one in case of multiple
    // strings of the same length. Return null in case the input array list is empty.
    // >>> longest((new ArrayList<String>(Arrays.asList())))
    // Optional.empty()
    // >>> longest((new ArrayList<String>(Arrays.asList((String)"a", (String)"b", (String)"c"))))
    // "a"
    // >>> longest((new ArrayList<String>(Arrays.asList((String)"a", (String)"bb", (String)"ccc"))))
    // "ccc"
    public static Optional<String> longest(ArrayList<String> strings) {

        // Method 1: Using Streams
        // return strings.stream()
        //     .max((String s1, String s2) -> {
        //         return s1.length() == s2.length() ? 0 : (s1.length() < s2.length() ? -1 : 1);
        //     });

        // Method 2: Using the for loop
        if (strings.size() == 0) {
            return Optional.empty();
        }

        String longest_string = strings.get(0);

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > longest_string.length()) {
                longest_string = strings.get(i);
            }
        }

        return Optional.of(longest_string);
    }
    public static void main(String[] args) {
    assert(longest((new ArrayList<String>(Arrays.asList()))).equals(Optional.empty()));
    assert(longest((new ArrayList<String>(Arrays.asList((String)"x", (String)"y", (String)"z")))).equals("x"));
    assert(longest((new ArrayList<String>(Arrays.asList((String)"x", (String)"yyy", (String)"zzzz", (String)"www", (String)"kkkk", (String)"abc")))).equals("zzzz"));
    }

}
