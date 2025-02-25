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

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] clean_text = new char[text.length()];
        int clean_text_index = 0;
        for (char c : text.toCharArray()) {
            boolean is_vowel = false;
            for (char v : vowels) {
                if (c == v) {
                    is_vowel = true;
                    break;
                }
            }
            if (!is_vowel) {
                clean_text[clean_text_index++] = c;
            }
        }
        return String.valueOf(clean_text);
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
