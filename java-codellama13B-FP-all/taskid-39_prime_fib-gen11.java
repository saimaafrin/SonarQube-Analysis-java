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

        long pf = -1;
        // fib2 returns n-th Fibonacci number.
        // >>> fib2((1l))
        // (1l)
        // >>> fib2((2l))
        // (1l)
        // >>> fib2((3l))
        // (2l)
        // >>> fib2((4l))
        // (3l)
        // >>> fib2((5l))
        // (5l)
        // >>> fib2((6l))
        // (8l)
        // >>> fib2((7l))
        // (13l)
        // >>> fib2((8l))
        // (21l)
        // >>> fib2((9l))
        // (34l)
        // >>> fib2((10l))
        // (55l)
        // >>> fib2((11l))
        // (89l)
        // >>> fib2((12l))
        // (144l)
        // >>> fib2((13l))
        // (233l)
        // >>> fib2((14l))
        // (377l)
        // >>> fib2((15l))
        // (610l)
        // >>> fib2((16l))
        // (987l)
        // >>> fib2((17l))
        // (1597l)
        // >>> fib2((18l))
        // (2584l)
        // >>> fib2((19l))
        // (4181l)
        // >>> fib2((20l))
        // (6765l)
        // >>> fib2((21l))
        // (10946l)
        // >>> fib2((22l))
        // (17711l)
        // >>> fib2((23l))
        // (28657l)
        // >>> fib2((24l))
        // (46368l)
        // >>> fib2((25l))
        // (75025l)
        // >>> fib2((26l))
        // (121393l)
        // >>> fib2((27l))
        // (196418l)
        // >>> fib2((28l))
        // (317811l)
        // >>> fib2((29l))
        // (514229l)
        // >>> fib2((30l))
        // (832040l)
        // >>> fib2((31l))
        // (1346269l)
        // >>> fib2((32l))
        // (2178309l)
        // >>> fib2((33l))
        // (3524578l)
        // >>> fib2((34l))
        // (5702887l)
        // >>> fib2((35l))
        // (9227465l)
        // >>> fib2((36l))
        // (14930352l)
        // >>> fib2((37l))
        // (24157817l)
        // >>> fib2((38l))
        // (39088169l)
        // >>> fib2((39l))
        // (632
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
