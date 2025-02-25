import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return 2^n modulo p (be aware of numerics).
    // >>> modp((3l), (5l))
    // (3l)
    // >>> modp((1101l), (101l))
    // (2l)
    // >>> modp((0l), (101l))
    // (1l)
    // >>> modp((3l), (11l))
    // (8l)
    // >>> modp((100l), (101l))
    // (1l)
    public static long modp(long n, long p) {

        long pow;
        long rest;
        // pow = 1l;
        // while (pow <= n) {
        //     pow *= 2l;
        // }
        // rest = pow - n;
        // while (rest < p) {
        //     rest *= 2l;
        // }
        // return rest % p;
        pow = 1l;
        rest = 0l;
        while (rest < p) {
            rest = (rest + pow) % p;
            pow = (pow + pow) % p;
        }
        return rest;
    }
    public static void main(String[] args) {
    assert(modp((3l), (5l)) == (3l));
    assert(modp((1101l), (101l)) == (2l));
    assert(modp((0l), (101l)) == (1l));
    assert(modp((3l), (11l)) == (8l));
    assert(modp((100l), (101l)) == (1l));
    assert(modp((30l), (5l)) == (4l));
    assert(modp((31l), (5l)) == (3l));
    }

}
