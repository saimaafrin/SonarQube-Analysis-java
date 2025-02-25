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

        // This is a bit tricky to get right.
        // You will need to parse the input string, convert the numberals to numbers,
        // then sort those numbers.
        // You will need to convert the resulting sorted array of numbers back to
        // numberals, and join them together to make a string.
        //
        // The `sorted()` method is used to sort an array. You can pass a custom
        // comparator function to `sorted()`, which is a function that takes two
        // arguments and returns a negative number, a positive number, or 0.
        // The comparator function should return a negative number if the first
        // argument is "smaller" than the second argument, a positive number if
        // it is "larger", and 0 if they are equal.
        //
        // In this case, we can use the `compareTo()` method of the `Integer`
        // class to compare two numbers, and the `parseInt()` method to convert
        // a string to a number.
        //
        // Here's an example of how you could use these methods:
        //
        //     String[] numbers = {"1", "2", "3", "4", "5"};
        //     Arrays.sort(numbers, (a, b) -> Integer.parseInt(a).compareTo(Integer.parseInt(b)));
        //
        //     System.out.println(numbers);
        //     // Output: [1, 2, 3, 4, 5]
        //
        // You should try to do something similar, but you'll need to convert
        // the numberals to numbers first.
        //
        // Good luck!
        //
        // P.S. If you're feeling really stuck, you could always look at the
        // solutions of the other problems in this file for some inspiration.
    }
    public static void main(String[] args) {
    assert(sortNumbers(("")).equals(("")));
    assert(sortNumbers(("three")).equals(("three")));
    assert(sortNumbers(("three five nine")).equals(("three five nine")));
    assert(sortNumbers(("five zero four seven nine eight")).equals(("zero four five seven eight nine")));
    assert(sortNumbers(("six five four three two one zero")).equals(("zero one two three four five six")));
    }

}
