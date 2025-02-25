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

        // This is a naive implementation. It is not necessary to sort the values at the even
        // indicies. It would be sufficient to simply make sure that the values at the even
        // indicies are equal to the values at the corresponding indicies in the sorted list.
        // >>> sorted = (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))
        // >>> sorted.sort()
        // >>> (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))
        // >>> sorted = (new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)3l, (long)4l)))
        // >>> sorted.sort()
        // >>> (new ArrayList<Long>(Arrays.asList((long)3l, (long)4l, (long)5l, (long)6l)))
        // >>> odd_indicies = (new ArrayList<Long>(Arrays.asList((long)1l, (long)3l)))
        // >>> odd_indicies.sort()
        // >>> (new ArrayList<Long>(Arrays.asList((long)1l, (long)3l)))
        // >>> sorted = (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))
        // >>> sorted.sort()
        // >>> (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))
        // >>> sorted = (new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)3l, (long)4l)))
        // >>> sorted.sort()
        // >>> (new ArrayList<Long>(Arrays.asList((long)3l, (long)4l, (long)5l, (long)6l)))
        // >>> odd_indicies = (new ArrayList<Long>(Arrays.asList((long)1l, (long)3l)))
        // >>> odd_indicies.sort()
        // >>> (new ArrayList<Long>(Arrays.asList((long)1l, (long)3l)))
        ArrayList<Long> odd_indicies = IntStream.rangeClosed(1, (int)l.size() / 2).mapToObj(Long::new).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Long> even_indicies = IntStream.rangeClosed(2, (int)l.size() / 2 + 1).mapToObj(Long::new).collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(l);
        ArrayList<Long> even_sorted = even_indicies.stream().map(l::get).collect(Collectors.toCollection(ArrayList::new));
        return IntStream.rangeClosed(1, (int)l.size()).mapToObj(i -> (i % 2 == 0) ? even_sorted.get((int)i / 2 - 1) : l.get((int
    }
    public static void main(String[] args) {
    assert(sortEven((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))));
    assert(sortEven((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)-5l, (long)2l, (long)-3l, (long)3l, (long)9l, (long)0l, (long)123l, (long)1l, (long)-10l)))).equals((new ArrayList<Long>(Arrays.asList((long)-10l, (long)3l, (long)-5l, (long)2l, (long)-3l, (long)3l, (long)5l, (long)0l, (long)9l, (long)1l, (long)123l)))));
    assert(sortEven((new ArrayList<Long>(Arrays.asList((long)5l, (long)8l, (long)-12l, (long)4l, (long)23l, (long)2l, (long)3l, (long)11l, (long)12l, (long)-10l)))).equals((new ArrayList<Long>(Arrays.asList((long)-12l, (long)8l, (long)3l, (long)4l, (long)5l, (long)2l, (long)12l, (long)11l, (long)23l, (long)-10l)))));
    }

}
