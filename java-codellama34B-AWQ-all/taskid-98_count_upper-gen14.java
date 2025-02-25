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

        // return s.toUpperCase().chars().filter(x -> x == 65 || x == 69 || x == 73 || x == 79).count();
        // return s.toUpperCase().chars().filter(x -> "AEIOU".indexOf(x) > -1).count();
        long r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && Character.isUpperCase(s.charAt(i))) {
                r++;
            }
        }
        return r;
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
