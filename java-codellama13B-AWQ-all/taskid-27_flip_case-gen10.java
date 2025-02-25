import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
    // >>> flipCase(("Hello"))
    // ("hELLO")
    public static String flipCase(String string) {

        String flippedCase = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char c : string.toCharArray()) {
            if (alphabet.indexOf(String.valueOf(c)) >= 0) {
                flippedCase += (c >= 'a' && c <= 'z') ? (char) (c - 32) : (char) (c + 32);
            } else {
                flippedCase += c;
            }
        }
        return flippedCase;
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
