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

        String[] romans = { "", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix" };
        String[] romans10 = { "", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc" };
        String[] romans100 = { "", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm" };
        String[] romans1000 = { "", "m", "mm", "mmm", "mmmm" };
        if(number==0){
            return "";
        }
        String roman = "";
        long div = number;
        roman = romans1000[(int)(div/1000)] + roman;
        div = div%1000;
        roman = romans100[(int)(div/100)] + roman;
        div = div%100;
        roman = romans10[(int)(div/10)] + roman;
        div = div%10;
        roman = romans[(int)(div)] + roman;
        return roman;
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
