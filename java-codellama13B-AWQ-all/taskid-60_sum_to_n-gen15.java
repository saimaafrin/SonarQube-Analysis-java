import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // sum_to_n is a function that sums numbers from 1 to n.
    // >>> sumToN((30l))
    // (465l)
    // >>> sumToN((100l))
    // (5050l)
    // >>> sumToN((5l))
    // (15l)
    // >>> sumToN((10l))
    // (55l)
    // >>> sumToN((1l))
    // (1l)
    public static long sumToN(long n) {

        // You are given a function sum_to_n which takes a single 
        // integer argument n and returns the sum of the first n 
        // positive integers. For example, if n = 5, then the 
        // function sum_to_n(n) returns 1+2+3+4+5 = 15.
        //
        // Your task is to write a function that takes a single 
        // integer argument n and returns the sum of the first n 
        // positive integers using the function sum_to_n. You may 
        // use recursion to solve this problem.
        return n + sumToN(n - 1);
    }
    public static void main(String[] args) {
    assert(sumToN((1l)) == (1l));
    assert(sumToN((6l)) == (21l));
    assert(sumToN((11l)) == (66l));
    assert(sumToN((30l)) == (465l));
    assert(sumToN((100l)) == (5050l));
    }

}
