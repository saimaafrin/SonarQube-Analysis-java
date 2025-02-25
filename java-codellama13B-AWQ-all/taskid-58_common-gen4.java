import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return sorted unique common elements for two array lists.
    // >>> common((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)3l, (long)34l, (long)653l, (long)2l, (long)5l))), (new ArrayList<Long>(Arrays.asList((long)5l, (long)7l, (long)1l, (long)5l, (long)9l, (long)653l, (long)121l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)653l)))
    // >>> common((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)2l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l)))
    public static ArrayList<Long> common(ArrayList<Long> l1, ArrayList<Long> l2) {

        // Create a set to store the common elements.
        // Set would only store unique elements
        HashSet<Long> hs = new HashSet<>();

        // Iterate over the first array list and store the unique common
        // elements in the set.
        for (Long i : l1) {
            if (l2.contains(i))
                hs.add(i);
        }

        // Iterate over the second array list and store the unique common
        // elements in the set.
        for (Long i : l2) {
            if (l1.contains(i))
                hs.add(i);
        }

        // Convert the hash set to the array list.
        ArrayList<Long> res = new ArrayList<Long>(hs);

        // Sort the array list.
        Collections.sort(res);

        // Return the sorted array list.
        return res;
    }
    public static void main(String[] args) {
    assert(common((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)3l, (long)34l, (long)653l, (long)2l, (long)5l))), (new ArrayList<Long>(Arrays.asList((long)5l, (long)7l, (long)1l, (long)5l, (long)9l, (long)653l, (long)121l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)653l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)2l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)4l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)4l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    }

}
