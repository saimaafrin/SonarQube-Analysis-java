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

        // Check if the list has only one element
        // If yes, return an empty Optional
        if (lst.size() == 1) {
            return Optional.empty();
        }
        // Remove duplicates
        ArrayList<Long> unique = new ArrayList<>(new HashSet<>(lst));
        // Create a sorted list of the unique elements
        ArrayList<Long> sorted = new ArrayList<>(unique);
        Collections.sort(sorted);
        // Create a map that maps each unique element to its index
        HashMap<Long, Integer> index_map = new HashMap<>();
        for (int i = 0; i < unique.size(); i++) {
            index_map.put(unique.get(i), i);
        }
        // Create a list of tuples.
        // Each tuple contains an element and its index
        // in the original list
        ArrayList<Pair<Long, Integer>> lst_with_indices = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            lst_with_indices.add(new Pair<>(lst.get(i), i));
        }
        // Sort the list of tuples by the element value
        Collections.sort(lst_with_indices, new Comparator<Pair<Long, Integer>>() {
            @Override
            public int compare(Pair<Long, Integer> o1, Pair<Long, Integer> o2) {
                return o1.getValue0().compareTo(o2.getValue0());
            }
        });
        // Iterate over the list of tuples
        // Find the first element with the smallest index
        // Return the next element if it exists
        // Otherwise, return null
        for (int i = 0; i < lst_with_indices.size(); i++) {
            if (lst_with_indices.get(i).getValue0() != lst_with_indices.get(i + 1).getValue0()) {
                if (index_map.get(lst_with_indices.get(i).getValue0()) < index_map.get(lst_with_indices.get(i + 1).getValue0())) {
                    return Optional.of(lst_with_indices.get(i + 1).getValue0());
                }
            }
        }
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
