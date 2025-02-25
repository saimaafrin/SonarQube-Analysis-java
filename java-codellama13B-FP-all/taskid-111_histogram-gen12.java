import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string representing a space separated lowercase letters, return a hash map
    // of the letter with the most repetition and containing the corresponding count.
    // If several letters have the same occurrence, return all of them.
    // Example:
    // >>> histogram(("a b c"))
    // (new HashMap<String,Long>(Map.of("a", 1l, "b", 1l, "c", 1l)))
    // >>> histogram(("a b b a"))
    // (new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))
    // >>> histogram(("a b c a b"))
    // (new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))
    // >>> histogram(("b b b b a"))
    // (new HashMap<String,Long>(Map.of("b", 4l)))
    // >>> histogram((""))
    // (new HashMap<String,Long>())
    public static HashMap<String,Long> histogram(String test) {

        // Write your code here
        HashMap<String,Long> map = new HashMap<>();
        if (test.length() == 0){
            return map;
        }
        String[] strArr = test.split(" ");
        Arrays.sort(strArr);
        int prev = 1;
        int count = 1;
        for (int i = 1; i < strArr.length; i++){
            if (strArr[i].equals(strArr[i - 1])){
                count++;
            }
            else{
                prev = count;
                count = 1;
            }
            if (prev > count){
                if (map.containsKey(strArr[i - 1])){
                    map.replace(strArr[i - 1], (long)prev);
                }
                else{
                    map.put(strArr[i - 1], (long)prev);
                }
            }
            else if (prev == count){
                if (map.containsKey(strArr[i - 1])){
                    map.replace(strArr[i - 1], (long)prev);
                }
                else{
                    map.put(strArr[i - 1], (long)prev);
                }
            }
            else{
                if (map.containsKey(strArr[i - 1])){
                    map.replace(strArr[i - 1], (long)prev);
                }
                else{
                    map.put(strArr[i - 1], (long)prev);
                }
            }
        }
        return map;
    }
    public static void main(String[] args) {
    assert(histogram(("a b b a")).equals((new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))));
    assert(histogram(("a b c a b")).equals((new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))));
    assert(histogram(("a b c d g")).equals((new HashMap<String,Long>(Map.of("a", 1l, "b", 1l, "c", 1l, "d", 1l, "g", 1l)))));
    assert(histogram(("r t g")).equals((new HashMap<String,Long>(Map.of("r", 1l, "t", 1l, "g", 1l)))));
    assert(histogram(("b b b b a")).equals((new HashMap<String,Long>(Map.of("b", 4l)))));
    assert(histogram(("r t g")).equals((new HashMap<String,Long>(Map.of("r", 1l, "t", 1l, "g", 1l)))));
    assert(histogram(("")).equals((new HashMap<String,Long>())));
    assert(histogram(("a")).equals((new HashMap<String,Long>(Map.of("a", 1l)))));
    }

}
