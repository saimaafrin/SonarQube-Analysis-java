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

        return string.chars().mapToObj(i -> String.valueOf((char) i)).reduce((a, b) -> a + b).map(s -> new ArrayList<String>(Arrays.asList(s.split("")))).orElse(new ArrayList<String>());
    }
    public static void main(String[] args) {
    assert(allPrefixes(("")).equals((new ArrayList<String>(Arrays.asList()))));
    assert(allPrefixes(("asdfgh")).equals((new ArrayList<String>(Arrays.asList((String)"a", (String)"as", (String)"asd", (String)"asdf", (String)"asdfg", (String)"asdfgh")))));
    assert(allPrefixes(("WWW")).equals((new ArrayList<String>(Arrays.asList((String)"W", (String)"WW", (String)"WWW")))));
    }

}
