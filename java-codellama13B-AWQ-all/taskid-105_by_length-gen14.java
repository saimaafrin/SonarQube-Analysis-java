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

        // Write your code here
        long count_1 = 0, count_2 = 0, count_3 = 0, count_4 = 0, count_5 = 0, count_6 = 0, count_7 = 0, count_8 = 0, count_9 = 0;
        long count_10 = 0, count_11 = 0, count_12 = 0, count_13 = 0, count_14 = 0, count_15 = 0, count_16 = 0, count_17 = 0, count_18 = 0, count_19 = 0;
        for (long num: arr) {
            if (num == 1)
                count_1 += 1;
            else if (num == 2)
                count_2 += 1;
            else if (num == 3)
                count_3 += 1;
            else if (num == 4)
                count_4 += 1;
            else if (num == 5)
                count_5 += 1;
            else if (num == 6)
                count_6 += 1;
            else if (num == 7)
                count_7 += 1;
            else if (num == 8)
                count_8 += 1;
            else if (num == 9)
                count_9 += 1;
            else if (num > 9)
                count_10 += 1;
        }
        ArrayList<String> names = new ArrayList<String>();
        names.add("One");
        names.add("Two");
        names.add("Three");
        names.add("Four");
        names.add("Five");
        names.add("Six");
        names.add("Seven");
        names.add("Eight");
        names.add("Nine");
        for (long i = 0; i < count_1; i++)
            names.add("One");
        for (long i = 0; i < count_2; i++)
            names.add("Two");
        for (long i = 0; i < count_3; i++)
            names.add("Three");
        for (long i = 0; i < count_4; i++)
            names.add("Four");
        for (long i = 0; i < count_5; i++)
            names.add("Five");
        for (long i = 0; i < count_6; i++)
            names.add("Six");
        for (long i = 0; i <
    }
    public static void main(String[] args) {
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)1l, (long)4l, (long)5l, (long)8l, (long)2l, (long)3l)))).equals((new ArrayList<String>(Arrays.asList((String)"Eight", (String)"Five", (String)"Four", (String)"Three", (String)"Two", (String)"Two", (String)"One", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<String>(Arrays.asList()))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)55l)))).equals((new ArrayList<String>(Arrays.asList((String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)3l, (long)2l)))).equals((new ArrayList<String>(Arrays.asList((String)"Three", (String)"Two", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)9l, (long)4l, (long)8l)))).equals((new ArrayList<String>(Arrays.asList((String)"Nine", (String)"Eight", (String)"Four")))));
    }

}
