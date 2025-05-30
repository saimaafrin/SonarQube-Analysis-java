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

        int sum = (int) (array.get(0) + array.get(array.size() - 1));
        ArrayList<Long> result = new ArrayList<>(array);
        if (sum % 2 == 0) {
            Collections.sort(result, Collections.reverseOrder());
        } else {
            Collections.sort(result);
        }
        return result;
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
