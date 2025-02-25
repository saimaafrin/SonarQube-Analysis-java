import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input is a space-delimited string of numberals from 'zero' to 'nine'.
    // Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
    // Return the string with numbers sorted from smallest to largest
    // >>> sortNumbers(("three one five"))
    // ("one three five")
    public static String sortNumbers(String numbers) {

        // Use Arrays.stream() to convert input string into an array of strings.
        // Then use Arrays.sort() to sort the array.
        // Finally, use Arrays.stream() again to join the sorted strings together into a single string.
        //
        // Use Arrays.stream() to convert input string into an array of strings.
        // Then use Arrays.sort() to sort the array.
        // Finally, use Arrays.stream() again to join the sorted strings together into a single string.
        return Arrays.stream(numbers.split(" "))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
    assert(sortNumbers(("")).equals(("")));
    assert(sortNumbers(("three")).equals(("three")));
    assert(sortNumbers(("three five nine")).equals(("three five nine")));
    assert(sortNumbers(("five zero four seven nine eight")).equals(("zero four five seven eight nine")));
    assert(sortNumbers(("six five four three two one zero")).equals(("zero one two three four five six")));
    }

}
