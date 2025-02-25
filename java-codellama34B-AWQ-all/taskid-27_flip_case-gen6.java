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

        if (string.equals("")) return string;
        char[] c = string.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (Character.isUpperCase(c[i])) c[i] = Character.toLowerCase(c[i]);
            else c[i] = Character.toUpperCase(c[i]);
        }
        return new String(c);
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
