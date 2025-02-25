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

        StringBuilder sb = new StringBuilder();
        if (number >= 1000) {
            sb.append('m');
            number -= 1000;
        }
        if (number >= 900) {
            sb.append('cm');
            number -= 900;
        } else if (number >= 500) {
            sb.append('d');
            number -= 500;
        } else if (number >= 400) {
            sb.append("cd");
            number -= 400;
        }
        if (number >= 100) {
            sb.append('c');
            number -= 100;
        } else if (number >= 90) {
            sb.append("xc");
            number -= 90;
        } else if (number >= 50) {
            sb.append('l');
            number -= 50;
        } else if (number >= 40) {
            sb.append("xl");
            number -= 40;
        }
        if (number >= 10) {
            sb.append('x');
            number -= 10;
        } else if (number >= 9) {
            sb.append("ix");
            number -= 9;
        } else if (number >= 5) {
            sb.append('v');
            number -= 5;
        } else if (number >= 4) {
            sb.append("iv");
            number -= 4;
        }
        if (number >= 1) {
            sb.append('i');
            number -= 1;
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
