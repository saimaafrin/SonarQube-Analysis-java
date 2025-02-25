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

        // Sorted list
        Collections.sort(l1);
        Collections.sort(l2);

        // Find common elements
        ArrayList<Long> result = new ArrayList<Long>();
        int i = 0, j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i).equals(l2.get(j))) {
                result.add(l1.get(i));
                i++;
                j++;
            } else if (l1.get(i) < l2.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        // Remove duplicates
        Collections.sort(result);
        ArrayList<Long> unique = new ArrayList<Long>();
        unique.add(result.get(0));
        for (int k = 1; k < result.size(); k++) {
            if (!result.get(k).equals(result.get(k - 1))) {
                unique.add(result.get(k));
            }
        }

        return unique;
    }
    public static void main(String[] args) {
    assert(common((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)3l, (long)34l, (long)653l, (long)2l, (long)5l))), (new ArrayList<Long>(Arrays.asList((long)5l, (long)7l, (long)1l, (long)5l, (long)9l, (long)653l, (long)121l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)653l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)2l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)4l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)4l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    }

}
