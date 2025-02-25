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

        // A regular expression that matches all uppercase letters
        String uppercase = "[A-Z]";
        // A regular expression that matches all lowercase letters
        String lowercase = "[a-z]";
        // A regular expression that matches either an uppercase or lowercase letter
        String regex = "(" + uppercase + "|" + lowercase + ")";
        // Create a regular expression Pattern object
        Pattern pattern = Pattern.compile(regex);
        // Create a Matcher object for the Pattern
        Matcher matcher = pattern.matcher(string);
        // StringBuilder to build the new string
        StringBuilder builder = new StringBuilder(string.length());
        // Iterate through each match in the string
        while (matcher.find()) {
            // Get the matched character
            String c = matcher.group(1);
            // If it's lowercase, replace it with the uppercase version
            if (c.equals(c.toLowerCase())) {
                matcher.appendReplacement(builder, c.toUpperCase());
            }
            // If it's uppercase, replace it with the lowercase version
            else {
                matcher.appendReplacement(builder, c.toLowerCase());
            }
        }
        // Add any remaining characters from the original string to the new string
        matcher.appendTail(builder);
        // Return the new string
        return builder.toString();
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
