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

        float numbersMin = numbers.stream().min(Float::compare).get();
        float numbersMax = numbers.stream().max(Float::compare).get();
        int numbersMinIndex = numbers.indexOf(numbersMin);
        int numbersMaxIndex = numbers.indexOf(numbersMax);
        if (numbersMin == numbersMax) {
            return true;
        }
        if (numbersMinIndex == numbersMaxIndex) {
            return true;
        }
        if (numbersMinIndex > numbersMaxIndex) {
            int temp = numbersMinIndex;
            numbersMinIndex = numbersMaxIndex;
            numbersMaxIndex = temp;
        }
        if (Math.abs(numbersMinIndex - numbersMaxIndex) == 1) {
            return true;
        }
        if (Math.abs(numbersMinIndex - numbersMaxIndex) > 1) {
            return false;
        }
        return true;
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
