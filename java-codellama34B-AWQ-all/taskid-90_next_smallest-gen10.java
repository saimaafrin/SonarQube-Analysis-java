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

        if (lst.size() == 0) {
            return Optional.empty();
        }
        // 1. Sort array list in ascending order.
        lst.sort(new Comparator<Long>() {
                public int compare(Long a, Long b) {
                    return (a > b ? 1 : (a < b ? -1 : 0));
                }
            }
        );
        // 2. Initialize two pointer variables: prev, cur
        // to point to the smallest element in the array list.
        // The pointer variables should be pointing to the first two elements.
        int i = 0;
        int j = 1;
        while (j < lst.size()) {
            // 3. If cur < prev,
            //    then move the pointers to the next element,
            //    and return the element pointed to by prev.
            if (lst.get(j) < lst.get(i)) {
                return Optional.of(lst.get(i));
            }
            // 4. If prev == cur,
            //    then move the pointers to the next element,
            //    and return Optional.empty().
            else if (lst.get(j) == lst.get(i)) {
                if (j + 1 < lst.size()) {
                    j++;
                } else {
                    return Optional.empty();
                }
            }
            // 5. If prev != cur,
            //    then move the pointers to the next element,
            //    and repeat step 3 and 4.
            else {
                i++;
                j++;
            }
        }
        // 6. If the two pointers point to the last element of the array list,
        //    then return Optional.empty().
        return Optional.empty();
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
