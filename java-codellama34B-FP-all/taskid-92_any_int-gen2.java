import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that takes 3 numbers.
    // Returns true if one of the numbers is equal to the sum of the other two, and all numbers are integers.
    // Returns false in any other cases.
    // Examples
    // >>> anyInt((float)5l, (float)2l, (float)7l)
    // (true)
    // >>> anyInt((float)3l, (float)2l, (float)2l)
    // (false)
    // >>> anyInt((float)3l, (float)-2l, (float)1l)
    // (true)
    // >>> anyInt((3.6f), (-2.2f), (float)2l)
    // (false)
    public static boolean anyInt(float x, float y, float z) {

        // 1. Create an array of the numbers
        float[] arr = {x, y, z};
        // 2. Check the numbers
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != (int)arr[i])
                return false;
        }
        // 3. Check the sum of all the numbers
        if(x + y + z != (int)(x + y + z))
            return false;
        // 4. Check for duplicates
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    return false;
            }
        }
        // 5. Check the sums
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] + arr[j] == (int)(arr[i] + arr[j]))
                    return true;
            }
        }
        // 6. Return false
        return false;
    }
    public static void main(String[] args) {
    assert(anyInt((float)2l, (float)3l, (float)1l) == (true));
    assert(anyInt((2.5f), (float)2l, (float)3l) == (false));
    assert(anyInt((1.5f), (float)5l, (3.5f)) == (false));
    assert(anyInt((float)2l, (float)6l, (float)2l) == (false));
    assert(anyInt((float)4l, (float)2l, (float)2l) == (true));
    assert(anyInt((2.2f), (2.2f), (2.2f)) == (false));
    assert(anyInt((float)-4l, (float)6l, (float)2l) == (true));
    assert(anyInt((float)2l, (float)1l, (float)1l) == (true));
    assert(anyInt((float)3l, (float)4l, (float)7l) == (true));
    assert(anyInt((3.0f), (float)4l, (float)7l) == (false));
    }

}
