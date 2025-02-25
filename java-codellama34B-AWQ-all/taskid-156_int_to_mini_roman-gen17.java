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

        // Create an ArrayList of all the roman numerals
        ArrayList<String> romanNumerals = new ArrayList<String>();
        romanNumerals.add("i");
        romanNumerals.add("v");
        romanNumerals.add("x");
        romanNumerals.add("l");
        romanNumerals.add("c");
        romanNumerals.add("d");
        romanNumerals.add("m");
        // Create an ArrayList of all the integer values
        ArrayList<Long> integerValues = new ArrayList<Long>();
        integerValues.add(1l);
        integerValues.add(5l);
        integerValues.add(10l);
        integerValues.add(50l);
        integerValues.add(100l);
        integerValues.add(500l);
        integerValues.add(1000l);
        // Get the ArrayList indices of the largest values less than the number
        int indexOfLargestValueLessThanNumber = -1;
        int indexOfSecondLargestValueLessThanNumber = -1;
        // Iterate through the integer values
        for (int i = 0; i < integerValues.size(); i++) {
            // Check if the integer value is less than the number
            if (integerValues.get(i) < number) {
                // If the index of the largest value less than the number has not been found,
                // set it to the current index
                if (indexOfLargestValueLessThanNumber == -1) {
                    indexOfLargestValueLessThanNumber = i;
                }
                // If the index of the second largest value less than the number has not been
                // found, set it to the current index
                if (indexOfSecondLargestValueLessThanNumber == -1 && i != indexOfLargestValueLessThanNumber) {
                    indexOfSecondLargestValueLessThanNumber = i;
                }
                // If the index of the largest value less than the number and the index of the
                // second largest value less than the number have both been found, break
                if (indexOfLargestValueLessThanNumber != -1 && indexOfSecondLargestValueLessThanNumber != -1) {
                    break;
                }
            }
        }
        // Get the roman numeral of the largest value less than the number
        String largestValueRomanNumeral = romanNumerals.get(indexOfLargestValueLessThanNumber);
        // Get the roman numeral of the second largest value less than the number
        String secondLargestValueRomanNumeral = romanNumerals.get(indexOfSecondLargestValueLessThanNumber);
        // Get the difference between the largest value less than the number and the second
        // largest value less than the number
        long differenceBetweenLargestAndSecondLargestValue = integerValues.get(indexOfLargestValueLessThanNumber) -
                integerValues.get(indexOfSecondLargestValueLessThanNumber);
        // Create a string builder with the largest value less than the number
        StringBuilder result = new StringBuilder(largestValueRomanNumeral);
        // If the difference between the largest value less than the number and the second
        // largest value less than the number is greater than 0, append the second largest
        // value less than the number to the result
        if (differenceBetweenLargestAndSecondLargestValue > 0) {
            result.append(second
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
