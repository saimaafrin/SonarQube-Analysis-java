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

        int n = lst1.size();
        if (lst2.size() < n) {
            int x = lst2.size();
            lst1.subList(0, n - x).clear();
            n = lst1.size();
        } else if (lst2.size() > n) {
            int x = lst2.size() - n;
            lst2.subList(0, x).clear();
        }
        if (n <= 0) {
            return "NO";
        }
        int m = 0;
        for (int i = 0; i < n; i++) {
            long num = lst1.get(i);
            if (num % 2 == 0) {
                m++;
            }
        }
        if (m == n) {
            return "YES";
        }
        for (int i = 0; i < n - 1; i++) {
            long num = lst1.get(i);
            long num1 = lst1.get(i + 1);
            if (num % 2 == 0) {
                if (num1 % 2 != 0) {
                    long temp = num1;
                    lst1.set(i + 1, num);
                    lst1.set(i, temp);
                    long temp1 = lst2.get(i);
                    lst2.set(i, lst2.get(i + 1));
                    lst2.set(i + 1, temp1);
                    i++;
                }
            } else {
                if (num1 % 2 == 0) {
                    long temp = num;
                    lst1.set(i, num1);
                    lst1.set(i + 1, temp);
                    long temp1 = lst2.get(i);
                    lst2.set(i, lst2.get(i + 1));
                    lst2.set(i + 1, temp1);
                    i++;
                }
            }
        }
        if (lst1.get(0) % 2 == 0) {
            m--;
        }
        if (m == 0) {
            return "YES";
        } else {
            return "NO";
        }
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
