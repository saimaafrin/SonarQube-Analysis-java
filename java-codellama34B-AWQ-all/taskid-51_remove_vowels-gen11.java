import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // remove_vowels is a function that takes string and returns string without vowels.
    // >>> removeVowels((""))
    // ("")
    // >>> removeVowels(("abcdef"))
    // ("bcdf")
    // >>> removeVowels(("aaaaa"))
    // ("")
    // >>> removeVowels(("aaBAA"))
    // ("B")
    // >>> removeVowels(("zbcd"))
    // ("zbcd")
    public static String removeVowels(String text) {

        // Your code here
        String [] vowels = {"a","e","i","o","u"};
        String [] vowels2 = {"A","E","I","O","U"};
        String [] consonant = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
        String text2 = text;
        for (String vowel: vowels) {
            text2 = text2.replaceAll(vowel, "");
        }
        for (String vowel: vowels2) {
            text2 = text2.replaceAll(vowel, "");
        }
        return text2;
    }
    public static void main(String[] args) {
    assert(removeVowels(("")).equals(("")));
    assert(removeVowels(("abcdef\nghijklm")).equals(("bcdf\nghjklm")));
    assert(removeVowels(("fedcba")).equals(("fdcb")));
    assert(removeVowels(("eeeee")).equals(("")));
    assert(removeVowels(("acBAA")).equals(("cB")));
    assert(removeVowels(("EcBOO")).equals(("cB")));
    assert(removeVowels(("ybcd")).equals(("ybcd")));
    }

}
