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

        String[] strings = new String[((int)n+1)];
        for (int i=0; i<strings.length; i++) {
            strings[i] = String.valueOf(i);
        }
        return String.join(" ", strings);
    }
    public static void main(String[] args) {
    assert(stringSequence((0l)).equals(("0")));
    assert(stringSequence((3l)).equals(("0 1 2 3")));
    assert(stringSequence((10l)).equals(("0 1 2 3 4 5 6 7 8 9 10")));
    }

}
