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

        numbers = numbers.replace("zero", "0")
                         .replace("one", "1")
                         .replace("two", "2")
                         .replace("three", "3")
                         .replace("four", "4")
                         .replace("five", "5")
                         .replace("six", "6")
                         .replace("seven", "7")
                         .replace("eight", "8")
                         .replace("nine", "9");
        String[] str = numbers.split(" ");
        String[] sorted = str.clone();
        int[] ints = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            ints[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(ints);
        for (int i = 0; i < str.length; i++) {
            sorted[i] = Integer.toString(ints[i]);
        }
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
