import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // This function takes an array array list l and returns an array array list l' such that
    // l' is identical to l in the indicies that are not divisible by three, while its values at the indicies that are divisible by three are equal
    // to the values of the corresponding indicies of l, but sorted.
    // >>> sortThird((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))
    // >>> sortThird((new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)3l, (long)4l, (long)8l, (long)9l, (long)2l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)6l, (long)3l, (long)4l, (long)8l, (long)9l, (long)5l)))
    public static ArrayList<Long> sortThird(ArrayList<Long> l) {

        // Code Here
        // A copy of the input array list l
        ArrayList<Long> l_ = new ArrayList<Long>(l);
        // A copy of the input array list l
        ArrayList<Long> l__ = new ArrayList<Long>();
        // An array list to store the thirds of the array
        ArrayList<Long> thirds = new ArrayList<Long>();
        // Looping through the input array list
        for (Long l_i : l_) {
            // If the index is divisible by 3
            if (l__.size() % 3 == 0) {
                // Add the value of the current index to the array list of thirds
                thirds.add(l_i);
            }
            // Add the value of the current index to the output array list l__
            l__.add(l_i);
        }
        // Sort the array list of thirds in ascending order
        Collections.sort(thirds);
        // Looping through the input array list
        for (Long l_i : l_) {
            // If the index is divisible by 3
            if (l__.size() % 3 == 0) {
                // Replace the value of the current index in the output array list l__
                // with the value of the array list of thirds
                l__.set(l__.size() - 1, thirds.get(0));
                // Remove the first element from the array list of thirds
                thirds.remove(0);
            }
        }
        // Return the output array list l__
        return l__;
    }
    public static void main(String[] args) {
    assert(sortThird((new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)3l, (long)4l, (long)8l, (long)9l, (long)2l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)6l, (long)3l, (long)4l, (long)8l, (long)9l, (long)5l)))));
    assert(sortThird((new ArrayList<Long>(Arrays.asList((long)5l, (long)8l, (long)3l, (long)4l, (long)6l, (long)9l, (long)2l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)8l, (long)3l, (long)4l, (long)6l, (long)9l, (long)5l)))));
    assert(sortThird((new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)9l, (long)4l, (long)8l, (long)3l, (long)2l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)6l, (long)9l, (long)4l, (long)8l, (long)3l, (long)5l)))));
    assert(sortThird((new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)3l, (long)4l, (long)8l, (long)9l, (long)2l, (long)1l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)6l, (long)3l, (long)4l, (long)8l, (long)9l, (long)5l, (long)1l)))));
    }

}
