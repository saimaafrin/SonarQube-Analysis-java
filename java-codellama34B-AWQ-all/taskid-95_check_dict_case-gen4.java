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

        int str_cnt = 0;
        int str_low_cnt = 0;
        int str_up_cnt = 0;
        for (Map.Entry<String,String> entry : dict.entrySet())
        {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.length() > 0)
                str_cnt++;
        }
        for (Map.Entry<String,String> entry : dict.entrySet())
        {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.length() > 0)
            {
                if (key.equals(key.toLowerCase()))
                    str_low_cnt++;
                else if (key.equals(key.toUpperCase()))
                    str_up_cnt++;
                else
                    return false;
            }
        }
        return str_low_cnt > 0 && str_low_cnt == str_cnt || str_up_cnt > 0 && str_up_cnt == str_cnt;
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
