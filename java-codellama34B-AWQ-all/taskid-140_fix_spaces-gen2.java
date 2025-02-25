import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string text, replace all spaces in it with underscores, 
    // and if a string has more than 2 consecutive spaces, 
    // then replace all consecutive spaces with - 
    // >>> fixSpaces((" Example"))
    // ("Example")
    // >>> fixSpaces((" Example 1"))
    // ("Example_1")
    // >>> fixSpaces((" Example 2"))
    // ("_Example_2")
    // >>> fixSpaces((" Example 3"))
    // ("_Example-3")
    public static String fixSpaces(String text) {

        String spaces = "  ";
        int count = 0;
        boolean start = false;
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            } else if (count >= 2) {
                if (!start) {
                    result += "-";
                    start = true;
                }
                count = 0;
            } else if (count >= 1) {
                result += "_";
                count = 0;
                start = false;
            } else {
                result += text.charAt(i);
                start = false;
            }
        }
        return result;
    }
    public static void main(String[] args) {
    assert(fixSpaces(("Example")).equals(("Example")));
    assert(fixSpaces(("Mudasir Hanif ")).equals(("Mudasir_Hanif_")));
    assert(fixSpaces(("Yellow Yellow  Dirty  Fellow")).equals(("Yellow_Yellow__Dirty__Fellow")));
    assert(fixSpaces(("Exa   mple")).equals(("Exa-mple")));
    assert(fixSpaces(("   Exa 1 2 2 mple")).equals(("-Exa_1_2_2_mple")));
    }

}
