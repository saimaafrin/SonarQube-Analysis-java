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

        StringBuilder ans = new StringBuilder();
        while (number > 0) {
            if (number >= 1000) {
                number -= 1000;
                ans.append("m");
            }
            else if (number >= 900) {
                number -= 900;
                ans.append("im");
            }
            else if (number >= 500) {
                number -= 500;
                ans.append("d");
            }
            else if (number >= 400) {
                number -= 400;
                ans.append("cd");
            }
            else if (number >= 100) {
                number -= 100;
                ans.append("c");
            }
            else if (number >= 90) {
                number -= 90;
                ans.append("xc");
            }
            else if (number >= 50) {
                number -= 50;
                ans.append("l");
            }
            else if (number >= 40) {
                number -= 40;
                ans.append("xl");
            }
            else if (number >= 10) {
                number -= 10;
                ans.append("x");
            }
            else if (number >= 9) {
                number -= 9;
                ans.append("ix");
            }
            else if (number >= 5) {
                number -= 5;
                ans.append("v");
            }
            else if (number >= 4) {
                number -= 4;
                ans.append("iv");
            }
            else if (number >= 1) {
                number -= 1;
                ans.append("i");
            }
        }
        return ans.toString();
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
