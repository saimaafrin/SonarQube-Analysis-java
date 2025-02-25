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

        String new_text = "";
        int count = 0;
        boolean space_found = false;
        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                if (space_found) {
                    new_text += "-";
                    count = 0;
                } else {
                    new_text += "_";
                    space_found = true;
                }
            } else {
                new_text += ch;
                count++;
                if (count == 2) {
                    space_found = false;
                    count = 0;
                }
            }
        }
        return new_text;
    }
    public static void main(String[] args) {
    assert(fixSpaces(("Example")).equals(("Example")));
    assert(fixSpaces(("Mudasir Hanif ")).equals(("Mudasir_Hanif_")));
    assert(fixSpaces(("Yellow Yellow  Dirty  Fellow")).equals(("Yellow_Yellow__Dirty__Fellow")));
    assert(fixSpaces(("Exa   mple")).equals(("Exa-mple")));
    assert(fixSpaces(("   Exa 1 2 2 mple")).equals(("-Exa_1_2_2_mple")));
    }

}
