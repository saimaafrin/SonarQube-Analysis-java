import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // prime_fib returns n-th number that is a Fibonacci number and it's also prime.
    // >>> primeFib((1l))
    // (2l)
    // >>> primeFib((2l))
    // (3l)
    // >>> primeFib((3l))
    // (5l)
    // >>> primeFib((4l))
    // (13l)
    // >>> primeFib((5l))
    // (89l)
    public static long primeFib(long n) {

        long pf = 0l;
        long i = 0l;
        long[] primes = new long[] { 3l, 5l, 7l, 11l, 13l, 17l, 19l, 23l, 29l, 31l, 37l, 41l, 43l, 47l, 53l, 59l, 61l, 67l, 71l, 73l, 79l, 83l, 89l, 97l, 101l, 103l, 107l, 109l, 113l, 127l, 131l, 137l, 139l, 149l, 151l, 157l, 163l, 167l, 173l, 179l, 181l, 191l, 193l, 197l, 199l, 211l, 221l, 223l, 227l, 229l, 233l, 239l, 241l, 251l };
        long[] fibs = new long[] { 0l, 1l, 1l, 2l, 3l, 5l, 8l, 13l, 21l, 34l, 55l, 89l, 144l, 233l, 377l, 610l, 987l, 1597l, 2584l, 4181l, 6765l, 10946l, 17711l, 28657l, 46368l, 75025l, 121393l, 196418l, 317811l, 514229l, 832040l, 1346269l, 2178309l, 3524578l, 5702887l, 9227465l, 14930352l, 24157817l, 39088169l, 63245986l, 102334155l, 165580141l, 267914296l, 433494437l, 701408733l, 1134903170l };
        for (long i : primes) {
            if (n == 1) {
                pf = i;
                break;
            }
            n -= 1l;
        }
        for (long i : fibs) {
            if (n == 1) {
                pf = i;
                break;
            }
            n -= 1l;
        }
        return pf;
    }
    public static void main(String[] args) {
    assert(primeFib((1l)) == (2l));
    assert(primeFib((2l)) == (3l));
    assert(primeFib((3l)) == (5l));
    assert(primeFib((4l)) == (13l));
    assert(primeFib((5l)) == (89l));
    assert(primeFib((6l)) == (233l));
    assert(primeFib((7l)) == (1597l));
    assert(primeFib((8l)) == (28657l));
    assert(primeFib((9l)) == (514229l));
    assert(primeFib((10l)) == (433494437l));
    }

}
