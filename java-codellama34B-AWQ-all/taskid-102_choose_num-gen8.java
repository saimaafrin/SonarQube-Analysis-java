import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // This function takes two positive numbers x and y and returns the
    // biggest even integer number that is in the range [x, y] inclusive. If 
    // there's no such number, then the function should return -1.
    // For example:
    // >>> chooseNum((12l), (15l))
    // (14l)
    // >>> chooseNum((13l), (12l))
    // (-1l)
    public static long chooseNum(long x, long y) {

        return x % 2 == 0 && x <= y ? x : (x + 1) % 2 == 0 && (x + 1) <= y ? x + 1 : (x + 2) % 2 == 0 && (x + 2) <= y ? x + 2 : (x + 3) % 2 == 0 && (x + 3) <= y ? x + 3 : (x + 4) % 2 == 0 && (x + 4) <= y ? x + 4 : (x + 5) % 2 == 0 && (x + 5) <= y ? x + 5 : (x + 6) % 2 == 0 && (x + 6) <= y ? x + 6 : (x + 7) % 2 == 0 && (x + 7) <= y ? x + 7 : (x + 8) % 2 == 0 && (x + 8) <= y ? x + 8 : (x + 9) % 2 == 0 && (x + 9) <= y ? x + 9 : (x + 10) % 2 == 0 && (x + 10) <= y ? x + 10 : (x + 11) % 2 == 0 && (x + 11) <= y ? x + 11 : (x + 12) % 2 == 0 && (x + 12) <= y ? x + 12 : (x + 13) % 2 == 0 && (x + 13) <= y ? x + 13 : (x + 14) % 2 == 0 && (x + 14) <= y ? x + 14 : (x + 15) % 2 == 0 && (x + 15) <= y ? x + 15 : -1;
    }
    public static void main(String[] args) {
    assert(chooseNum((12l), (15l)) == (14l));
    assert(chooseNum((13l), (12l)) == (-1l));
    assert(chooseNum((33l), (12354l)) == (12354l));
    assert(chooseNum((5234l), (5233l)) == (-1l));
    assert(chooseNum((6l), (29l)) == (28l));
    assert(chooseNum((27l), (10l)) == (-1l));
    assert(chooseNum((7l), (7l)) == (-1l));
    assert(chooseNum((546l), (546l)) == (546l));
    }

}
