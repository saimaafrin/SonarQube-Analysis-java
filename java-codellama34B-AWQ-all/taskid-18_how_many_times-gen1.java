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

        int found = 0;
        int j = 0;
        for (int i = 0; i < string.length() - substring.length() + 1; i++) {
            j = i;
            while (string.charAt(j) == substring.charAt(j - i)) {
                j += 1;
                if (j - i == substring.length()) {
                    found += 1;
                    break;
                }
            }
        }
        return found;
    }
    public static void main(String[] args) {
    assert(howManyTimes((""), ("x")) == (0l));
    assert(howManyTimes(("xyxyxyx"), ("x")) == (4l));
    assert(howManyTimes(("cacacacac"), ("cac")) == (4l));
    assert(howManyTimes(("john doe"), ("john")) == (1l));
    }

}
