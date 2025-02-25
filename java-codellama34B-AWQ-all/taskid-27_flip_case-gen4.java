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

        char[] arr = string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (Character.isUpperCase(c)) {
                arr[i] = Character.toLowerCase(c);
            } else {
                arr[i] = Character.toUpperCase(c);
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
