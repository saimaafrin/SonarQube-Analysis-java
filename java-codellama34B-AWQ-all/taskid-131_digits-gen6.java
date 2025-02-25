import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the product of the odd digits.
    // Return 0 if all digits are even.
    // For example:
    // >>> digits((1l))
    // (1l)
    // >>> digits((4l))
    // (0l)
    // >>> digits((235l))
    // (15l)
    public static long digits(long n) {

        long product = 1;
        List<String> stringN = new ArrayList<>();
        List<String> oddDigits = new ArrayList<>();
        stringN = Arrays.asList(Long.toString(n).split(""));
        for (String s : stringN) {
            if (Long.parseLong(s) % 2 == 1) {
                oddDigits.add(s);
            }
        }
        for (String s : oddDigits) {
            product = product * Long.parseLong(s);
        }
        return product;
    }
    public static void main(String[] args) {
    assert(digits((5l)) == (5l));
    assert(digits((54l)) == (5l));
    assert(digits((120l)) == (1l));
    assert(digits((5014l)) == (5l));
    assert(digits((98765l)) == (315l));
    assert(digits((5576543l)) == (2625l));
    assert(digits((2468l)) == (0l));
    }

}
