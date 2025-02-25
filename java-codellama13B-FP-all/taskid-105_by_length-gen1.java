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

        ArrayList<String> sorted = new ArrayList<String>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).longValue() > 1 && arr.get(i).longValue() < 10) {
                sorted.add(String.valueOf(arr.get(i)));
            }
        }
        Collections.sort(sorted);
        Collections.reverse(sorted);
        for (int i = 0; i < sorted.size(); i++) {
            switch (sorted.get(i)) {
                case "2":
                    sorted.set(i, "Two");
                    break;
                case "3":
                    sorted.set(i, "Three");
                    break;
                case "4":
                    sorted.set(i, "Four");
                    break;
                case "5":
                    sorted.set(i, "Five");
                    break;
                case "6":
                    sorted.set(i, "Six");
                    break;
                case "7":
                    sorted.set(i, "Seven");
                    break;
                case "8":
                    sorted.set(i, "Eight");
                    break;
                case "9":
                    sorted.set(i, "Nine");
                    break;
                case "1":
                    sorted.set(i, "One");
                    break;
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)1l, (long)4l, (long)5l, (long)8l, (long)2l, (long)3l)))).equals((new ArrayList<String>(Arrays.asList((String)"Eight", (String)"Five", (String)"Four", (String)"Three", (String)"Two", (String)"Two", (String)"One", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<String>(Arrays.asList()))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)55l)))).equals((new ArrayList<String>(Arrays.asList((String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)3l, (long)2l)))).equals((new ArrayList<String>(Arrays.asList((String)"Three", (String)"Two", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)9l, (long)4l, (long)8l)))).equals((new ArrayList<String>(Arrays.asList((String)"Nine", (String)"Eight", (String)"Four")))));
    }

}
