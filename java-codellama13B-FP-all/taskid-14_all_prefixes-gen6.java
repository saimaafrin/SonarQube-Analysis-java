import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return array list of all prefixes from shortest to longest of the input string
    // >>> allPrefixes(("abc"))
    // (new ArrayList<String>(Arrays.asList((String)"a", (String)"ab", (String)"abc")))
    public static ArrayList<String> allPrefixes(String string) {

        ArrayList<String> result = new ArrayList<String>();
        // Add shortest prefix
        result.add(string.substring(0, 1));
        // Iterate through rest of the string
        for (int i = 1; i < string.length(); i++) {
            // Add prefix
            result.add(string.substring(0, i + 1));
        }
        return result;
    }
    public static void main(String[] args) {
    assert(allPrefixes(("")).equals((new ArrayList<String>(Arrays.asList()))));
    assert(allPrefixes(("asdfgh")).equals((new ArrayList<String>(Arrays.asList((String)"a", (String)"as", (String)"asd", (String)"asdf", (String)"asdfg", (String)"asdfgh")))));
    assert(allPrefixes(("WWW")).equals((new ArrayList<String>(Arrays.asList((String)"W", (String)"WW", (String)"WWW")))));
    }

}
