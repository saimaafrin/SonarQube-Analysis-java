import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return true is array list elements are monotonically increasing or decreasing.
    // >>> monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)20l))))
    // (true)
    // >>> monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)20l, (long)4l, (long)10l))))
    // (false)
    // >>> monotonic((new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)0l, (long)-10l))))
    // (true)
    public static boolean monotonic(ArrayList<Long> l) {

        return l.stream().reduce(new Pair<Boolean, Long>(true, null),
                                 (Pair<Boolean, Long> acc, Long x) -> {
                                     if (acc.getValue0()) {
                                         return new Pair<Boolean, Long>(acc.getValue1() == null || x >= acc.getValue1(),
                                                                        x);
                                     } else {
                                         return new Pair<Boolean, Long>(acc.getValue1() == null || x <= acc.getValue1(),
                                                                        x);
                                     }
                                 },
                                 (Pair<Boolean, Long> x, Pair<Boolean, Long> y) -> {
                                     if (x.getValue0() && y.getValue0()) {
                                         return new Pair<Boolean, Long>(true, x.getValue1());
                                     } else if (!x.getValue0() && !y.getValue0()) {
                                         return new Pair<Boolean, Long>(false, x.getValue1());
                                     } else {
                                         return new Pair<Boolean, Long>(false, null);
                                     }
                                 }).getValue0();
    }
    public static void main(String[] args) {
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)10l)))) == (true));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)20l)))) == (true));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)20l, (long)4l, (long)10l)))) == (false));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)0l, (long)-10l)))) == (true));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)1l, (long)0l)))) == (true));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)5l, (long)60l)))) == (false));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)60l)))) == (true));
    assert(monotonic((new ArrayList<Long>(Arrays.asList((long)9l, (long)9l, (long)9l, (long)9l)))) == (true));
    }

}
