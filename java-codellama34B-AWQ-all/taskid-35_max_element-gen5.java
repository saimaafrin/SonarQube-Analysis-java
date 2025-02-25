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

        long[] a = new long[l.size()];
        for (int i = 0; i < a.length; i++)
            a[i] = l.get(i);
        long m = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > m)
                m = a[i];
        return m;
    }
    public static void main(String[] args) {
    assert(maxElement((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))) == (3l));
    assert(maxElement((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)-5l, (long)2l, (long)-3l, (long)3l, (long)9l, (long)0l, (long)124l, (long)1l, (long)-10l)))) == (124l));
    }

}
