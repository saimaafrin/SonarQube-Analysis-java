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

        // 
        HashSet<Long> hs1 = new HashSet<Long>();
        for (Long x : l1) hs1.add(x);
        // 
        HashSet<Long> hs2 = new HashSet<Long>();
        for (Long x : l2) hs2.add(x);
        // 
        ArrayList<Long> al = new ArrayList<Long>();
        for (Long x : hs1) {
            if (hs2.contains(x)) al.add(x);
        }
        // 
        Collections.sort(al);
        return al;
    }
    public static void main(String[] args) {
    assert(common((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)3l, (long)34l, (long)653l, (long)2l, (long)5l))), (new ArrayList<Long>(Arrays.asList((long)5l, (long)7l, (long)1l, (long)5l, (long)9l, (long)653l, (long)121l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)653l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)2l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)4l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l)))));
    assert(common((new ArrayList<Long>(Arrays.asList((long)4l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    }

}
