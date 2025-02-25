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

        l.sort(Comparator.naturalOrder());
        ArrayList<Long> l2 = new ArrayList<Long>();
        if (l.size() == 0) {
            return l;
        }
        l2.add(l.get(0));
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i - 1).longValue() != l.get(i).longValue()) {
                l2.add(l.get(i));
            }
        }
        return l2;
    }
    public static void main(String[] args) {
    assert(unique((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)5l, (long)2l, (long)3l, (long)3l, (long)9l, (long)0l, (long)123l)))).equals((new ArrayList<Long>(Arrays.asList((long)0l, (long)2l, (long)3l, (long)5l, (long)9l, (long)123l)))));
    }

}
