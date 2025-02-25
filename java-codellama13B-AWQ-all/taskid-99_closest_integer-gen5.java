import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that takes a value (string) representing a number
    // and returns the closest integer to it. If the number is equidistant
    // from two integers, round it away from zero.
    // Examples
    // >>> closestInteger(("10"))
    // (10l)
    // >>> closestInteger(("15.3"))
    // (15l)
    // Note:
    // Rounding away from zero means that if the given number is equidistant
    // from two integers, the one you should return is the one that is the
    // farthest from zero. For example closest_integer("14.5") should
    // return 15 and closest_integer("-14.5") should return -15.
    public static long closestInteger(String value) {

        int result = 0;
        long l = Long.parseLong(value);
        long ll = Long.parseLong(value);
        long r = Math.round(Double.parseDouble(value));
        double roundUp = Math.ceil(Double.parseDouble(value));
        double roundDown = Math.floor(Double.parseDouble(value));
        long rr = Math.round(Double.parseDouble(value));
        long rrr = Math.round(Double.parseDouble(value));
        if(Math.abs(l) > Math.abs(ll)) {
            result = (int) l;
        } else {
            result = (int) ll;
        }
        if(Math.abs(r) > Math.abs(rr)) {
            result = (int) r;
        }
        if(Math.abs(r) > Math.abs(rrr)) {
            result = (int) rr;
        }
        if(Math.abs(r) > Math.abs(rrrr)) {
            result = (int) rrr;
        }
        if(roundDown > Math.abs(ll) && Math.abs(ll) > roundUp) {
            result = (int) ll;
        }
        if(roundUp > Math.abs(ll) && Math.abs(ll) > roundDown) {
            result = (int) ll;
        }
        return result;
    }
    public static void main(String[] args) {
    assert(closestInteger(("10")) == (10l));
    assert(closestInteger(("14.5")) == (15l));
    assert(closestInteger(("-15.5")) == (-16l));
    assert(closestInteger(("15.3")) == (15l));
    assert(closestInteger(("0")) == (0l));
    }

}
