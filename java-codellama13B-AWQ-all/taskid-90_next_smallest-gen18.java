import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given an array array list of integers.
    // Write a function next_smallest() that returns the 2nd smallest element of the array list.
    // Return null if there is no such element.
    // >>> nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l))))
    // 2l
    // >>> nextSmallest((new ArrayList<Long>(Arrays.asList((long)5l, (long)1l, (long)4l, (long)3l, (long)2l))))
    // 2l
    // >>> nextSmallest((new ArrayList<Long>(Arrays.asList())))
    // Optional.empty()
    // >>> nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l))))
    // Optional.empty()
    public static Optional<Long> nextSmallest(ArrayList<Long> lst) {

        // The key here is to use the Collections.sort method with a comparator that only compares the second smallest element
        // with the smallest element. It does this by sorting in descending order and then reversing the result. The second
        // smallest element will now be the second element in the list and the first element will be the smallest element.
        // The sorting is done in place, so we don't need to assign the result to a variable.
        Collections.sort(lst, new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                if (a.equals(b)) {
                    return 0;
                }
                return -1 * a.compareTo(b);
            }
        });
        // Reverse the list to put the smallest element at the front of the list
        Collections.reverse(lst);
        // Check if there is a second element in the list. If not, return empty.
        if (lst.size() < 2) {
            return Optional.empty();
        }
        // Return the second element in the list.
        return Optional.of(lst.get(1));
    }
    public static void main(String[] args) {
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l)))).equals(2l));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)5l, (long)1l, (long)4l, (long)3l, (long)2l)))).equals(2l));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList()))).equals(Optional.empty()));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l)))).equals(Optional.empty()));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l, (long)0l)))).equals(1l));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l)))).equals(Optional.empty()));
    assert(nextSmallest((new ArrayList<Long>(Arrays.asList((long)-35l, (long)34l, (long)12l, (long)-45l)))).equals(-35l));
    }

}
