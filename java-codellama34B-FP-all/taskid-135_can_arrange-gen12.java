import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function which returns the largest index of an element which
    // is not greater than or equal to the element immediately preceding it. If
    // no such element exists then return -1. The given array array list will not contain
    // duplicate values.
    // Examples:
    // >>> canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)3l, (long)5l))))
    // (3l)
    // >>> canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (-1l)
    public static long canArrange(ArrayList<Long> arr) {

        if (arr.size() <= 1)
            return -1;
        // Write your code here
        // https://javarevisited.blogspot.com/2015/06/3-ways-to-iterate-over-ArrayList-in-java.html#ixzz7a0mE1UJN
        // https://www.geeksforgeeks.org/array-stream-in-java-with-examples/
        // https://stackoverflow.com/questions/32051759/java-8-streams-filter-on-two-lists
        // https://stackoverflow.com/questions/20950039/compare-adjacent-elements-in-arraylist
        // https://stackoverflow.com/questions/20320648/check-if-an-array-is-sorted-in-descending-order
        // https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
        // https://www.geeksforgeeks.org/reverse-an-array-in-java/
        // https://www.geeksforgeeks.org/arrays-binarysearch-in-java-with-examples/
        // https://www.geeksforgeeks.org/how-to-find-the-last-index-of-an-element-in-an-array-in-java/
        // https://www.geeksforgeeks.org/find-the-last-occurrence-of-an-element-in-a-sorted-array/
        // https://www.geeksforgeeks.org/java-util-arrays-binarysearch-java-examples/
        // https://www.geeksforgeeks.org/java-util-arrays-binarysearch-java-examples/
        // https://stackoverflow.com/questions/39791281/java-stream-filter-list-of-objects-based-on-a-condition
        // https://stackoverflow.com/questions/47445068/filter-and-count-the-elements-in-an-arraylist
        // https://stackoverflow.com/questions/21033524/how-to-iterate-through-an-arraylist-of-objects-using-a-foreach-loop
        // https://stackoverflow.com/questions/21033524/how-to-iterate-through-an-arraylist-of-objects-using-a-foreach-loop
        // https://www.geeksforgeeks.org/java-util-arrays-binarysearch-java-examples/
        // https://stackoverflow.com/questions/29332701/how-to-use-java-binarysearch-to-find-index-of-an-object-in-arraylist
        // https://stackoverflow.com/questions/49269181/get-last-index-of-object-in-arraylist-of-objects
        // https://www.geeksforgeeks.org/java-util-arrays-binarysearch-java-examples/
        // https://www.geeksforgeeks.org/binary-search/
        // https://www.geeksforgeeks.org/binary-search/
        // https://www.geeksforgeeks.org/java-util-arrays-binarysearch-java-examples/
        //
    }
    public static void main(String[] args) {
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)3l, (long)5l)))) == (3l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)5l)))) == (-1l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l, (long)10l)))) == (2l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)4l, (long)8l, (long)5l, (long)7l, (long)3l)))) == (4l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList()))) == (-1l));
    }

}
