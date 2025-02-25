import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Insert a number 'delimeter' between every two consecutive elements of input array list `numbers'
    // >>> intersperse((new ArrayList<Long>(Arrays.asList())), (4l))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> intersperse((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))), (4l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l, (long)4l, (long)3l)))
    public static ArrayList<Long> intersperse(ArrayList<Long> numbers, long delimeter) {

        // Your Code Here
        // >>> numbers
        // (new ArrayList<Long>(Arrays.asList()))
        if (numbers.isEmpty()) {
            return numbers;
        }
        // >>> numbers
        // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))
        // >>> numbers.add((long)4l)
        // >>> numbers
        // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))
        ArrayList<Long> ret = new ArrayList<Long>(numbers);
        // >>> ret
        // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))
        // >>> ret.add(0, delimeter)
        // >>> ret
        // (new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)2l, (long)3l, (long)4l)))
        ret.add(0, delimeter);
        // >>> ret.remove(0)
        // >>> ret
        // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))
        // >>> ret.add(ret.size(), delimeter)
        // >>> ret
        // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)4l)))
        ret.add(ret.size(), delimeter);
        // >>> ret
        // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)4l)))
        // >>> ret.remove(ret.size() - 1)
        // >>> ret
        // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))
        return ret;
    }
    public static void main(String[] args) {
    assert(intersperse((new ArrayList<Long>(Arrays.asList())), (7l)).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(intersperse((new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)3l, (long)2l))), (8l)).equals((new ArrayList<Long>(Arrays.asList((long)5l, (long)8l, (long)6l, (long)8l, (long)3l, (long)8l, (long)2l)))));
    assert(intersperse((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)2l))), (2l)).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)2l, (long)2l, (long)2l)))));
    }

}
