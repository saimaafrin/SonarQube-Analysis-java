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

        // Base Case
        if (number < 1)
            return "";
        if (number == 1)
            return "i";
        if (number == 2)
            return "ii";
        if (number == 3)
            return "iii";
        if (number == 4)
            return "iv";
        if (number == 5)
            return "v";
        if (number == 6)
            return "vi";
        if (number == 7)
            return "vii";
        if (number == 8)
            return "viii";
        if (number == 9)
            return "ix";
        if (number == 10)
            return "x";
        if (number < 10)
            return "x" + intToMiniRoman(number - 10);
        if (number == 19)
            return "xix";
        if (number == 29)
            return "xxix";
        if (number == 39)
            return "xxxix";
        if (number == 49)
            return "lxix";
        if (number == 59)
            return "lxxix";
        if (number == 69)
            return "lxxxix";
        if (number == 79)
            return "lxxxix";
        if (number == 89)
            return "lxxxix";
        if (number == 99)
            return "xcix";
        if (number == 100)
            return "c";
        if (number < 100)
            return "c" + intToMiniRoman(number - 100);
        if (number == 199)
            return "ccxix";
        if (number == 299)
            return "ccxxix";
        if (number == 399)
            return "ccxxxix";
        if (number == 499)
            return "cdxix";
        if (number == 599)
            return "cdxxix";
        if (number == 699)
            return "cdxxxix";
        if (number == 799)
            return "cdxxxix";
        if (number == 899)
            return "cdxxxix";
        if (number == 999)
            return "xccix";
        if (number == 1000)
            return "m";
        if (number < 1000)
            return "m" + intToMiniRoman(number - 1000);
        return "";
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
