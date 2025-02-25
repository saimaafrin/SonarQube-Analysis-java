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

        int i = 0;
        long count = 0;
        while(i < s.length()){
            if(i % 2 == 0 && (Character.toUpperCase(s.charAt(i)) == 'A' || Character.toUpperCase(s.charAt(i)) == 'E' || Character.toUpperCase(s.charAt(i)) == 'I' || Character.toUpperCase(s.charAt(i)) == 'O' || Character.toUpperCase(s.charAt(i)) == 'U')){
                count++;
            }
            i++;
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
