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

        String[] sorted = numbers.split(" ");
        Arrays.sort(sorted, (s1, s2) -> {
            int i1 = switch (s1) {
                case "zero" -> 0;
                case "one" -> 1;
                case "two" -> 2;
                case "three" -> 3;
                case "four" -> 4;
                case "five" -> 5;
                case "six" -> 6;
                case "seven" -> 7;
                case "eight" -> 8;
                case "nine" -> 9;
                default -> -1;
            };
            int i2 = switch (s2) {
                case "zero" -> 0;
                case "one" -> 1;
                case "two" -> 2;
                case "three" -> 3;
                case "four" -> 4;
                case "five" -> 5;
                case "six" -> 6;
                case "seven" -> 7;
                case "eight" -> 8;
                case "nine" -> 9;
                default -> -1;
            };
            return i1 - i2;
        });
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
