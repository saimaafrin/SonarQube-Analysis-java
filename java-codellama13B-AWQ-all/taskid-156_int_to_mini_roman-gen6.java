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

        // The trick is to break the number into thousands, hundreds, tens, and ones,
        // each one of which has its own set of Roman numeral equivalents.
        // Use StringBuilder to build the final string.
        StringBuilder sb = new StringBuilder();
        String[][] numerals = {
            {"", "m", "mm", "mmm"},
            {"", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm"},
            {"", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc"},
            {"", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix"}
        };
        for (int i = 0; i < 4; i++) {
            int div = (int) Math.pow(1000, 3 - i);
            int num = (int) (number / div);
            number %= div;
            sb.append(numerals[i][num]);
        }
        return sb.toString().toLowerCase();
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
