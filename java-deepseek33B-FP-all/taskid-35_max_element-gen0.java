import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return maximum element in the array list.
    // >>> maxElement((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (3l)
    // >>> maxElement((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)-5l, (long)2l, (long)-3l, (long)3l, (long)9l, (long)0l, (long)123l, (long)1l, (long)-10l))))
    // (123l)
    public static long maxElement(ArrayList<Long> l) {

        if (l.size() == 0) return Long.MIN_VALUE;
        long max = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            max = Math.max(max, l.get(i));
        }
        return max;
    }
    public static void main(String[] args) {
    assert(maxElement((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))) == (3l));
    assert(maxElement((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)-5l, (long)2l, (long)-3l, (long)3l, (long)9l, (long)0l, (long)124l, (long)1l, (long)-10l)))) == (124l));
    }

}
