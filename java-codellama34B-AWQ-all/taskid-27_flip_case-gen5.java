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

        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (Character.isUpperCase(c)) {
                array[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                array[i] = Character.toUpperCase(c);
            }
        }
        return new String(array);
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
