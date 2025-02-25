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

        String roman = "";
        String[] thousands = new String[] {"", "m", "mm", "mmm"};
        String[] hundreds = new String[] {"", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm"};
        String[] tens = new String[] {"", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc"};
        String[] ones = new String[] {"", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix"};
        String[] nums = new String[] {"", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc", "m"};
        int[] numList = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int thousandsValue = 0;
        int hundredsValue = 0;
        int tensValue = 0;
        int onesValue = 0;
        for (int i = 0; i < numList.length; i++) {
            if (number >= 1000) {
                number -= 1000;
                thousandsValue++;
            } else if (number >= 100) {
                number -= 100;
                hundredsValue++;
            } else if (number >= 10) {
                number -= 10;
                tensValue++;
            } else {
                number--;
                onesValue++;
            }
        }
        roman += thousands[thousandsValue];
        roman += hundreds[hundredsValue];
        roman += tens[tensValue];
        roman += ones[onesValue];
        return roman.toLowerCase();
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
