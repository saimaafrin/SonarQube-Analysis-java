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

        // Calculate the mean of the data set:
        float sum = 0.0f;
        for (int i = 0; i < numbers.size(); i++)
            sum += numbers.get(i);
        float mean = sum / numbers.size();
        // Calculate the absolute difference between each number and the mean:
        ArrayList<Float> diffs = new ArrayList<Float>();
        for (int i = 0; i < numbers.size(); i++)
            diffs.add(Math.abs(numbers.get(i) - mean));
        // Calculate the mean of these absolute differences.
        sum = 0.0f;
        for (int i = 0; i < diffs.size(); i++)
            sum += diffs.get(i);
        return sum / diffs.size();
    }
    public static void main(String[] args) {
    assert(meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f)))) == (0.5f));
    assert(meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f)))) == (1.0f));
    assert(meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f)))) == (1.2f));
    }

}
