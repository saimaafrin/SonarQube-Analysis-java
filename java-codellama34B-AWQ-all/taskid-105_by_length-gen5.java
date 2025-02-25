import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of integers, sort the integers that are between 1 and 9 inclusive,
    // reverse the resulting array array list, and then replace each digit by its corresponding name from
    // "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine".
    // For example:
    // >>> byLength((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)1l, (long)4l, (long)5l, (long)8l, (long)2l, (long)3l))))
    // (new ArrayList<String>(Arrays.asList((String)"Eight", (String)"Five", (String)"Four", (String)"Three", (String)"Two", (String)"Two", (String)"One", (String)"One")))
    // If the array array list is empty, return an empty array array list:
    // >>> byLength((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<String>(Arrays.asList()))
    // If the array array list has any strange number ignore it:
    // >>> byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)55l))))
    // (new ArrayList<String>(Arrays.asList((String)"One")))
    public static ArrayList<String> byLength(ArrayList<Long> arr) {

        Map<String, Long> map = new HashMap<String, Long>();
        for (long n : arr) {
            if (n > 0 && n < 10) {
                map.put(String.valueOf(n), n);
            }
        }
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 1; i < 10; i++) {
            if (map.containsKey(String.valueOf(i))) {
                result.add(String.valueOf(map.get(String.valueOf(i))));
            }
        }
        Collections.sort(result, new Comparator<String>() {
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        Map<Long, String> map2 = new HashMap<Long, String>();
        map2.put(1l, "One");
        map2.put(2l, "Two");
        map2.put(3l, "Three");
        map2.put(4l, "Four");
        map2.put(5l, "Five");
        map2.put(6l, "Six");
        map2.put(7l, "Seven");
        map2.put(8l, "Eight");
        map2.put(9l, "Nine");
        ArrayList<String> result2 = new ArrayList<String>();
        for (String s : result) {
            result2.add(map2.get(Long.valueOf(s)));
        }
        return result2;
    }
    public static void main(String[] args) {
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)1l, (long)4l, (long)5l, (long)8l, (long)2l, (long)3l)))).equals((new ArrayList<String>(Arrays.asList((String)"Eight", (String)"Five", (String)"Four", (String)"Three", (String)"Two", (String)"Two", (String)"One", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<String>(Arrays.asList()))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)55l)))).equals((new ArrayList<String>(Arrays.asList((String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)3l, (long)2l)))).equals((new ArrayList<String>(Arrays.asList((String)"Three", (String)"Two", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)9l, (long)4l, (long)8l)))).equals((new ArrayList<String>(Arrays.asList((String)"Nine", (String)"Eight", (String)"Four")))));
    }

}
