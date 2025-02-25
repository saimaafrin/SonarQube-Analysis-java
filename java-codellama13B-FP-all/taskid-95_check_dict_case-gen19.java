import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a hash map, return true if all keys are strings in lower 
    // case or all keys are strings in upper case, else return false.
    // The function should return false is the given hash map is empty.
    // Examples:
    // >>> checkDictCase((new HashMap<String,String>(Map.of("a", "apple", "b", "banana"))))
    // (true)
    // >>> checkDictCase((new HashMap<String,String>(Map.of("a", "apple", "A", "banana", "B", "banana"))))
    // (false)
    // >>> checkDictCase((new HashMap<String,String>(Map.of("a", "apple", 8l, "banana", "a", "apple"))))
    // (false)
    // >>> checkDictCase((new HashMap<String,String>(Map.of("Name", "John", "Age", "36", "City", "Houston"))))
    // (false)
    // >>> checkDictCase((new HashMap<String,String>(Map.of("STATE", "NC", "ZIP", "12345"))))
    // (true)
    public static boolean checkDictCase(HashMap<String,String> dict) {

        if (dict == null) {
            throw new IllegalArgumentException("dict cannot be null");
        }
        if (dict.size() == 0) {
            return false;
        }
        String[] keys = dict.keySet().toArray(new String[0]);
        String key = keys[0];
        char[] key_array = key.toCharArray();
        boolean isUpper = false;
        boolean isLower = false;
        for (int i = 0; i < key_array.length; i++) {
            if (Character.isUpperCase(key_array[i])) {
                isUpper = true;
            } else if (Character.isLowerCase(key_array[i])) {
                isLower = true;
            }
        }
        for (int i = 1; i < keys.length; i++) {
            char[] key_array_new = keys[i].toCharArray();
            for (int j = 0; j < key_array_new.length; j++) {
                if ((isUpper && Character.isLowerCase(key_array_new[j]))
                    || (isLower && Character.isUpperCase(key_array_new[j]))) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
    assert(checkDictCase((new HashMap<String,String>(Map.of("p", "pineapple", "b", "banana")))) == (true));
    assert(checkDictCase((new HashMap<String,String>(Map.of("p", "pineapple", "A", "banana", "B", "banana")))) == (false));
    assert(checkDictCase((new HashMap<String,String>(Map.of("p", "pineapple", "5", "banana", "a", "apple")))) == (false));
    assert(checkDictCase((new HashMap<String,String>(Map.of("Name", "John", "Age", "36", "City", "Houston")))) == (false));
    assert(checkDictCase((new HashMap<String,String>(Map.of("STATE", "NC", "ZIP", "12345")))) == (true));
    assert(checkDictCase((new HashMap<String,String>(Map.of("fruit", "Orange", "taste", "Sweet")))) == (true));
    assert(checkDictCase((new HashMap<String,String>())) == (false));
    }

}
