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

        // return string.toUpperCase()
        StringBuilder flippedCase = new StringBuilder();
        for(int i=0; i < string.length(); i++){
            char c = string.charAt(i);
            if(Character.isLowerCase(c)){
                flippedCase.append(Character.toUpperCase(c));
            }else{
                flippedCase.append(Character.toLowerCase(c));
            }
        }
        return flippedCase.toString();
    }
    public static void main(String[] args) {
    assert(flipCase(("")).equals(("")));
    assert(flipCase(("Hello!")).equals(("hELLO!")));
    assert(flipCase(("These violent delights have violent ends")).equals(("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS")));
    }

}
