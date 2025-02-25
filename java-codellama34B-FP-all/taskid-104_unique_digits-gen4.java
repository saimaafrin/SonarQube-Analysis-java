import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of positive integers x. return a sorted array list of all 
    // elements that hasn't any even digit.
    // Note: Returned array list should be sorted in increasing order.
    // For example:
    // >>> uniqueDigits((new ArrayList<Long>(Arrays.asList((long)15l, (long)33l, (long)1422l, (long)1l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)15l, (long)33l)))
    // >>> uniqueDigits((new ArrayList<Long>(Arrays.asList((long)152l, (long)323l, (long)1422l, (long)10l))))
    // (new ArrayList<Long>(Arrays.asList()))
    public static ArrayList<Long> uniqueDigits(ArrayList<Long> x) {

        HashSet<Long> unique = new HashSet<>();
        for (int i = 0; i < x.size(); i++) {
            String s = x.get(i).toString();
            String[] parts = s.split("");
            for (int j = 0; j < parts.length; j++) {
                if (Integer.parseInt(parts[j]) % 2 == 0) {
                    break;
                }
                if (j == parts.length - 1) {
                    unique.add(x.get(i));
                }
            }
        }
        ArrayList<Long> sorted = new ArrayList<>(unique);
        Collections.sort(sorted);
        return sorted;
    }
    public static void main(String[] args) {
    assert(uniqueDigits((new ArrayList<Long>(Arrays.asList((long)15l, (long)33l, (long)1422l, (long)1l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)15l, (long)33l)))));
    assert(uniqueDigits((new ArrayList<Long>(Arrays.asList((long)152l, (long)323l, (long)1422l, (long)10l)))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(uniqueDigits((new ArrayList<Long>(Arrays.asList((long)12345l, (long)2033l, (long)111l, (long)151l)))).equals((new ArrayList<Long>(Arrays.asList((long)111l, (long)151l)))));
    assert(uniqueDigits((new ArrayList<Long>(Arrays.asList((long)135l, (long)103l, (long)31l)))).equals((new ArrayList<Long>(Arrays.asList((long)31l, (long)135l)))));
    }

}
