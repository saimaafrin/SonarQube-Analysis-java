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

        // Code here
        return string.chars().mapToObj(c -> (char)c).map(c -> {
            if (c >= 'a' && c <= 'z')
                return (char) (c - 32);
            if (c >= 'A' && c <= 'Z')
                return (char) (c + 32);
            return c;
        }).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
