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

        // Create a HashSet to store distinct characters
        Set<Character> distinctChars = new HashSet<>();
        // Iterate through the input string
        for (char c : string.toCharArray()) {
            // Add the character to the set
            distinctChars.add(Character.toLowerCase(c));
        }
        // Return the number of distinct characters
        return distinctChars.size();
    }
    public static void main(String[] args) {
    assert(countDistinctCharacters(("")) == (0l));
    assert(countDistinctCharacters(("abcde")) == (5l));
    assert(countDistinctCharacters(("abcdecadeCADE")) == (5l));
    assert(countDistinctCharacters(("aaaaAAAAaaaa")) == (1l));
    assert(countDistinctCharacters(("Jerry jERRY JeRRRY")) == (5l));
    }

}
