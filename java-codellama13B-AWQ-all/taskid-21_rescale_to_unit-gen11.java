import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given array list of numbers (of at least two elements), apply a linear transform to that array list,
    // such that the smallest number will become 0 and the largest will become 1
    // >>> rescaleToUnit((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f))))
    // (new ArrayList<Float>(Arrays.asList((float)0.0f, (float)0.25f, (float)0.5f, (float)0.75f, (float)1.0f)))
    public static ArrayList<Float> rescaleToUnit(ArrayList<Float> numbers) {

        ArrayList<Float> result = new ArrayList<Float>(Collections.nCopies(numbers.size(), 0.0f));
        float min = Collections.min(numbers);
        float max = Collections.max(numbers);
        if (max == min) return result;
        for (int i = 0; i < numbers.size(); i++) {
            result.set(i, (numbers.get(i) - min) / (max - min));
        }
        return result;
    }
    public static void main(String[] args) {
    assert(rescaleToUnit((new ArrayList<Float>(Arrays.asList((float)2.0f, (float)49.9f)))).equals((new ArrayList<Float>(Arrays.asList((float)0.0f, (float)1.0f)))));
    assert(rescaleToUnit((new ArrayList<Float>(Arrays.asList((float)100.0f, (float)49.9f)))).equals((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)0.0f)))));
    assert(rescaleToUnit((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f)))).equals((new ArrayList<Float>(Arrays.asList((float)0.0f, (float)0.25f, (float)0.5f, (float)0.75f, (float)1.0f)))));
    assert(rescaleToUnit((new ArrayList<Float>(Arrays.asList((float)2.0f, (float)1.0f, (float)5.0f, (float)3.0f, (float)4.0f)))).equals((new ArrayList<Float>(Arrays.asList((float)0.25f, (float)0.0f, (float)1.0f, (float)0.5f, (float)0.75f)))));
    assert(rescaleToUnit((new ArrayList<Float>(Arrays.asList((float)12.0f, (float)11.0f, (float)15.0f, (float)13.0f, (float)14.0f)))).equals((new ArrayList<Float>(Arrays.asList((float)0.25f, (float)0.0f, (float)1.0f, (float)0.5f, (float)0.75f)))));
    }

}
