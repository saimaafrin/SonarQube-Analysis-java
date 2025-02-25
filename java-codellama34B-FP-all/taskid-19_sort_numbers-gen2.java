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

        String[] numberals = numbers.split(" ");
        String sorted = "";
        for(int i = 0; i < numberals.length; i++) {
            switch(numberals[i]) {
                case "zero":
                    sorted = "zero " + sorted;
                    break;
                case "one":
                    sorted = "one " + sorted;
                    break;
                case "two":
                    sorted = "two " + sorted;
                    break;
                case "three":
                    sorted = "three " + sorted;
                    break;
                case "four":
                    sorted = "four " + sorted;
                    break;
                case "five":
                    sorted = "five " + sorted;
                    break;
                case "six":
                    sorted = "six " + sorted;
                    break;
                case "seven":
                    sorted = "seven " + sorted;
                    break;
                case "eight":
                    sorted = "eight " + sorted;
                    break;
                case "nine":
                    sorted = "nine " + sorted;
                    break;
            }
        }
        return sorted.trim();
    }
    public static void main(String[] args) {
    assert(sortNumbers(("")).equals(("")));
    assert(sortNumbers(("three")).equals(("three")));
    assert(sortNumbers(("three five nine")).equals(("three five nine")));
    assert(sortNumbers(("five zero four seven nine eight")).equals(("zero four five seven eight nine")));
    assert(sortNumbers(("six five four three two one zero")).equals(("zero one two three four five six")));
    }

}
