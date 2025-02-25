import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // brackets is a string of "(" and ")".
    // return true if every opening bracket has a corresponding closing bracket.
    // >>> correctBracketing(("("))
    // (false)
    // >>> correctBracketing(("()"))
    // (true)
    // >>> correctBracketing(("(()())"))
    // (true)
    // >>> correctBracketing((")(()"))
    // (false)
    public static boolean correctBracketing(String brackets) {

        // Your code here
        // You can modify the local variable "brackets" (it's a new copy for this function call)
        // You can create local variables
        // You can use java.lang.Math (imported)

        // Return true/false
        // You can return early!
        // You can use the StringBuilder/StringBuffer class instead of String (StringBuffer is synchronized)
        // You can use a tuple instead of the input parameter, for example:
        //   EnumTuple.set(0, 10);
        //   EnumTuple.set(1, 20);
        //   int x = (Integer) EnumTuple.get(0);
        //   int y = (Integer) EnumTuple.get(1);
        //
        // The following functions might be useful:
        //   isLetter(c): returns true if c is a letter
        //   isDigit(c): returns true if c is a digit
        //   isLowerCase(c): returns true if c is lower case
        //   isUpperCase(c): returns true if c is upper case

        return false;
    }
    public static void main(String[] args) {
    assert(correctBracketing(("()")) == (true));
    assert(correctBracketing(("(()())")) == (true));
    assert(correctBracketing(("()()(()())()")) == (true));
    assert(correctBracketing(("()()((()()())())(()()(()))")) == (true));
    assert(correctBracketing(("((()())))")) == (false));
    assert(correctBracketing((")(()")) == (false));
    assert(correctBracketing(("(")) == (false));
    assert(correctBracketing(("((((")) == (false));
    assert(correctBracketing((")")) == (false));
    assert(correctBracketing(("(()")) == (false));
    assert(correctBracketing(("()()(()())())(()")) == (false));
    assert(correctBracketing(("()()(()())()))()")) == (false));
    }

}
