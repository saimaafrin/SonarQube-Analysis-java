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

        return (ArrayList<String>) IntStream.range(1, string.length() + 1)
        .mapToObj(n -> string.substring(0, n))
        .collect(Collectors.toList());
    }
    public static void main(String[] args) {
    assert(allPrefixes(("")).equals((new ArrayList<String>(Arrays.asList()))));
    assert(allPrefixes(("asdfgh")).equals((new ArrayList<String>(Arrays.asList((String)"a", (String)"as", (String)"asd", (String)"asdf", (String)"asdfg", (String)"asdfgh")))));
    assert(allPrefixes(("WWW")).equals((new ArrayList<String>(Arrays.asList((String)"W", (String)"WW", (String)"WWW")))));
    }

}
