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

        if (numbers.size() == 2) return Pair.with(numbers.get(0), numbers.get(1));
        // Get a sorted copy of the arraylist of numbers
        ArrayList<Float> sorted = numbers.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        // Get the index of the middle value
        int middleIndex = sorted.size() / 2;
        // Get the index of the next smallest value
        int nextSmallestIndex = middleIndex - 1;
        // Get the index of the next largest value
        int nextLargestIndex = middleIndex + 1;
        // Find the closest pair
        float nextSmallest = sorted.get(nextSmallestIndex);
        float middle = sorted.get(middleIndex);
        float nextLargest = sorted.get(nextLargestIndex);
        float closestDistance = (float) (nextLargest - middle);
        int closestIndex = middleIndex;
        if (Math.abs(middle - nextSmallest) < closestDistance) {
            closestDistance = (float) (Math.abs(middle - nextSmallest));
            closestIndex = nextSmallestIndex;
        }
        // Return the closest pair
        if (closestIndex == middleIndex) return Pair.with(sorted.get(closestIndex), sorted.get(closestIndex + 1));
        else return Pair.with(sorted.get(closestIndex), sorted.get(closestIndex + 1));
    }
    public static void main(String[] args) {
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.9f, (float)4.0f, (float)5.0f, (float)2.2f)))).equals((Pair.with(3.9f, 4.0f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)5.9f, (float)4.0f, (float)5.0f)))).equals((Pair.with(5.0f, 5.9f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.2f)))).equals((Pair.with(2.0f, 2.2f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f, (float)5.0f, (float)2.0f)))).equals((Pair.with(2.0f, 2.0f))));
    assert(findClosestElements((new ArrayList<Float>(Arrays.asList((float)1.1f, (float)2.2f, (float)3.1f, (float)4.1f, (float)5.1f)))).equals((Pair.with(2.2f, 3.1f))));
    }

}
