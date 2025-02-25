import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Your task is to implement a function that will simplify the expression
    // x * n. The function returns true if x * n evaluates to a whole number and false
    // otherwise. Both x and n, are string representation of a fraction, and have the following format,
    // <numerator>/<denominator> where both numerator and denominator are positive whole numbers.
    // You can assume that x, and n are valid fractions, and do not have zero as denominator.
    // >>> simplify(("1/5"), ("5/1"))
    // (true)
    // >>> simplify(("1/6"), ("2/1"))
    // (false)
    // >>> simplify(("7/10"), ("10/2"))
    // (false)
    public static boolean simplify(String x, String n) {

        if (x == null || n == null) return false;

        int slashIndex = x.indexOf('/');
        int xNumerator = Integer.parseInt(x.substring(0, slashIndex));
        int xDenominator = Integer.parseInt(x.substring(slashIndex + 1));

        slashIndex = n.indexOf('/');
        int nNumerator = Integer.parseInt(n.substring(0, slashIndex));
        int nDenominator = Integer.parseInt(n.substring(slashIndex + 1));

        BigInteger xNumeratorBigInt = new BigInteger(xNumerator + "");
        BigInteger xDenominatorBigInt = new BigInteger(xDenominator + "");
        BigInteger nNumeratorBigInt = new BigInteger(nNumerator + "");
        BigInteger nDenominatorBigInt = new BigInteger(nDenominator + "");

        BigInteger product = xNumeratorBigInt.multiply(nDenominatorBigInt).multiply(nNumeratorBigInt).multiply(xDenominatorBigInt);
        BigInteger gcd = product.gcd(xDenominatorBigInt.multiply(nDenominatorBigInt));
        return gcd.compareTo(BigInteger.ONE) == 0;
    }
    public static void main(String[] args) {
    assert(simplify(("1/5"), ("5/1")) == (true));
    assert(simplify(("1/6"), ("2/1")) == (false));
    assert(simplify(("5/1"), ("3/1")) == (true));
    assert(simplify(("7/10"), ("10/2")) == (false));
    assert(simplify(("2/10"), ("50/10")) == (true));
    assert(simplify(("7/2"), ("4/2")) == (true));
    assert(simplify(("11/6"), ("6/1")) == (true));
    assert(simplify(("2/3"), ("5/2")) == (false));
    assert(simplify(("5/2"), ("3/5")) == (false));
    assert(simplify(("2/4"), ("8/4")) == (true));
    assert(simplify(("2/4"), ("4/2")) == (true));
    assert(simplify(("1/5"), ("5/1")) == (true));
    assert(simplify(("1/5"), ("1/5")) == (false));
    }

}
