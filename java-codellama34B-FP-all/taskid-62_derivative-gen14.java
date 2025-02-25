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

        // Hint: Use the formula:
        // (f'(x) = f(x) * (x[0] - 1) + x[1] * (x[0] * (x[0] - 1)) + x[2] * (x[0]^2 * (x[0] - 1)) + ...)
        // x[0] = 1, x[1] = x, x[2] = x^2, x[3] = x^3, ...
        // xs[0] + xs[1] * x + xs[2] * x^2 + ....
        // f'(x) = x[1] * (xs[0] * 1) + x[2] * (xs[0] * x[1]) + x[3] * (xs[0] * x[1] * x[2]) + ...
        // f'(x) = xs[1] * x[1] + xs[2] * x[2] + xs[3] * x[3] + ...
        // f'(x) = xs[1] + xs[2] * x + xs[3] * x^2 + ...
        if(xs.size() == 1)
        {
            return new ArrayList<Long>(Arrays.asList((long)0l));
        }
        else
        {
            ArrayList<Long> ret = new ArrayList<Long>();
            for(int i = 1; i < xs.size(); i++)
            {
                ret.add(ret.size(), xs.get(i));
            }
            return ret;
        }
    }
    public static void main(String[] args) {
    assert(derivative((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)2l, (long)4l, (long)5l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)12l, (long)20l)))));
    assert(derivative((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)6l)))));
    assert(derivative((new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)1l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l)))));
    assert(derivative((new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)1l, (long)0l, (long)4l)))).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)0l, (long)16l)))));
    assert(derivative((new ArrayList<Long>(Arrays.asList((long)1l)))).equals((new ArrayList<Long>(Arrays.asList()))));
    }

}
