import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // This function takes an array array list l and returns an array array list l' such that
    // l' is identical to l in the odd indicies, while its values at the even indicies are equal
    // to the values of the even indicies of l, but sorted.
    // >>> sortEven((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))
    // >>> sortEven((new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)3l, (long)4l))))
    // (new ArrayList<Long>(Arrays.asList((long)3l, (long)6l, (long)5l, (long)4l)))
    public static ArrayList<Long> sortEven(ArrayList<Long> l) {

        ArrayList<Long> l_ = new ArrayList<Long>();
        for (long v : l) {
            l_.add(v);
        }
        for (int i = 1; i < l_.size(); i += 2) {
            long min = l_.get(i);
            int minIndex = i;
            for (int j = i; j < l_.size(); j += 2) {
                if (l_.get(j) < min) {
                    min = l_.get(j);
                    minIndex = j;
                }
            }
            l_.set(i, l_.get(minIndex));
            l_.set(minIndex, min);
        }
        return l_;
    }
    public static void main(String[] args) {
    assert(sortEven((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))));
    assert(sortEven((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)-5l, (long)2l, (long)-3l, (long)3l, (long)9l, (long)0l, (long)123l, (long)1l, (long)-10l)))).equals((new ArrayList<Long>(Arrays.asList((long)-10l, (long)3l, (long)-5l, (long)2l, (long)-3l, (long)3l, (long)5l, (long)0l, (long)9l, (long)1l, (long)123l)))));
    assert(sortEven((new ArrayList<Long>(Arrays.asList((long)5l, (long)8l, (long)-12l, (long)4l, (long)23l, (long)2l, (long)3l, (long)11l, (long)12l, (long)-10l)))).equals((new ArrayList<Long>(Arrays.asList((long)-12l, (long)8l, (long)3l, (long)4l, (long)5l, (long)2l, (long)12l, (long)11l, (long)23l, (long)-10l)))));
    }

}
