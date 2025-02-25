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

        Map<Long, String> map = new HashMap<Long, String>() {{
            put(1000l, "m");
            put(900l, "cm");
            put(500l, "d");
            put(400l, "cd");
            put(100l, "c");
            put(90l, "xc");
            put(50l, "l");
            put(40l, "xl");
            put(10l, "x");
            put(9l, "ix");
            put(5l, "v");
            put(4l, "iv");
            put(1l, "i");
        }};
        String result = "";
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            long key = entry.getKey();
            String value = entry.getValue();
            if (number >= key) {
                result += (value.repeat((int) (number / key)));
                number = number % key;
            }
        }
        return result.toLowerCase();
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
