import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string, find out how many distinct characters (regardless of case) does it consist of
    // >>> countDistinctCharacters(("xyzXYZ"))
    // (3l)
    // >>> countDistinctCharacters(("Jerry"))
    // (4l)
    public static long countDistinctCharacters(String string) {

        string = string.toLowerCase();
        Set<Character> hs = new HashSet<Character>();
        for (int i = 0; i < string.length(); i++) {
            hs.add(string.charAt(i));
        }
        return hs.size();
    }
    public static void main(String[] args) {
    assert(countDistinctCharacters(("")) == (0l));
    assert(countDistinctCharacters(("abcde")) == (5l));
    assert(countDistinctCharacters(("abcdecadeCADE")) == (5l));
    assert(countDistinctCharacters(("aaaaAAAAaaaa")) == (1l));
    assert(countDistinctCharacters(("Jerry jERRY JeRRRY")) == (5l));
    }

}
