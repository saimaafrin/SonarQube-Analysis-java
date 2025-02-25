import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Find how many times a given substring can be found in the original string. Count overlaping cases.
    // >>> howManyTimes((""), ("a"))
    // (0l)
    // >>> howManyTimes(("aaa"), ("a"))
    // (3l)
    // >>> howManyTimes(("aaaa"), ("aa"))
    // (3l)
    public static long howManyTimes(String string, String substring) {

        if (substring.length() == 0) {
            return string.length();
        }
        if (string.length() == 0) {
            return 0;
        }
        int n = string.length() - substring.length() + 1;
        long[] counts = new long[n];
        Arrays.fill(counts, 1);
        for (int i = 0; i < n - 1; i++) {
            if (string.charAt(i) == substring.charAt(0) && string.charAt(i + 1) == substring.charAt(1)) {
                counts[i] = 2;
            }
        }
        for (int i = 2; i < substring.length(); i++) {
            for (int j = 0; j < n - i; j++) {
                if (string.charAt(j) == substring.charAt(0) && string.charAt(j + i) == substring.charAt(i)) {
                    counts[j]++;
                }
            }
        }
        return Arrays.stream(counts).sum();
    }
    public static void main(String[] args) {
    assert(howManyTimes((""), ("x")) == (0l));
    assert(howManyTimes(("xyxyxyx"), ("x")) == (4l));
    assert(howManyTimes(("cacacacac"), ("cac")) == (4l));
    assert(howManyTimes(("john doe"), ("john")) == (1l));
    }

}
