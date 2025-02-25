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

        if(dict.isEmpty()) return false;
        String[] keys = dict.keySet().toArray(new String[0]);
        boolean isLower = keys[0].matches("[a-z]+");
        boolean isUpper = keys[0].matches("[A-Z]+");
        for(int i = 1; i < keys.length; i++) {
            if(isLower && !(keys[i].matches("[a-z]+")) || isUpper && !(keys[i].matches("[A-Z]+"))) return false;
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
