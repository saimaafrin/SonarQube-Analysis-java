import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // In this problem, you will implement a function that takes two array lists of numbers,
    // and determines whether it is possible to perform an exchange of elements
    // between them to make lst1 an array array list of only even numbers.
    // There is no limit on the number of exchanged elements between lst1 and lst2.
    // If it is possible to exchange elements between the lst1 and lst2 to make
    // all the elements of lst1 to be even, return "YES".
    // Otherwise, return "NO".
    // For example:
    // >>> exchange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))), (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))))
    // ("YES")
    // >>> exchange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))), (new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)3l, (long)4l))))
    // ("NO")
    // It is assumed that the input array lists will be non-empty.
    public static String exchange(ArrayList<Long> lst1, ArrayList<Long> lst2) {

        // Use this variable to keep track of the remaining
        // even numbers that need to be exchanged.
        ArrayList<Long> remainingEvens = new ArrayList<Long>(lst1);
        // Iterate over the elements in lst2, and for each
        // element, see if it is possible to exchange it with
        // an element in lst1.
        for (Long x : lst2) {
            // If x is an even number, we can simply remove it
            // from the lst2 and add it to the lst1.
            if (x % 2 == 0) {
                remainingEvens.remove((Object)x);
                // Check if all the even numbers have been
                // exchanged.
                if (remainingEvens.isEmpty()) {
                    return "YES";
                }
            } else {
                // If x is an odd number, we need to find an
                // element y in lst1 that is equal to x + 1.
                Long y = (long)((x + 1) % 2 == 0 ? x + 1 : x + 2);
                // Remove y from lst1 and add it to lst2.
                remainingEvens.remove((Object)y);
                // Check if all the even numbers have been
                // exchanged.
                if (remainingEvens.isEmpty()) {
                    return "YES";
                }
            }
        }
        // If none of the elements in lst2 could be exchanged,
        // then the operation is not possible.
        return "NO";
    }
    public static void main(String[] args) {
    assert(exchange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))), (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))).equals(("YES")));
    assert(exchange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))), (new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)3l, (long)4l)))).equals(("NO")));
    assert(exchange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)4l, (long)3l)))).equals(("YES")));
    assert(exchange((new ArrayList<Long>(Arrays.asList((long)5l, (long)7l, (long)3l))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)6l, (long)4l)))).equals(("YES")));
    assert(exchange((new ArrayList<Long>(Arrays.asList((long)5l, (long)7l, (long)3l))), (new ArrayList<Long>(Arrays.asList((long)2l, (long)6l, (long)3l)))).equals(("NO")));
    assert(exchange((new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)6l, (long)1l, (long)8l, (long)9l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)5l, (long)1l, (long)1l, (long)1l)))).equals(("NO")));
    assert(exchange((new ArrayList<Long>(Arrays.asList((long)100l, (long)200l))), (new ArrayList<Long>(Arrays.asList((long)200l, (long)200l)))).equals(("YES")));
    }

}
