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

        // Write your code here
        String romanNumber = "";
        String[] units = {"", "m", "mm", "mmm"};
        String[] tens = {"", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm"};
        String[] hundreds = {"", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc"};
        String[] thousands = {"", "m", "mm", "mmm"};
        String[] thousands2 = {"", "d", "dd", "ddd", "dddd", "ddddd", "dddddd"};
        String[] thousands3 = {"", "c", "cc", "ccc", "cccc", "ccccc", "cccccc"};
        int thousandsCount = (int) (number / 1000);
        int hundredsCount = (int) ((number - (1000 * thousandsCount)) / 100);
        int tensCount = (int) ((number - (100 * hundredsCount) - (1000 * thousandsCount)) / 10);
        int unitsCount = (int) (number - (10 * tensCount) - (100 * hundredsCount) - (1000 * thousandsCount));
        romanNumber = thousands[thousandsCount] + hundreds[hundredsCount] + tens[tensCount] + units[unitsCount];
        return romanNumber.toLowerCase();
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
