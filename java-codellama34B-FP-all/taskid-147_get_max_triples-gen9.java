import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a positive integer n. You have to create an integer array array list a of length n.
    // For each i (1 ≤ i ≤ n), the value of a[i] = i * i - i + 1.
    // Return the number of triples (a[i], a[j], a[k]) of a where i < j < k, 
    // and a[i] + a[j] + a[k] is a multiple of 3.
    // Example :
    // >>> getMaxTriples((5l))
    // (1l)
    // Explanation: 
    // a = [1, 3, 7, 13, 21]
    // The only valid triple is (1, 7, 13).
    public static long getMaxTriples(long n) {

        int x = (int) n;
        long[] A = new long[x];
        long[] B = new long[x];
        int[] C = new int[x];
        long[] E = new long[x];
        int[] F = new int[x];
        int[] G = new int[x];
        int[] H = new int[x];
        long[] I = new long[x];
        int[] J = new int[x];
        int[] K = new int[x];
        int[] L = new int[x];
        long[] M = new long[x];
        int[] N = new int[x];
        int[] O = new int[x];
        int[] P = new int[x];
        int[] Q = new int[x];
        int[] R = new int[x];
        long[] S = new long[x];
        int[] T = new int[x];
        int[] U = new int[x];
        int[] V = new int[x];
        int[] W = new int[x];
        int[] X = new int[x];
        int[] Y = new int[x];
        int[] Z = new int[x];
        int[] aa = new int[x];
        int[] ab = new int[x];
        int[] ac = new int[x];
        int[] ad = new int[x];
        int[] ae = new int[x];
        int[] af = new int[x];
        int[] ag = new int[x];
        int[] ah = new int[x];
        int[] ai = new int[x];
        int[] aj = new int[x];
        int[] ak = new int[x];
        int[] al = new int[x];
        int[] am = new int[x];
        int[] an = new int[x];
        int[] ao = new int[x];
        int[] ap = new int[x];
        int[] aq = new int[x];
        int[] ar = new int[x];
        int[] as = new int[x];
        int[] at = new int[x];
        int[] au = new int[x];
        int[] av = new int[x];
        int[] aw = new int[x];
        int[] ax = new int[x];
        int[] ay = new int[x];
        int[] az = new int[x];
        int[] aaa = new int[x];
        int[] aab = new int[x];
        int[] aac = new int[x];
        int[] aad = new int[x];
        int[] aae = new int[x];
        int[] aaf = new int[x];
        int[] aag = new int[x];
        int[] aah = new int[x];
        int[] aai = new int[x];
        int[] aaj = new int[x];
        int[] aak = new int[x];
        int[] aal = new int[x];
        int[] aam = new int[x];
        int[] aan = new int[x];
        int[] aao = new int[x];
        int[] aap = new int[x];
        int[] aaaa =
    }
    public static void main(String[] args) {
    assert(getMaxTriples((5l)) == (1l));
    assert(getMaxTriples((6l)) == (4l));
    assert(getMaxTriples((10l)) == (36l));
    assert(getMaxTriples((100l)) == (53361l));
    }

}
