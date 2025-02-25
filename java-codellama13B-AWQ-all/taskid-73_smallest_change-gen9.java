import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list arr of integers, find the minimum number of elements that
    // need to be changed to make the array array list palindromic. A palindromic array array list is an array array list that
    // is read the same backwards and forwards. In one change, you can change one element to any other element.
    // For example:
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)5l, (long)4l, (long)7l, (long)9l, (long)6l))))
    // (4l)
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)3l, (long)2l, (long)2l))))
    // (1l)
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)1l))))
    // (0l)
    public static long smallestChange(ArrayList<Long> arr) {

        // This is a dynamic programming solution to the problem.
        // There are a few key ideas behind this approach:
        // - We can consider the array array list as a matrix, with each element
        //   of the array array list being a column and each row representing
        //   a starting point for the "palindrome" of the array array list.
        // - The "palindrome" of the array array list can be created by reading
        //   the array array list backwards and forwards, starting from the end
        //   of the array array list.
        // - We can then define a function that takes as input a starting point
        //   and a length, and returns the minimum number of elements that need
        //   to be changed to make a palindrome of the array array list of length
        //   length. This function can be defined recursively as follows:
        //       - If the length is zero, then the minimum number of elements
        //         that need to be changed is zero.
        //       - Otherwise, if the length is one, then the minimum number of
        //         elements that need to be changed is one.
        //       - Otherwise, if the starting point is equal to the length, then
        //         the minimum number of elements that need to be changed is zero.
        //       - Otherwise, the minimum number of elements that need to be changed
        //         is the minimum of:
        //             - The minimum number of elements that need to be changed
        //               to make the array array list palindromic for the subarray
        //               of length (length - 1) that starts at position (starting
        //               point + 1)
        //             - The minimum number of elements that need to be changed
        //               to make the array array list palindromic for the subarray
        //               of length (length - 1) that starts at position (starting
        //               point - 1)
        //       - The minimum number of elements that need to be changed is then
        //         incremented by one if the starting point is equal to the first
        //         element of the array array list, and decremented by one if the
        //         starting point is equal to the last element of the array array list.
        // - We can then define a function that takes as input a starting point
        //   and a length, and returns the minimum number of elements that need
        //   to be changed to make a palindrome of the array array list of length
        //   length. This function can be defined recursively as follows:
        //       - If the length is zero, then the minimum number of elements
        //         that need to be changed is zero.
        //       - Otherwise, if the length is one, then the minimum number of
        //         elements that need to be changed is one.
        //       - Otherwise, the minimum number of elements that need to be changed
        //         is the minimum of:
        //             - The minimum number of elements that need to be changed
    }
    public static void main(String[] args) {
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)5l, (long)4l, (long)7l, (long)9l, (long)6l)))) == (4l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)3l, (long)2l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)4l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)1l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)1l, (long)3l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l)))) == (1l));
    }

}
