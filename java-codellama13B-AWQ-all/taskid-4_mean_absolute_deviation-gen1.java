import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given array list of input numbers, calculate Mean Absolute Deviation
    // around the mean of this dataset.
    // Mean Absolute Deviation is the average absolute difference between each
    // element and a centerpoint (mean in this case):
    // MAD = average | x - x_mean |
    // >>> meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f))))
    // (1.0f)
    public static float meanAbsoluteDeviation(ArrayList<Float> numbers) {

        Float sum = numbers.stream().mapToFloat(number -> number).sum();
        Float mean = sum / numbers.size();
        Float sumAbsoluteDifferences = numbers.stream().map(number -> Math.abs(number - mean)).mapToFloat(number -> number).sum();
        return sumAbsoluteDifferences / numbers.size();
    }
    public static void main(String[] args) {
    assert(meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f)))) == (0.5f));
    assert(meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f)))) == (1.0f));
    assert(meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f)))) == (1.2f));
    }

}
