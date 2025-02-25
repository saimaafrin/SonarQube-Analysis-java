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

        return string.chars().map(ch -> {
            char newCh = (char) ch;
            if (Character.isLowerCase(ch)) {
                newCh = Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                newCh = Character.toLowerCase(ch);
            }
            return newCh;
        }).mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining(""));
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
