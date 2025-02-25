import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // triples_sum_to_zero takes an array array list of integers as an input.
    // it returns true if there are three distinct elements in the array list that
    // sum to zero, and false otherwise.
    // >>> triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)5l, (long)0l))))
    // (false)
    // >>> triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)-2l, (long)1l))))
    // (true)
    // >>> triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)7l))))
    // (false)
    // >>> triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)-5l, (long)3l, (long)9l, (long)7l))))
    // (true)
    // >>> triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l))))
    // (false)
    public static boolean triplesSumToZero(ArrayList<Long> l) {

        // The first step is to sort the list.
        // We are going to use the built in sort method to sort the list, but
        // you could use your own implementation of insertion sort, merge sort
        // or some other sorting algorithm of your choice.
        Collections.sort(l);
        // Now that we have sorted the list we can start checking for the existence
        // of three distinct elements that sum to zero.
        // We can do this by using a for loop to iterate over the list.
        for (int i = 0; i < l.size() - 2; i++) {
            // First we check to see if we can find the negative of the element
            // at index i. We do this by doing a binary search for the negative
            // of element at index i.
            // We can do this using a function that has the same signature as the
            // binarySearch function, but returns true if the element at index
            // i is equal to the negative of element at index j.
            if (binarySearch(l, i, -1 * l.get(i))) {
                // If we have found the negative of the element at index i,
                // we can check to see if we can find the negative of the sum
                // of element at index i and the element at index j.
                for (int j = i + 1; j < l.size() - 1; j++) {
                    if (binarySearch(l, j, -1 * (l.get(i) + l.get(j)))) {
                        // If we have found the negative of the sum of the elements
                        // at index i and j, we can return true since we have found
                        // three distinct elements in the list that sum to zero.
                        return true;
                    }
                }
            }
        }
        // If we have reached this point it means that there are no elements in the
        // list that sum to zero. We can return false.
        return false;
    }
    public static void main(String[] args) {
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)5l, (long)0l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)5l, (long)-1l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)-2l, (long)1l)))) == (true));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)7l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)5l, (long)7l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)-5l, (long)3l, (long)9l, (long)7l)))) == (true));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)5l, (long)-100l)))) == (false));
    assert(triplesSumToZero((new ArrayList<Long>(Arrays.asList((long)100l, (long)3l, (long)5l, (long)-100l)))) == (false));
    }

}
