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

        long numberOfThousands = (long)Math.floor(number/1000.0);
        long numberOfHundreds = (long)Math.floor((number - numberOfThousands*1000)/100.0);
        long numberOfTens = (long)Math.floor((number - numberOfThousands*1000 - numberOfHundreds*100)/10.0);
        long numberOfOnes = number%10;
        String romanNumber = "";
        if(numberOfThousands == 1)
        romanNumber = romanNumber + "m";
        else if(numberOfThousands > 1)
        for(int i = 0; i < numberOfThousands; i++)
        romanNumber = romanNumber + "m";
        if(numberOfHundreds == 1)
        romanNumber = romanNumber + "c";
        else if(numberOfHundreds > 1)
        for(int i = 0; i < numberOfHundreds; i++)
        romanNumber = romanNumber + "c";
        if(numberOfTens == 1)
        romanNumber = romanNumber + "x";
        else if(numberOfTens > 1)
        for(int i = 0; i < numberOfTens; i++)
        romanNumber = romanNumber + "x";
        if(numberOfOnes == 1)
        romanNumber = romanNumber + "i";
        else if(numberOfOnes > 1)
        for(int i = 0; i < numberOfOnes; i++)
        romanNumber = romanNumber + "i";
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
