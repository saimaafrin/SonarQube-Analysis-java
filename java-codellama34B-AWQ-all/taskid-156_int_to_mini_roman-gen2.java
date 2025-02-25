import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer, obtain its roman numeral equivalent as a string,
    // and return it in lowercase.
    // Restrictions: 1 <= num <= 1000
    // Examples:
    // >>> intToMiniRoman((19l))
    // ("xix")
    // >>> intToMiniRoman((152l))
    // ("clii")
    // >>> intToMiniRoman((426l))
    // ("cdxxvi")
    public static String intToMiniRoman(long number) {

        HashMap<Integer, String> numerals = new HashMap<Integer, String>();
        numerals.put(1000, "m");
        numerals.put(900, "cm");
        numerals.put(500, "d");
        numerals.put(400, "cd");
        numerals.put(100, "c");
        numerals.put(90, "xc");
        numerals.put(50, "l");
        numerals.put(40, "xl");
        numerals.put(10, "x");
        numerals.put(9, "ix");
        numerals.put(5, "v");
        numerals.put(4, "iv");
        numerals.put(1, "i");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : numerals.entrySet()) {
            while (number >= entry.getKey()) {
                sb.append(entry.getValue());
                number -= entry.getKey();
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
    assert(intToMiniRoman((19l)).equals(("xix")));
    assert(intToMiniRoman((152l)).equals(("clii")));
    assert(intToMiniRoman((251l)).equals(("ccli")));
    assert(intToMiniRoman((426l)).equals(("cdxxvi")));
    assert(intToMiniRoman((500l)).equals(("d")));
    assert(intToMiniRoman((1l)).equals(("i")));
    assert(intToMiniRoman((4l)).equals(("iv")));
    assert(intToMiniRoman((43l)).equals(("xliii")));
    assert(intToMiniRoman((90l)).equals(("xc")));
    assert(intToMiniRoman((94l)).equals(("xciv")));
    assert(intToMiniRoman((532l)).equals(("dxxxii")));
    assert(intToMiniRoman((900l)).equals(("cm")));
    assert(intToMiniRoman((994l)).equals(("cmxciv")));
    assert(intToMiniRoman((1000l)).equals(("m")));
    }

}
