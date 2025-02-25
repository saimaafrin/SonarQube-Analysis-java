import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Find how many times a given substring can be found in the original string. Count overlaping cases.
    // >>> howManyTimes((""), ("a"))
    // (0l)
    // >>> howManyTimes(("aaa"), ("a"))
    // (3l)
    // >>> howManyTimes(("aaaa"), ("aa"))
    // (3l)
    public static long howManyTimes(String string, String substring) {

        // We want to check whether a substring is contained in the given string.
        // >>> if (("").contains(("a")))
        // False
        // >>> if (("aaa").contains(("a")))
        // True
        // >>> if (("aaaa").contains(("aa")))
        // True
        // To solve this problem, we can just check the number of times that the substring is contained in the string.
        // >>> ("").count(("a"))
        // (0)
        // >>> ("aaa").count(("a"))
        // (3)
        // >>> ("aaaa").count(("aa"))
        // (3)
        return string.count(substring);
    }
    public static void main(String[] args) {
    assert(howManyTimes((""), ("x")) == (0l));
    assert(howManyTimes(("xyxyxyx"), ("x")) == (4l));
    assert(howManyTimes(("cacacacac"), ("cac")) == (4l));
    assert(howManyTimes(("john doe"), ("john")) == (1l));
    }

}
