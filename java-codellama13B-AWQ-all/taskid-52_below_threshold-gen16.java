import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return true if all numbers in the array list l are below threshold t.
    // >>> belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)10l))), (100l))
    // (true)
    // >>> belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)20l, (long)4l, (long)10l))), (5l))
    // (false)
    public static boolean belowThreshold(ArrayList<Long> l, long t) {

        // You can use the following built-in methods:
        // ArrayList.stream()
        // ArrayList.isEmpty()
        // ArrayList.get(index)
        // ArrayList.contains(Object)
        // Long.longValue()
        // Long.compareTo(Long)
        // Long.valueOf(String)
        // Stream.allMatch(Predicate)
        // Stream.map(Function)
        // Stream.anyMatch(Predicate)
        // Stream.filter(Predicate)
        // Stream.collect(Collector)
        // Stream.toArray()
        // Long.valueOf(Long)
        // Stream.allMatch(Predicate)
        // Stream.map(Function)
        // Stream.filter(Predicate)
        // Stream.mapToLong(ToLongFunction)
        // Stream.collect(Collector)
        // Stream.toArray()
        return l.stream().mapToLong(Long::longValue).allMatch(x -> x < t);
    }
    public static void main(String[] args) {
    assert(belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)10l))), (100l)) == (true));
    assert(belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)20l, (long)4l, (long)10l))), (5l)) == (false));
    assert(belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)20l, (long)4l, (long)10l))), (21l)) == (true));
    assert(belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)20l, (long)4l, (long)10l))), (22l)) == (true));
    assert(belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)8l, (long)4l, (long)10l))), (11l)) == (true));
    assert(belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)8l, (long)4l, (long)10l))), (10l)) == (false));
    }

}
