import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return the number of times the digit 7 appears in integers less than n which are divisible by 11 or 13.
    // >>> fizzBuzz((50l))
    // (0l)
    // >>> fizzBuzz((78l))
    // (2l)
    // >>> fizzBuzz((79l))
    // (3l)
    public static long fizzBuzz(long n) {

        long divisibleBy11 = (long)Stream.iterate((long)11l, x -> x + 11).takeWhile(x -> x < n).count();
        long divisibleBy13 = (long)Stream.iterate((long)13l, x -> x + 13).takeWhile(x -> x < n).count();
        long divisibleBy14 = (long)Stream.iterate((long)14l, x -> x + 14).takeWhile(x -> x < n).count();
        long divisibleBy15 = (long)Stream.iterate((long)15l, x -> x + 15).takeWhile(x -> x < n).count();
        long divisibleBy16 = (long)Stream.iterate((long)16l, x -> x + 16).takeWhile(x -> x < n).count();
        long divisibleBy17 = (long)Stream.iterate((long)17l, x -> x + 17).takeWhile(x -> x < n).count();
        long divisibleBy18 = (long)Stream.iterate((long)18l, x -> x + 18).takeWhile(x -> x < n).count();
        long divisibleBy19 = (long)Stream.iterate((long)19l, x -> x + 19).takeWhile(x -> x < n).count();
        long divisibleBy20 = (long)Stream.iterate((long)20l, x -> x + 20).takeWhile(x -> x < n).count();
        long divisibleBy21 = (long)Stream.iterate((long)21l, x -> x + 21).takeWhile(x -> x < n).count();
        long divisibleBy22 = (long)Stream.iterate((long)22l, x -> x + 22).takeWhile(x -> x < n).count();
        long divisibleBy23 = (long)Stream.iterate((long)23l, x -> x + 23).takeWhile(x -> x < n).count();
        long divisibleBy24 = (long)Stream.iterate((long)24l, x -> x + 24).takeWhile(x -> x < n).count();
        long divisibleBy25 = (long)Stream.iterate((long)25l, x -> x + 25).takeWhile(x -> x < n).count();
        long divisibleBy26 = (long)Stream.iterate((long)26l, x -> x + 26).takeWhile(x -> x < n).count();
        long divisibleBy27 = (long)Stream.iterate((long)27l, x -> x + 27).takeWhile(x -> x < n).count();
        long divisibleBy28 = (long)Stream.iterate((long)28l, x -> x + 28).takeWhile(x -> x < n).count();
        long divisibleBy29 = (long)Stream.iterate((long)29l, x -> x + 29).takeWhile(x -> x < n).count();
        long divisibleBy30 = (long)Stream.iterate((long)30l, x -> x + 30).takeWhile(x -> x < n).count();
        long divisibleBy31 = (long)Stream.iterate((long)31l, x -> x + 31).takeWhile(x -> x < n).count();
        long divisibleBy3
    }
    public static void main(String[] args) {
    assert(fizzBuzz((50l)) == (0l));
    assert(fizzBuzz((78l)) == (2l));
    assert(fizzBuzz((79l)) == (3l));
    assert(fizzBuzz((100l)) == (3l));
    assert(fizzBuzz((200l)) == (6l));
    assert(fizzBuzz((4000l)) == (192l));
    assert(fizzBuzz((10000l)) == (639l));
    assert(fizzBuzz((100000l)) == (8026l));
    }

}
