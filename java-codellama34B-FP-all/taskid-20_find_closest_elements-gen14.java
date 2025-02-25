import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // From a supplied array list of numbers (of length at least two) select and return two that are the closest to each
    // other and return them in order (smaller number, larger number).
    // >>> findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.2f))))
    // (Pair.with(2.0f, 2.2f))
    // >>> findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.0f))))
    // (Pair.with(2.0f, 2.0f))
    public static Pair<Float, Float> findClosestElements(ArrayList<Float> numbers) {

        // The following array will contain the indexes of the two closest elements
        int[] closestElements = new int[2];
        // The following array will contain the values of the two closest elements
        Float[] closestValues = new Float[2];
        // Initialise the first closest value
        closestValues[0] = numbers.get(0);
        // Initialise the second closest value
        closestValues[1] = numbers.get(1);
        // Initialise the first closest index
        closestElements[0] = 0;
        // Initialise the second closest index
        closestElements[1] = 1;
        // We want to iterate over the list of numbers and check which ones are closest
        // to the current closest values
        for (int i = 0; i < numbers.size(); i++) {
            // We will store the current element
            Float element = numbers.get(i);
            // Check if the current element is closer to the first closest value
            if (Math.abs(element - closestValues[0]) < Math.abs(closestValues[0] - closestValues[1])) {
                // Update the closest elements
                closestElements[0] = i;
                closestElements[1] = closestElements[0] + 1;
                closestValues[0] = element;
                closestValues[1] = numbers.get(closestElements[1]);
            } else if (Math.abs(element - closestValues[1]) < Math.abs(closestValues[1] - closestValues[0])) {
                closestElements[1] = i;
                closestElements[0] = closestElements[1] - 1;
                closestValues[1] = element;
                closestValues[0] = numbers.get(closestElements[0]);
            }
        }
        return Pair.with(numbers.get(closestElements[0]), numbers.get(closestElements[1]));
    }
    public static void main(String[] args) {
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.9f, (float)4.0f, (float)5.0f, (float)2.2f)))).equals((Pair.with(3.9f, 4.0f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)5.9f, (float)4.0f, (float)5.0f)))).equals((Pair.with(5.0f, 5.9f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.2f)))).equals((Pair.with(2.0f, 2.2f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.0f)))).equals((Pair.with(2.0f, 2.0f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.1f, (float)2.2f, (float)3.1f, (float)4.1f, (float)5.1f)))).equals((Pair.with(2.2f, 3.1f))));
    }

}
