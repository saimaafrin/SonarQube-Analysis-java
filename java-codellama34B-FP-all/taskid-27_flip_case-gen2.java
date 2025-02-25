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

        // Create empty string to store result
        String result = "";
        // Iterate over string
        for (int i = 0; i < string.length(); i++) {
            // If character is lowercase
            if (Character.isLowerCase(string.charAt(i))) {
                // Convert to uppercase
                result += Character.toUpperCase(string.charAt(i));
            }
            // If character is uppercase
            else if (Character.isUpperCase(string.charAt(i))) {
                // Convert to lowercase
                result += Character.toLowerCase(string.charAt(i));
            }
            // If character is neither lowercase nor uppercase
            else {
                // Append character to result
                result += string.charAt(i);
            }
        }
        // Return result
        return result;
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
