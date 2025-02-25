import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // From a supplied array list of numbers (of length at least two) select and return two that are the closest to each
    // other and return them in order (smaller number, larger number).
    // >>> findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.2f))))
    // (Pair.with(2.0f, 2.2f))
    // >>> findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.0f))))
    // (Pair.with(2.0f, 2.0f))
    public static Pair<Float, Float> findClosestElements(ArrayList<Float> numbers) {

        int n = numbers.size();
        if (n < 2)
            return null;

        Collections.sort(numbers);
        float d = Float.POSITIVE_INFINITY;
        float m = 0;
        int l = 0;
        int h = 1;

        while (h < n) {
            if (numbers.get(h) - numbers.get(l) < d) {
                d = numbers.get(h) - numbers.get(l);
                m = numbers.get(l) + (d / 2);
            }

            h++;
            l++;
        }

        return Pair.with(m - d / 2, m + d / 2);
    }
    public static void main(String[] args) {
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.9f, (float)4.0f, (float)5.0f, (float)2.2f)))).equals((Pair.with(3.9f, 4.0f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)5.9f, (float)4.0f, (float)5.0f)))).equals((Pair.with(5.0f, 5.9f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.2f)))).equals((Pair.with(2.0f, 2.2f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.0f)))).equals((Pair.with(2.0f, 2.0f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.1f, (float)2.2f, (float)3.1f, (float)4.1f, (float)5.1f)))).equals((Pair.with(2.2f, 3.1f))));
    }

}
