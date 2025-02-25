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

        ArrayList<Long> a = x.stream().filter(xx -> {
                long y = xx;
                String s = Long.toString(y);
                return s.chars().allMatch(Character::isDigit);
            }).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Long> b = a.stream().filter(xx -> {
                long y = xx;
                String s = Long.toString(y);
                return Arrays.stream(s.split("")).map(xxi -> Integer.parseInt(xxi)).anyMatch(xxii -> (xxii % 2) == 1);
            }).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Long> c = b.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        return c;
    }
    public static void main(String[] args) {
    assert(uniqueDigits((new ArrayList<Long>(Arrays.asList((long)15l, (long)33l, (long)1422l, (long)1l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)15l, (long)33l)))));
    assert(uniqueDigits((new ArrayList<Long>(Arrays.asList((long)152l, (long)323l, (long)1422l, (long)10l)))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(uniqueDigits((new ArrayList<Long>(Arrays.asList((long)12345l, (long)2033l, (long)111l, (long)151l)))).equals((new ArrayList<Long>(Arrays.asList((long)111l, (long)151l)))));
    assert(uniqueDigits((new ArrayList<Long>(Arrays.asList((long)135l, (long)103l, (long)31l)))).equals((new ArrayList<Long>(Arrays.asList((long)31l, (long)135l)))));
    }

}
