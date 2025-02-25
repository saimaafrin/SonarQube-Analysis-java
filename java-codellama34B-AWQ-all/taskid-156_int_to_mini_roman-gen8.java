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

        if(number <= 0 || number >= 1000) return "";

        String[] romanNumerals = {"m", "d", "c", "l", "x", "v", "i"};
        int[] placeValues = {1000, 500, 100, 50, 10, 5, 1};
        int[] digits = new int[7];
        int[] remainder = new int[7];

        String romanNumber = "";

        for(int i = 0; i < placeValues.length; i++) {
            digits[i] = (int) (number / placeValues[i]);
            number -= placeValues[i] * digits[i];
        }

        for(int i = 0; i < placeValues.length; i++) {
            switch(i) {
                case 0:
                    // Thousands place
                    for(int j = 0; j < digits[i]; j++)
                        romanNumber += romanNumerals[i];
                    break;
                case 1:
                    // Hundreds place
                    if(digits[i] < 4) {
                        for(int j = 0; j < digits[i]; j++)
                            romanNumber += romanNumerals[i];
                    } else {
                        for(int j = 0; j < digits[i] - 4; j++)
                            romanNumber += romanNumerals[i + 2];
                        romanNumber += romanNumerals[i];
                    }
                    break;
                case 2:
                    // Tens place
                    if(digits[i] < 4) {
                        for(int j = 0; j < digits[i]; j++)
                            romanNumber += romanNumerals[i];
                    } else {
                        for(int j = 0; j < digits[i] - 4; j++)
                            romanNumber += romanNumerals[i + 2];
                        romanNumber += romanNumerals[i];
                    }
                    break;
                case 3:
                    // Ones place
                    if(digits[i] < 4) {
                        for(int j = 0; j < digits[i]; j++)
                            romanNumber += romanNumerals[i];
                    } else {
                        for(int j = 0; j < digits[i] - 4; j++)
                            romanNumber += romanNumerals[i + 2];
                        romanNumber += romanNumerals[i];
                    }
                    break;
                default:
                    // Fives and ones place
                    romanNumber += romanNumerals[i];
                    romanNumber += romanNumerals[i + 1];
                    break;
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
