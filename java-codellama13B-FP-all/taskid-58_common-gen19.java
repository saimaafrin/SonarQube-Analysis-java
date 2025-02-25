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

        // Return intersection of two lists as a new list.
        // >>> intersection((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))), (new ArrayList<Long>(Arrays.asList((long)101l, (long)2l, (long)1l, (long)10l))))
        // (new ArrayList<Long>(Arrays.asList((long)2l, (long)1l)))
        public static ArrayList<Long> intersection(ArrayList<Long> list1, ArrayList<Long> list2) {
            ArrayList<Long> result = new ArrayList<>();
            // Loop through all elements of first list and check if present in second list.
            for (int i=0; i<list1.size(); i++) {
                Long element = list1.get(i);
                if (list2.contains(element)) {
                    // Add common element to result list if present.
                    result.add(element);
                }
            }
            return result;
        }
        // Get unique elements of both lists as a new list.
        // >>> union((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))), (new ArrayList<Long>(Arrays.asList((long)101l, (long)2l, (long)1l, (long)10l))))
        // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)101l, (long)10l)))
        public static ArrayList<Long> union(ArrayList<Long> list1, ArrayList<Long> list2) {
            ArrayList<Long> result = new ArrayList<>();
            // Loop through all elements of both lists and add to result list if not present.
            for (int i=0; i<list1.size(); i++) {
                Long element = list1.get(i);
                if (!result.contains(element)) {
                    result.add(element);
                }
            }
            for (int i=0; i<list2.size(); i++) {
                Long element = list2.get(i);
                if (!result.contains(element)) {
                    result.add(element);
                }
            }
            return result;
        }
        // >>> setdiff((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))), (new ArrayList<Long>(Arrays.asList((long)101l, (long)2l, (long)1l, (long)10l))))
        // (new ArrayList<Long>(Arrays.asList((long)3l)))
        public static ArrayList<Long> setdiff(ArrayList<Long> list1, ArrayList<Long> list2) {
            ArrayList<Long> result = new ArrayList<>();
            // Loop
    }
    public static void main(String[] args) {
    assert(common((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)3l, (long)34l, (long)653l, (long)2l, (long)5l))), (new ArrayList<Long>(Arrays.asList((long)5l, (long)7l, (long)1l, (long)5l, (long)9l, (long)653l, (long)121l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)653l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)2l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)4l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)4l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    }

}
