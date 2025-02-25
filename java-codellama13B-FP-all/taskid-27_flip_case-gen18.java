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

        return string.chars().mapToObj(i -> (char) i).map(c -> {
            if (Character.isLowerCase(c)) {
                return Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                return Character.toLowerCase(c);
            } else {
                return c;
            }
        }).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
