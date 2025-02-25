import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // xs represent coefficients of a polynomial.
    // xs[0] + xs[1] * x + xs[2] * x^2 + ....
    // Return derivative of this polynomial in the same form.
    // >>> derivative((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)2l, (long)4l, (long)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)12l, (long)20l)))
    // >>> derivative((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)6l)))
    public static ArrayList<Long> derivative(ArrayList<Long> xs) {

        // 1. filter the last element
        // 2. map the remaining list to multiply x
        // 3. add the list together
        ArrayList<Long> xs_without_last = xs.subList(0, xs.size() - 1).stream().collect(Collectors.toCollection(ArrayList<Long>::new));
        ArrayList<Long> xs_multiplied = xs_without_last.stream().map(x -> x * 2).collect(Collectors.toCollection(ArrayList<Long>::new));
        ArrayList<Long> derivative = xs_multiplied.stream().collect(Collectors.toCollection(ArrayList<Long>::new));
        return derivative;
    }
    public static void main(String[] args) {
    assert(derivative((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)2l, (long)4l, (long)5l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)12l, (long)20l)))));
    assert(derivative((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)6l)))));
    assert(derivative((new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)1l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l)))));
    assert(derivative((new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)1l, (long)0l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)0l, (long)16l)))));
    assert(derivative((new ArrayList<Long>(Arrays.asList((long)1l)))).equals((new ArrayList<Long>(Arrays.asList()))));
    }

}
