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
        Arrays.sort(sorted, new Comparator<String>() {
            @Override public int compare(String s1, String s2) {
                int i1 = s1.equals("zero") ? 0 :
                    s1.equals("one") ? 1 :
                    s1.equals("two") ? 2 :
                    s1.equals("three") ? 3 :
                    s1.equals("four") ? 4 :
                    s1.equals("five") ? 5 :
                    s1.equals("six") ? 6 :
                    s1.equals("seven") ? 7 :
                    s1.equals("eight") ? 8 :
                    9;
                int i2 = s2.equals("zero") ? 0 :
                    s2.equals("one") ? 1 :
                    s2.equals("two") ? 2 :
                    s2.equals("three") ? 3 :
                    s2.equals("four") ? 4 :
                    s2.equals("five") ? 5 :
                    s2.equals("six") ? 6 :
                    s2.equals("seven") ? 7 :
                    s2.equals("eight") ? 8 :
                    9;
                return i1 < i2 ? -1 : (i1 > i2 ? 1 : 0);
            }
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
