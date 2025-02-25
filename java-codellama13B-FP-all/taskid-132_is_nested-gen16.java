import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that takes a string as input which contains only square brackets.
    // The function should return true if and only if there is a valid subsequence of brackets 
    // where at least one bracket in the subsequence is nested.
    // >>> isNested(("[[]]"))
    // (true)
    // >>> isNested(("[]]]]]]][[[[[]"))
    // (false)
    // >>> isNested(("[][]"))
    // (false)
    // >>> isNested(("[]"))
    // (false)
    // >>> isNested(("[[][]]"))
    // (true)
    // >>> isNested(("[[]][["))
    // (true)
    public static boolean isNested(String string) {

        String pattern1 = "\\[\\]";
        String pattern2 = "\\[\\[]";
        String pattern3 = "\\[]\\]";
        String pattern4 = "\\[\\[";
        String pattern5 = "\\]\\]";
        String pattern6 = "\\]\\[";
        String pattern7 = "\\[[\\]]";
        if(string.replaceAll(pattern1, "").isEmpty()){
            return false;
        }
        if(string.replaceAll(pattern2, "").isEmpty()){
            return false;
        }
        if(string.replaceAll(pattern3, "").isEmpty()){
            return false;
        }
        if(string.replaceAll(pattern4, "").isEmpty()){
            return false;
        }
        if(string.replaceAll(pattern5, "").isEmpty()){
            return false;
        }
        if(string.replaceAll(pattern6, "").isEmpty()){
            return false;
        }
        if(string.replaceAll(pattern7, "").isEmpty()){
            return true;
        }
        return true;
    }
    public static void main(String[] args) {
    assert(isNested(("[[]]")) == (true));
    assert(isNested(("[]]]]]]][[[[[]")) == (false));
    assert(isNested(("[][]")) == (false));
    assert(isNested(("[]")) == (false));
    assert(isNested(("[[[[]]]]")) == (true));
    assert(isNested(("[]]]]]]]]]]")) == (false));
    assert(isNested(("[][][[]]")) == (true));
    assert(isNested(("[[]")) == (false));
    assert(isNested(("[]]")) == (false));
    assert(isNested(("[[]][[")) == (true));
    assert(isNested(("[[][]]")) == (true));
    assert(isNested(("")) == (false));
    assert(isNested(("[[[[[[[[")) == (false));
    assert(isNested(("]]]]]]]]")) == (false));
    }

}
