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

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
