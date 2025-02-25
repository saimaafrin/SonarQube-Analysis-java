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

        // Create a list of number words
        List<String> word_numbers = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        // Split the input string into a list of strings using ' ' as the delimiter
        String[] number_strings = numbers.split(" ");
        // Create an empty list to store the sorted numbers
        List<String> sorted_numbers = new ArrayList<>();
        // Iterate over `number_strings`
        for (String num : number_strings) {
            // Get the index of the current number
            int index = word_numbers.indexOf(num);
            // Add the current number to the `sorted_numbers` list
            sorted_numbers.add(word_numbers.get(index));
        }
        // Join `sorted_numbers` into a string
        String sorted_string = String.join(" ", sorted_numbers);
        // Return the sorted string
        return sorted_string;
    }
    public static void main(String[] args) {
    assert(sortNumbers(("")).equals(("")));
    assert(sortNumbers(("three")).equals(("three")));
    assert(sortNumbers(("three five nine")).equals(("three five nine")));
    assert(sortNumbers(("five zero four seven nine eight")).equals(("zero four five seven eight nine")));
    assert(sortNumbers(("six five four three two one zero")).equals(("zero one two three four five six")));
    }

}
