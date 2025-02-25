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

        return Integer.toString((int) number, 26).toLowerCase().replaceAll("0", "").replaceAll("1", "i").replaceAll("2", "ii").replaceAll("3", "iii").replaceAll("4", "iv").replaceAll("5", "v").replaceAll("6", "vi").replaceAll("7", "vii").replaceAll("8", "viii").replaceAll("9", "ix").replaceAll("a", "x").replaceAll("b", "xx").replaceAll("c", "xxx").replaceAll("d", "xl").replaceAll("e", "l").replaceAll("f", "lx").replaceAll("g", "lxx").replaceAll("h", "lxxx").replaceAll("i", "xc").replaceAll("j", "c").replaceAll("k", "cc").replaceAll("l", "ccc").replaceAll("m", "cd").replaceAll("n", "d").replaceAll("o", "dc").replaceAll("p", "dcc").replaceAll("q", "dccc").replaceAll("r", "cm").replaceAll("s", "m").replaceAll("t", "mc").replaceAll("u", "mcc").replaceAll("v", "mccc").replaceAll("w", "mcccc").replaceAll("x", "mccccc");
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
