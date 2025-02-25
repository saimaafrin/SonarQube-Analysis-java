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

        // Make the numbers list:
        String[] numbersList = numbers.split(" ");
        // Make the numberal dictionary:
        HashMap<String, Integer> numberal = new HashMap<String, Integer>();
        numberal.put("zero", 0);
        numberal.put("one", 1);
        numberal.put("two", 2);
        numberal.put("three", 3);
        numberal.put("four", 4);
        numberal.put("five", 5);
        numberal.put("six", 6);
        numberal.put("seven", 7);
        numberal.put("eight", 8);
        numberal.put("nine", 9);
        // Sort the numbers list:
        Arrays.sort(numbersList, (num1, num2) -> {
            return numberal.get(num1) - numberal.get(num2);
        });
        return String.join(" ", numbersList);
    }
    public static void main(String[] args) {
    assert(sortNumbers(("")).equals(("")));
    assert(sortNumbers(("three")).equals(("three")));
    assert(sortNumbers(("three five nine")).equals(("three five nine")));
    assert(sortNumbers(("five zero four seven nine eight")).equals(("zero four five seven eight nine")));
    assert(sortNumbers(("six five four three two one zero")).equals(("zero one two three four five six")));
    }

}
