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

        String text2 = "";
        String newtext = "";
        for (int i = 0; i < text.length(); i++) {
            text2 = text2 + text.charAt(i);
            if (text.charAt(i) != ' ') {
                newtext = newtext + text2;
                text2 = "";
            }
        }
        String[] a = newtext.split(" ");
        String ntext = "";
        for (int i = 0; i < a.length; i++) {
            ntext = ntext + a[i] + " ";
        }
        String text3 = "";
        for (int i = 0; i < ntext.length(); i++) {
            if (ntext.charAt(i) != ' ') {
                text3 = text3 + ntext.charAt(i);
            }
            if (ntext.charAt(i) == ' ') {
                text3 = text3 + "__";
            }
        }
        String text4 = "";
        int d = 0;
        for (int i = 0; i < text3.length(); i++) {
            if (text3.charAt(i) == '_') {
                d = d + 1;
            }
            if (text3.charAt(i) != '_') {
                text4 = text4 + text3.charAt(i);
                d = 0;
            }
            if (d >= 2) {
                text4 = text4 + "-";
                d = 0;
            }
        }
        return text4;
    }
    public static void main(String[] args) {
    assert(fixSpaces(("Example")).equals(("Example")));
    assert(fixSpaces(("Mudasir Hanif ")).equals(("Mudasir_Hanif_")));
    assert(fixSpaces(("Yellow Yellow  Dirty  Fellow")).equals(("Yellow_Yellow__Dirty__Fellow")));
    assert(fixSpaces(("Exa   mple")).equals(("Exa-mple")));
    assert(fixSpaces(("   Exa 1 2 2 mple")).equals(("-Exa_1_2_2_mple")));
    }

}
