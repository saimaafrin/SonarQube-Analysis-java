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

        // Write your code here
        string = string.toLowerCase();
        String unique = "";
        for(int i=0; i < string.length(); i++) {
            if(!unique.contains(String.valueOf(string.charAt(i)))) {
                unique += String.valueOf(string.charAt(i));
            }
        }
        return unique.length();
    }
    public static void main(String[] args) {
    assert(countDistinctCharacters(("")) == (0l));
    assert(countDistinctCharacters(("abcde")) == (5l));
    assert(countDistinctCharacters(("abcdecadeCADE")) == (5l));
    assert(countDistinctCharacters(("aaaaAAAAaaaa")) == (1l));
    assert(countDistinctCharacters(("Jerry jERRY JeRRRY")) == (5l));
    }

}
