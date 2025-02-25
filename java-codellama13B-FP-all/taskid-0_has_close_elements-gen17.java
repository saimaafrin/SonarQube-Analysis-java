import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Check if in given array list of numbers, are any two numbers closer to each other than
    // given threshold.
    // >>> hasCloseElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f))), (0.5f))
    // (false)
    // >>> hasCloseElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.8f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.0f))), (0.3f))
    // (true)
    public static boolean hasCloseElements(ArrayList<Float> numbers, float threshold) {

        // Add the first and last element to avoid edge case
        numbers.add(0, numbers.get(0) - 1);
        numbers.add(numbers.get(numbers.size() - 1) + 1);
        float maxThreshold = 0;
        for (int i = 1; i < numbers.size(); i++) {
            float difference = numbers.get(i) - numbers.get(i - 1);
            if (difference <= threshold) {
                maxThreshold = Math.max(maxThreshold, difference);
            }
        }
        return maxThreshold >= threshold;
    }
    public static void main(String[] args) {
    assert(hasCloseElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.9f, (float)4.0f, (float)5.0f, (float)2.2f))), (0.3f)) == (true));
    assert(hasCloseElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.9f, (float)4.0f, (float)5.0f, (float)2.2f))), (0.05f)) == (false));
    assert(hasCloseElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)5.9f, (float)4.0f, (float)5.0f))), (0.95f)) == (true));
    assert(hasCloseElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)5.9f, (float)4.0f, (float)5.0f))), (0.8f)) == (false));
    assert(hasCloseElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.0f))), (0.1f)) == (true));
    assert(hasCloseElements((new ArrayList<Float>(Arrays.asList((float)1.1f, (float)2.2f, (float)3.1f, (float)4.1f, (float)5.1f))), (1.0f)) == (true));
    assert(hasCloseElements((new ArrayList<Float>(Arrays.asList((float)1.1f, (float)2.2f, (float)3.1f, (float)4.1f, (float)5.1f))), (0.5f)) == (false));
    }

}
