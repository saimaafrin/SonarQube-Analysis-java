import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a string s.
    // Your task is to check if the string is hapjava or not.
    // A string is hapjava if its length is at least 3 and every 3 consecutive letters are distinct
    // For example:
    // >>> isHappy(("a"))
    // (false)
    // >>> isHappy(("aa"))
    // (false)
    // >>> isHappy(("abcd"))
    // (true)
    // >>> isHappy(("aabb"))
    // (false)
    // >>> isHappy(("adb"))
    // (true)
    // >>> isHappy(("xyy"))
    // (false)
    public static boolean isHappy(String s) {

        if (s.length() < 3)
            return false;
        int n = s.length();
        for (int i = 0; i <= n - 3; i++) {
            String sub = s.substring(i, i + 3);
            if (!sub.equals("abc") && !sub.equals("bcd") && !sub.equals("cde") && !sub.equals("def") && !sub.equals("efg") && !sub.equals("fgh") && !sub.equals("ghi") && !sub.equals("hij") && !sub.equals("ijk") && !sub.equals("jkl") && !sub.equals("klm") && !sub.equals("lmn") && !sub.equals("mno") && !sub.equals("nop") && !sub.equals("opq") && !sub.equals("pqr") && !sub.equals("qrs") && !sub.equals("rst") && !sub.equals("stu") && !sub.equals("tuv") && !sub.equals("uvw") && !sub.equals("vwx") && !sub.equals("wxy") && !sub.equals("xyz"))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
    assert(isHappy(("a")) == (false));
    assert(isHappy(("aa")) == (false));
    assert(isHappy(("abcd")) == (true));
    assert(isHappy(("aabb")) == (false));
    assert(isHappy(("adb")) == (true));
    assert(isHappy(("xyy")) == (false));
    assert(isHappy(("iopaxpoi")) == (true));
    assert(isHappy(("iopaxioi")) == (false));
    }

}
