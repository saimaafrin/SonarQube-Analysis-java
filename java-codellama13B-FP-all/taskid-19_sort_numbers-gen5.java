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

        if (numbers == null) {
            throw new IllegalArgumentException("Numbers cannot be null");
        }
        // 1. Get all the numbers
        String[] numbersArray = numbers.split(" ");
        String sorted = "";

        // 2. Sort the numbers
        Arrays.sort(numbersArray);

        // 3. Re-generate the string
        for (String n: numbersArray) {
            sorted = sorted.concat(n + " ");
        }

        // 4. Remove the last space
        return sorted.substring(0, sorted.length() - 1);
    }
    public static void main(String[] args) {
    assert(sortNumbers(("")).equals(("")));
    assert(sortNumbers(("three")).equals(("three")));
    assert(sortNumbers(("three five nine")).equals(("three five nine")));
    assert(sortNumbers(("five zero four seven nine eight")).equals(("zero four five seven eight nine")));
    assert(sortNumbers(("six five four three two one zero")).equals(("zero one two three four five six")));
    }

}
