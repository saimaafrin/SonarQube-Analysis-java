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

        // Your code here
        if(lst1.isEmpty() && lst2.isEmpty())
            return "YES";
        if(lst1.isEmpty() || lst2.isEmpty())
            return "NO";
        if(lst1.size() != lst2.size())
            return "NO";
        if(lst1.size() == 1) {
            if(lst1.get(0)%2 == 0 && lst2.get(0)%2 == 0)
                return "YES";
            return "NO";
        }
        ArrayList<Long> evenLst1 = new ArrayList<Long>();
        ArrayList<Long> evenLst2 = new ArrayList<Long>();
        ArrayList<Long> oddLst1 = new ArrayList<Long>();
        ArrayList<Long> oddLst2 = new ArrayList<Long>();
        for(Long num : lst1) {
            if(num%2 == 0)
                evenLst1.add(num);
            else
                oddLst1.add(num);
        }
        for(Long num : lst2) {
            if(num%2 == 0)
                evenLst2.add(num);
            else
                oddLst2.add(num);
        }
        if(evenLst1.isEmpty() || oddLst1.isEmpty() || evenLst2.isEmpty() || oddLst2.isEmpty())
            return "NO";
        String finalResult = exchange(oddLst1, oddLst2);
        if(finalResult == "NO")
            finalResult = exchange(evenLst1, evenLst2);
        return finalResult;
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
