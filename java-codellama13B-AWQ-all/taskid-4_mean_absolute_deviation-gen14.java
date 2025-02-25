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

        // Calculate mean of numbers
        double mean = numbers.stream().mapToDouble((x) -> (double)x).average().orElse(Double.NaN);
        // Calculate mean absolute deviation
        double mad = numbers.stream().mapToDouble((x) -> Math.abs(x - (double)mean)).average().orElse(Double.NaN);
        // Cast to float for return value
        return (float)mad;
    }
    public static void main(String[] args) {
    assert(meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f)))) == (0.5f));
    assert(meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f)))) == (1.0f));
    assert(meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f)))) == (1.2f));
    }

}
