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

        if(number <= 0) {
            throw new RuntimeException("The given number must be greater than 0");
        }
        if(number > 1000) {
            throw new RuntimeException("The given number must be less than or equal to 1000");
        }
        String romanNumber = "";
        long thousands = number / 1000l;
        long hundreds = (number - (thousands * 1000l)) / 100l;
        long tens = (number - (thousands * 1000l) - (hundreds * 100l)) / 10l;
        long ones = (number - (thousands * 1000l) - (hundreds * 100l) - (tens * 10l));
        for(int i=0; i<thousands; i++) {
            romanNumber += "m";
        }
        if(hundreds == 9) {
            romanNumber += "cm";
        }
        else {
            for(int i=0; i<hundreds; i++) {
                romanNumber += "c";
            }
            for(int i=0; i<tens; i++) {
                romanNumber += "x";
            }
            for(int i=0; i<ones; i++) {
                romanNumber += "i";
            }
        }
        return romanNumber;
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
