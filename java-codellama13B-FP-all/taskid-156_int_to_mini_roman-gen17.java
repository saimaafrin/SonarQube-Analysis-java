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

        // The only digits that matter are the hundreds, tens, and ones.
        // 1000: M, 100: C, 10: X, 1: I.
        // For each of these digits, the values are:
        // M: 1000, C: 100, X: 10, I: 1.
        // The problem can be solved by finding the number of occurrences
        // of each digit in the given number, and then
        // substituting the appropriate letter.
        // For example, if the given number is 426, then:
        // 400 + 20 + 6 = 426.
        // 4: 4, 2: 2, 6: 6.
        // Then, the number of occurrences for each digit is:
        // 4: 1, 2: 1, 6: 1.
        // Then, substituting the appropriate letter:
        // M: 4, X: 2, I: 6.
        // The resulting roman numeral would be:
        // "cdxxvi".
        // This approach is effective because it works well for small numbers.
        // However, it can be improved for larger numbers, because the
        // algorithm only needs to check a subset of the digits that occur
        // in the given number.
        // For example, the algorithm only needs to check the number of
        // occurrences of 4, 2, and 6, because they are the only digits
        // that matter.
        // The algorithm can also be improved by using an array of 4
        // elements, where each element represents the number of
        // occurrences of each digit.
        // Then, the algorithm can iterate over the array, and determine
        // the number of occurrences of each digit.
        // This approach is more efficient, because it reduces the number
        // of iterations that the algorithm needs to perform.
        // Additionally, it can be further improved by using a mathematical
        // formula to determine the number of occurrences of each digit.
        // For example, the formula for determining the number of
        // occurrences of the ones digit is:
        // 1000 - (100 * (number / 1000))
        // This formula is effective because it eliminates the need
        // for the algorithm to perform a series of divisions,
        // which can be expensive.
        // Instead, the formula performs a single division, and then
        // subtracts the result from 1000.
        // This approach is more efficient, because it reduces the
        // number of divisions that the algorithm needs to perform.
        // However, it can be further improved by using a mathematical
        // formula to determine the number of occurrences of each digit.
        // For example, the formula for determining the number of
        // occurrences of the ones digit is:
        // 1000 - (100 * (number / 1000))
        // This formula is effective because it eliminates the need
        // for the algorithm to perform a series of divisions,
        // which can be expensive.
        // Instead, the formula performs a single division, and then
        // subtracts the result from 1000.
        // This approach is more efficient, because it reduces the
        // number of divisions that the algorithm needs to perform.
        // However, it can be further improved by using a mathematical
        // formula to determine the number of occurrences of each digit.
        // For example, the formula for determining the number of
        // occurrences of the
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
