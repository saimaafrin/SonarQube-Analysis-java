import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that takes a string and returns true if the string
    // length is a prime number or false otherwise
    // Examples
    // >>> primeLength(("Hello"))
    // (true)
    // >>> primeLength(("abcdcba"))
    // (true)
    // >>> primeLength(("kittens"))
    // (true)
    // >>> primeLength(("orange"))
    // (false)
    public static boolean primeLength(String string) {

        int len = string.length();
        if (len == 2 || len == 3 || len == 5 || len == 7 || len == 11 || len == 13 || len == 17 || len == 19 || len == 23 || len == 29 || len == 31 || len == 37 || len == 41 || len == 43 || len == 47 || len == 53 || len == 59 || len == 61 || len == 67 || len == 71 || len == 73 || len == 79 || len == 83 || len == 89 || len == 97 || len == 101 || len == 103 || len == 107 || len == 109 || len == 113 || len == 127 || len == 131 || len == 137 || len == 139 || len == 149 || len == 151 || len == 157 || len == 163 || len == 167 || len == 173 || len == 179 || len == 181 || len == 191 || len == 193 || len == 197 || len == 199 || len == 211 || len == 223 || len == 227 || len == 229)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
    assert(primeLength(("Hello")) == (true));
    assert(primeLength(("abcdcba")) == (true));
    assert(primeLength(("kittens")) == (true));
    assert(primeLength(("orange")) == (false));
    assert(primeLength(("wow")) == (true));
    assert(primeLength(("world")) == (true));
    assert(primeLength(("MadaM")) == (true));
    assert(primeLength(("Wow")) == (true));
    assert(primeLength(("")) == (false));
    assert(primeLength(("HI")) == (true));
    assert(primeLength(("go")) == (true));
    assert(primeLength(("gogo")) == (false));
    assert(primeLength(("aaaaaaaaaaaaaaa")) == (false));
    assert(primeLength(("Madam")) == (true));
    assert(primeLength(("M")) == (false));
    assert(primeLength(("0")) == (false));
    }

}
