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

        // Create a hash map to store the index and count of each element
        HashMap<Long, ArrayList<Long>> map = new HashMap<Long, ArrayList<Long>>();
        for (int i = 0; i < arr.size(); i++) {
            if (!map.containsKey(arr.get(i))) {
                ArrayList<Long> list = new ArrayList<Long>();
                list.add((long) 0l);
                list.add((long) 0l);
                map.put(arr.get(i), list);
            }
            map.get(arr.get(i)).set(0, map.get(arr.get(i)).get(0) + 1);
            map.get(arr.get(i)).set(1, (long) i);
        }
        // Initialize min count and index of elements that need to be changed
        long minCount = 0l;
        ArrayList<Long> minIndex = new ArrayList<Long>();
        // Iterate through the array to find the number of elements that need to be changed
        for (int i = 0; i < arr.size(); i++) {
            boolean found = false;
            if (map.get(arr.get(i)).get(0) % 2 == 0) {
                continue;
            }
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j) && map.get(arr.get(j)).get(0) > 1 && arr.get(i) != arr.get(j)
                        && map.get(arr.get(j)).get(0) % 2 == 0) {
                    found = true;
                    map.get(arr.get(j)).set(0, map.get(arr.get(j)).get(0) - 2);
                    map.get(arr.get(i)).set(0, map.get(arr.get(i)).get(0) - 1);
                    minCount++;
                    minIndex.add(map.get(arr.get(i)).get(1));
                    break;
                }
            }
            if (!found) {
                minCount++;
                minIndex.add(map.get(arr.get(i)).get(1));
            }
        }
        // Sort the index of elements that need to be changed
        minIndex.sort((e1, e2) -> {
            if (e1 < e2)
                return -1;
            if (e1 > e2)
                return 1;
            return 0;
        });
        // Iterate through the index of elements that need to be changed to find the minimum number of changes
        long count = 0l;
        long index = -1l;
        for (int i = 0; i < minIndex.size(); i++) {
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
