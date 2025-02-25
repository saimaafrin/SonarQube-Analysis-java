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

        String[] romanNumerals = {"","i","ii","iii","iv","v","vi","vii","viii","ix"};
        String[] romanNumerals10 = {"","x","xx","xxx","xl","l","lx","lxx","lxxx","xc"};
        String[] romanNumerals100 = {"","c","cc","ccc","cd","d","dc","dcc","dccc","cm"};
        String[] romanNumerals1000 = {"","m","mm","mmm"};
        int[] digits = new int[4];
        digits[3] = (int) (number / 1000l);
        digits[2] = (int) (number % 1000l / 100l);
        digits[1] = (int) (number % 100l / 10l);
        digits[0] = (int) (number % 10l);
        String result = romanNumerals1000[digits[3]] + romanNumerals100[digits[2]] + romanNumerals10[digits[1]] + romanNumerals[digits[0]];
        return result;
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
