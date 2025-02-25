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

        // Sort the input
        Collections.sort(numbers);
        // Create an ArrayList that will hold the closest pair of numbers
        ArrayList<Float> closestPair = new ArrayList<Float>();
        // Determine the difference between the first two elements of the sorted input
        double smallestDifference = Math.abs(numbers.get(1) - numbers.get(0));
        // Start with the first two elements of the sorted input
        closestPair.add(numbers.get(0));
        closestPair.add(numbers.get(1));
        // Cycle through the rest of the elements of the sorted input
        for (int i = 2; i < numbers.size(); i++) {
            // Determine the difference between the current element and the second element of the closest pair
            double difference = Math.abs(numbers.get(i) - closestPair.get(1));
            // If the current difference is smaller than the smallest difference, then update the closest pair and the smallest difference
            if (difference < smallestDifference) {
                smallestDifference = difference;
                closestPair.clear();
                closestPair.add(numbers.get(i - 1));
                closestPair.add(numbers.get(i));
            }
        }
        // Return the closest pair of numbers
        return Pair.with(closestPair.get(0), closestPair.get(1));
    }
    public static void main(String[] args) {
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.9f, (float)4.0f, (float)5.0f, (float)2.2f)))).equals((Pair.with(3.9f, 4.0f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)5.9f, (float)4.0f, (float)5.0f)))).equals((Pair.with(5.0f, 5.9f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.2f)))).equals((Pair.with(2.0f, 2.2f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.0f)))).equals((Pair.with(2.0f, 2.0f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.1f, (float)2.2f, (float)3.1f, (float)4.1f, (float)5.1f)))).equals((Pair.with(2.2f, 3.1f))));
    }

}
