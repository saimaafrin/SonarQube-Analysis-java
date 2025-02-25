import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return sorted unique elements in an array array list
    // >>> unique((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)5l, (long)2l, (long)3l, (long)3l, (long)9l, (long)0l, (long)123l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)2l, (long)3l, (long)5l, (long)9l, (long)123l)))
    public static ArrayList<Long> unique(ArrayList<Long> l) {

        // Sort the array list
        Collections.sort(l);
        // Create a new array list to store the unique elements
        ArrayList<Long> unique = new ArrayList<Long>();
        // Create an iterator to traverse through the array list
        Iterator<Long> i = l.iterator();
        // Get the first element of the array list
        Long previous = i.next();
        // Add the first element to the unique array list
        unique.add(previous);
        // Iterate over the array list
        while (i.hasNext()) {
            // Get the next element of the array list
            Long current = i.next();
            // Check if the current element is not equal to the previous element
            if (!current.equals(previous)) {
                // Add the current element to the unique array list
                unique.add(current);
                // Store the current element as the previous element
                previous = current;
            }
        }
        // Return the unique array list
        return unique;
    }
    public static void main(String[] args) {
    assert(unique((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)5l, (long)2l, (long)3l, (long)3l, (long)9l, (long)0l, (long)123l)))).equals((new ArrayList<Long>(Arrays.asList((long)0l, (long)2l, (long)3l, (long)5l, (long)9l, (long)123l)))));
    }

}
