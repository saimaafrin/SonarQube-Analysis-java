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

        // Write your code here
        // char[] temp = text.toCharArray();
        StringBuffer newText = new StringBuffer();
        for (char c : text.toCharArray()) {
            if (c != ' ')
                newText.append(c);
            else
                newText.append("_");
        }
        text = newText.toString();
        // System.out.println(text);
        StringBuffer output = new StringBuffer();
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == '_')
                count++;
            else
                count = 0;
            if (count < 2)
                output.append(c);
            else if (count == 2)
                output.append('-');
        }
        // System.out.println(output);
        return output.toString();
    }
    public static void main(String[] args) {
    assert(fixSpaces(("Example")).equals(("Example")));
    assert(fixSpaces(("Mudasir Hanif ")).equals(("Mudasir_Hanif_")));
    assert(fixSpaces(("Yellow Yellow  Dirty  Fellow")).equals(("Yellow_Yellow__Dirty__Fellow")));
    assert(fixSpaces(("Exa   mple")).equals(("Exa-mple")));
    assert(fixSpaces(("   Exa 1 2 2 mple")).equals(("-Exa_1_2_2_mple")));
    }

}
