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

        ArrayList<Long> ret = new ArrayList<Long>(l);
        // we will be iterating through the indicies that are divisible by three, and at each step, swap the value at that index with the value
        // that is one ahead of it, if that is an index of l.
        for(int i = 2; i < l.size(); i += 3) {
            int j = i + 1;
            if (j < l.size()) {
                Collections.swap(ret, i, j);
            }
        }
        return ret;
    }
    public static void main(String[] args) {
    assert(sortThird((new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)3l, (long)4l, (long)8l, (long)9l, (long)2l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)6l, (long)3l, (long)4l, (long)8l, (long)9l, (long)5l)))));
    assert(sortThird((new ArrayList<Long>(Arrays.asList((long)5l, (long)8l, (long)3l, (long)4l, (long)6l, (long)9l, (long)2l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)8l, (long)3l, (long)4l, (long)6l, (long)9l, (long)5l)))));
    assert(sortThird((new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)9l, (long)4l, (long)8l, (long)3l, (long)2l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)6l, (long)9l, (long)4l, (long)8l, (long)3l, (long)5l)))));
    assert(sortThird((new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)3l, (long)4l, (long)8l, (long)9l, (long)2l, (long)1l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)6l, (long)3l, (long)4l, (long)8l, (long)9l, (long)5l, (long)1l)))));
    }

}
