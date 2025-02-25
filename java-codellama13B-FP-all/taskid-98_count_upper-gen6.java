import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string s, count the number of uppercase vowels in even indices.
    // For example:
    // >>> countUpper(("aBCdEf"))
    // (1l)
    // >>> countUpper(("abcdefg"))
    // (0l)
    // >>> countUpper(("dBBE"))
    // (0l)
    public static long countUpper(String s) {

        // count the number of uppercase vowels in even indices
        // in the given string.
        // This function uses a regex to match all uppercase
        // letters that occur at even indices in a string.
        //
        // Parameters
        // ----------
        // s : string
        //     The string to search for uppercase vowels in.
        //
        // Returns
        // -------
        // count : int
        //     The number of uppercase vowels found at even
        //     indices in the given string.

        long count = 0;

        // TODO: implement this function

        // match all uppercase letters that occur at even indices
        // in the given string
        String pattern = "(?=^|[^A-Z])[A-Z](?=[^A-Z]|$)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s);
        int startIndex = 0;
        while (m.find(startIndex)) {
            count++;
            startIndex = m.end() + 1;
        }

        return count;
    }
    public static void main(String[] args) {
    assert(countUpper(("aBCdEf")) == (1l));
    assert(countUpper(("abcdefg")) == (0l));
    assert(countUpper(("dBBE")) == (0l));
    assert(countUpper(("B")) == (0l));
    assert(countUpper(("U")) == (1l));
    assert(countUpper(("")) == (0l));
    assert(countUpper(("EEEE")) == (2l));
    }

}
