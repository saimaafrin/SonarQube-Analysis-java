import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of non-negative integers, return a cojava of the given array array list after sorting,
    // you will sort the given array array list in ascending order if the sum( first index value, last index value) is odd,
    // or sort it in descending order if the sum( first index value, last index value) is even.
    // Note:
    // * don't change the given array array list.
    // Examples:
    // >>> sortArray((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)5l)))
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)3l, (long)0l, (long)1l, (long)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)2l, (long)3l, (long)4l, (long)5l)))
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)3l, (long)0l, (long)1l, (long)5l, (long)6l))))
    // (new ArrayList<Long>(Arrays.asList((long)6l, (long)5l, (long)4l, (long)3l, (long)2l, (long)1l, (long)0l)))
    public static ArrayList<Long> sortArray(ArrayList<Long> array) {

        ArrayList<Long> sorted = new ArrayList<>();
        if (array.size() == 0) return sorted;
        if (array.size() == 1) {
            sorted.add(array.get(0));
            return sorted;
        }
        long first = array.get(0);
        long last = array.get(array.size() - 1);
        long sum = first + last;
        boolean sortAscending = sum % 2 == 1;
        ArrayList<Long> firstHalf = new ArrayList<>();
        ArrayList<Long> secondHalf = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (i < array.size() / 2) firstHalf.add(array.get(i));
            else secondHalf.add(array.get(i));
        }
        ArrayList<Long> sortedFirstHalf = sortArray(firstHalf);
        ArrayList<Long> sortedSecondHalf = sortArray(secondHalf);
        int index = 0;
        if (sortAscending) {
            for (int i = 0; i < array.size(); i++) {
                if (i % 2 == 0) sorted.add(sortedFirstHalf.get(index));
                else sorted.add(sortedSecondHalf.get(index));
                index++;
            }
        } else {
            for (int i = 0; i < array.size(); i++) {
                if (i % 2 == 0) sorted.add(sortedSecondHalf.get(index));
                else sorted.add(sortedFirstHalf.get(index));
                index++;
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
    assert(sortArray((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)5l)))).equals((new ArrayList<Long>(Arrays.asList((long)5l)))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)3l, (long)0l, (long)1l, (long)5l)))).equals((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)2l, (long)3l, (long)4l, (long)5l)))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)3l, (long)0l, (long)1l, (long)5l, (long)6l)))).equals((new ArrayList<Long>(Arrays.asList((long)6l, (long)5l, (long)4l, (long)3l, (long)2l, (long)1l, (long)0l)))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l)))).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l)))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)15l, (long)42l, (long)87l, (long)32l, (long)11l, (long)0l)))).equals((new ArrayList<Long>(Arrays.asList((long)0l, (long)11l, (long)15l, (long)32l, (long)42l, (long)87l)))));
    assert(sortArray((new ArrayList<Long>(Arrays.asList((long)21l, (long)14l, (long)23l, (long)11l)))).equals((new ArrayList<Long>(Arrays.asList((long)23l, (long)21l, (long)14l, (long)11l)))));
    }

}
