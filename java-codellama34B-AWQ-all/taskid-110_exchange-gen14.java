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

        // This is the solution, don't look!
        // return "YES";
        if (lst1.size() == 0) return "NO";
        if (lst1.stream().allMatch(x -> x % 2 == 0)) return "YES";
        if (lst2.stream().allMatch(x -> x % 2 == 1)) return "NO";

        ArrayList<Long> odds = new ArrayList<>(lst1.stream().filter(x -> x % 2 == 1).collect(Collectors.toList()));
        ArrayList<Long> evens = new ArrayList<>(lst1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));
        if (odds.size() > 0 && evens.size() > 0) {
            if (odds.get(0) % 2 == 0 || evens.get(0) % 2 == 1) {
                // swap
                long t = odds.get(0);
                odds.set(0, evens.get(0));
                evens.set(0, t);
            }
        }
        if (lst1.stream().allMatch(x -> x % 2 == 0)) return "YES";

        // now, we know that lst1 has at least one odd and one even number
        // so we need to find one number in lst2 that is not odd
        // then we can swap it with the first even number in lst1
        // and all of the even numbers in lst1 will be even
        for (int i = 0; i < lst2.size(); i++) {
            if (lst2.get(i) % 2 == 0) {
                lst1.set(lst1.indexOf(evens.get(0)), lst2.get(i));
                lst2.set(i, evens.get(0));
                break;
            }
        }
        if (lst1.stream().allMatch(x -> x % 2 == 0)) return "YES";

        // now we need to find one number in lst2 that is even
        // and we can swap it with one of the odd numbers in lst1
        // then we can repeat this process until all the numbers in lst1 are even
        for (int i = 0; i < lst2.size(); i++) {
            if (lst2.get(i) % 2 == 0) {
                lst1.set(lst1.indexOf(odds.get(0)), lst2.get(i));
                lst2.set(i, odds.get(0));
                break;
            }
        }
        if (lst1.stream().allMatch(x -> x % 2
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
