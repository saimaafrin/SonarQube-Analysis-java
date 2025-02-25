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

        String[] arr = new String[dict.size()];
        dict.keySet().toArray(arr);
        String[] letters = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            letters[i] = Character.toString(arr[i].charAt(0));
        }
        String[] letters2 = new String[letters.length];
        for (int i = 0; i < letters.length; i++) {
            letters2[i] = letters[i].toUpperCase();
        }
        if (Arrays.equals(letters, letters2) || Arrays.equals(letters, letters2)) {
            return true;
        }
        else {
            return false;
        }
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
