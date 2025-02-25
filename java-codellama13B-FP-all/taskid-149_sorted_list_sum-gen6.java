import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that accepts an array array list of strings as a parameter,
    // deletes the strings that have odd lengths from it,
    // and returns the resulted array list with a sorted order,
    // The array list is always an array array list of strings and never an array array list of numbers,
    // and it may contain duplicates.
    // The order of the array list should be ascending by length of each word, and you
    // should return the array list sorted by that rule.
    // If two words have the same length, sort the array list alphabetically.
    // The function should return an array array list of strings in sorted order.
    // You may assume that all words will have the same length.
    // For example:
    // >>> listSort((new ArrayList<String>(Arrays.asList((String)"aa", (String)"a", (String)"aaa"))))
    // (new ArrayList<String>(Arrays.asList((String)"aa")))
    // >>> listSort((new ArrayList<String>(Arrays.asList((String)"ab", (String)"a", (String)"aaa", (String)"cd"))))
    // (new ArrayList<String>(Arrays.asList((String)"ab", (String)"cd")))
    public static ArrayList<String> sortedListSum(ArrayList<String> lst) {

        String sum = lst.stream().collect(Collectors.joining());
        int n = sum.length();
        int[] len = new int[n];
        int i = 0;
        int j = 0;
        while (i < n && j < n) {
            int l = lst.get(i).length();
            len[i] = l;
            j += l;
            i += 1;
        }
        ArrayList<String> ret = new ArrayList<>();
        while (j > 0) {
            int idx = 0;
            int min = len[idx];
            for (int i1 = 1; i1 < n; i1++) {
                if (len[i1] < min) {
                    idx = i1;
                    min = len[idx];
                }
            }
            ret.add(lst.get(idx));
            j -= min;
            len[idx] = 0;
        }
        return ret;
    }
    public static void main(String[] args) {
    assert(sortedListSum((new ArrayList<String>(Arrays.asList((String)"aa", (String)"a", (String)"aaa")))).equals((new ArrayList<String>(Arrays.asList((String)"aa")))));
    assert(sortedListSum((new ArrayList<String>(Arrays.asList((String)"school", (String)"AI", (String)"asdf", (String)"b")))).equals((new ArrayList<String>(Arrays.asList((String)"AI", (String)"asdf", (String)"school")))));
    assert(sortedListSum((new ArrayList<String>(Arrays.asList((String)"d", (String)"b", (String)"c", (String)"a")))).equals((new ArrayList<String>(Arrays.asList()))));
    assert(sortedListSum((new ArrayList<String>(Arrays.asList((String)"d", (String)"dcba", (String)"abcd", (String)"a")))).equals((new ArrayList<String>(Arrays.asList((String)"abcd", (String)"dcba")))));
    assert(sortedListSum((new ArrayList<String>(Arrays.asList((String)"AI", (String)"ai", (String)"au")))).equals((new ArrayList<String>(Arrays.asList((String)"AI", (String)"ai", (String)"au")))));
    assert(sortedListSum((new ArrayList<String>(Arrays.asList((String)"a", (String)"b", (String)"b", (String)"c", (String)"c", (String)"a")))).equals((new ArrayList<String>(Arrays.asList()))));
    assert(sortedListSum((new ArrayList<String>(Arrays.asList((String)"aaaa", (String)"bbbb", (String)"dd", (String)"cc")))).equals((new ArrayList<String>(Arrays.asList((String)"cc", (String)"dd", (String)"aaaa", (String)"bbbb")))));
    }

}
