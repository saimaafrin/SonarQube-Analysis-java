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

        long[] values = new long[]{
            1l,
            4l,
            5l,
            9l,
            10l,
            40l,
            50l,
            90l,
            100l,
            400l,
            500l,
            900l,
            1000l
        };
        String[] letters = new String[]{
            "i",
            "iv",
            "v",
            "ix",
            "x",
            "xl",
            "l",
            "xlix",
            "lx",
            "xc",
            "lxi",
            "c",
            "lxii",
            "cx",
            "lxiii",
            "x",
            "lxiv",
            "xciv",
            "d",
            "lxix",
            "xd",
            "lxx",
            "lxxi",
            "xx",
            "lxxii",
            "xxi",
            "lxxiii",
            "xxii",
            "lxxiv",
            "xxiii",
            "lxxv",
            "xxiv",
            "lxxvi",
            "xxv",
            "lxxvii",
            "xxvi",
            "lxxviii",
            "xxvii",
            "lxxix",
            "xxviii",
            "lxxx",
            "xxx",
            "lxxxi",
            "xxxi",
            "lxxxii",
            "xxxii",
            "lxxxiii",
            "xxxiii",
            "lxxxiv",
            "xxxiv",
            "lxxxv",
            "xxxv",
            "lxxxvi",
            "xxxvi",
            "lxxxvii",
            "xxxvii",
            "lxxxviii",
            "xxxviii",
            "lxxxix",
            "xxxix",
            "lxl",
            "xl",
            "lxli",
            "xl",
            "lxii",
            "lxi",
            "lxiii",
            "lxiv",
            "lxv",
            "lxvi",
            "lxvii",
            "lxviii",
            "lxix",
            "lxx",
            "lxxi",
            "lxxii",
            "lxxiii",
            "lxxiv",
            "lxxv",
            "lxxvi",
            "lxxvii",
            "lxxviii",
            "lxxix",
            "lxxx",
            "lxxxi",
            "lxxxii",
            "lxxxiii",
            "lxxxiv",
            "lxxxv",
            "lxxxvi",
            "lxxxvii",
            "lxxxviii",
            "lxxxix",
            "lxl",
            "lx",
            "lxi",
            "lxii",
            "lxiii",
            "lxiv",
            "lxv",
            "lxvi",
            "lxvii",
            "lxviii",
            "lxix",
            "lxx",
            "lxxi",
            "lxxii",
            "lxxiii",
            "lxxiv",
            "lxxv",
            "lxxvi",
            "lxxvii",

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
