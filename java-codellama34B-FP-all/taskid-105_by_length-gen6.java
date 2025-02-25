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

        // Code here
        ArrayList<String> result = new ArrayList<String>();
        HashMap<Long, String> numbers = new HashMap<Long, String>();
        numbers.put(1l, "One");
        numbers.put(2l, "Two");
        numbers.put(3l, "Three");
        numbers.put(4l, "Four");
        numbers.put(5l, "Five");
        numbers.put(6l, "Six");
        numbers.put(7l, "Seven");
        numbers.put(8l, "Eight");
        numbers.put(9l, "Nine");
        ArrayList<Long> onlyDigits = new ArrayList<Long>();
        for (int i = 0; i < arr.size(); i++) {
            long item = arr.get(i);
            if (item >= 1 && item <= 9) {
                onlyDigits.add(item);
            }
        }
        Collections.sort(onlyDigits);
        Collections.reverse(onlyDigits);
        for (int i = 0; i < onlyDigits.size(); i++) {
            long item = onlyDigits.get(i);
            result.add(numbers.get(item));
        }
        return result;
    }
    public static void main(String[] args) {
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)1l, (long)4l, (long)5l, (long)8l, (long)2l, (long)3l)))).equals((new ArrayList<String>(Arrays.asList((String)"Eight", (String)"Five", (String)"Four", (String)"Three", (String)"Two", (String)"Two", (String)"One", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<String>(Arrays.asList()))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)55l)))).equals((new ArrayList<String>(Arrays.asList((String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)3l, (long)2l)))).equals((new ArrayList<String>(Arrays.asList((String)"Three", (String)"Two", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)9l, (long)4l, (long)8l)))).equals((new ArrayList<String>(Arrays.asList((String)"Nine", (String)"Eight", (String)"Four")))));
    }

}
