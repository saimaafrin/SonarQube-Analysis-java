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

        // Split on whitespace, create new array
        String[] splits = numbers.split(" ");
        // Create a new list of integers, which are the numbers in order
        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        // Create a map of numberal to integer
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("zero", 0);
        mapping.put("one", 1);
        mapping.put("two", 2);
        mapping.put("three", 3);
        mapping.put("four", 4);
        mapping.put("five", 5);
        mapping.put("six", 6);
        mapping.put("seven", 7);
        mapping.put("eight", 8);
        mapping.put("nine", 9);
        // Create a stream of the array of splits
        List<String> sorted = Arrays.stream(splits).sorted((a, b) -> {
            // Compare the values for a and b in the mapping
            return Integer.compare(mapping.get(a), mapping.get(b));
        }).collect(Collectors.toList());
        return String.join(" ", sorted);
    }
    public static void main(String[] args) {
    assert(sortNumbers(("")).equals(("")));
    assert(sortNumbers(("three")).equals(("three")));
    assert(sortNumbers(("three five nine")).equals(("three five nine")));
    assert(sortNumbers(("five zero four seven nine eight")).equals(("zero four five seven eight nine")));
    assert(sortNumbers(("six five four three two one zero")).equals(("zero one two three four five six")));
    }

}
