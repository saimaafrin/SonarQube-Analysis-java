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

        List<String> list = Arrays.asList(s.split(""));
        List<String> upperList = list.stream().filter(x -> x.equals(x.toUpperCase())).collect(Collectors.toList());
        List<Integer> evenList = upperList.stream().map(x -> list.indexOf(x)).filter(x -> x % 2 == 0).map(x -> x + 1).collect(Collectors.toList());
        return evenList.stream().count();
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
