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

        if (numbers.size() < 2)
            return false;
        float[] floatArray = new float[numbers.size()];
        for (int i = 0; i < numbers.size(); i++)
            floatArray[i] = numbers.get(i);
        Arrays.sort(floatArray);
        for (int i = 0; i < floatArray.length - 1; i++)
            if (floatArray[i + 1] - floatArray[i] <= threshold)
                return true;
        return false;
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
