import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return a string containing space-delimited numbers starting from 0 upto n inclusive.
    // >>> stringSequence((0l))
    // ("0")
    // >>> stringSequence((5l))
    // ("0 1 2 3 4 5")
    public static String stringSequence(long n) {

        String out = "";
        if (n < 1) {
            return "0";
        }
        String[] arr = Arrays.stream(stringSequence(n - 1).split(" ")).map(e -> String.valueOf(Long.valueOf(e) + 1)).toArray(String[]::new);
        arr[arr.length - 1] = String.valueOf(n);
        out = String.join(" ", arr);
        return out;
    }
    public static void main(String[] args) {
    assert(stringSequence((0l)).equals(("0")));
    assert(stringSequence((3l)).equals(("0 1 2 3")));
    assert(stringSequence((10l)).equals(("0 1 2 3 4 5 6 7 8 9 10")));
    }

}
