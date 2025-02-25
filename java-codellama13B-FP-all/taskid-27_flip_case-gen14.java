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

        // 1. Convert the given string into an array of characters.
        char[] strArray = string.toCharArray();
        // 2. Traverse the array, and convert each character from lowercase to uppercase,
        //    and vice versa.
        for (int i = 0; i < strArray.length; i++) {
            // Check if the character is a lowercase letter.
            if (strArray[i] >= 'a' && strArray[i] <= 'z') {
                // If the character is a lowercase letter, then convert it to uppercase.
                strArray[i] = (char)(strArray[i] - 32);
            } else if (strArray[i] >= 'A' && strArray[i] <= 'Z') {
                // If the character is an uppercase letter, then convert it to lowercase.
                strArray[i] = (char)(strArray[i] + 32);
            }
        }
        // 3. Convert the array of characters back to a string.
        String result = String.valueOf(strArray);
        return result;
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
