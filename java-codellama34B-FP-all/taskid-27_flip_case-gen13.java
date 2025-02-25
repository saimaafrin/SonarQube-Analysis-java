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

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(c >= 'A' && c <= 'Z') result.append((char)(c + 'a' - 'A'));
            else if(c >= 'a' && c <= 'z') result.append((char)(c + 'A' - 'a'));
            else result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
