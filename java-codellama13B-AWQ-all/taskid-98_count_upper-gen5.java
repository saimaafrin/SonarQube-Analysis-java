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

        char[] charArray = s.toCharArray();
        List<Character> odd = IntStream.range(0, charArray.length)
            .filter(i -> i % 2 != 0)
            .mapToObj(i -> charArray[i])
            .collect(Collectors.toList());
        List<Character> even = IntStream.range(0, charArray.length)
            .filter(i -> i % 2 == 0)
            .mapToObj(i -> charArray[i])
            .collect(Collectors.toList());
        return even.stream()
            .filter(c -> c.toString().toUpperCase()
                .equals(c.toString()))
            .count();
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
