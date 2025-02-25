import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given an array array list of integers.
    // You need to find the largest prime value and return the sum of its digits.
    // Examples:
    // >>> skjkasdkd((new ArrayList<Long>(Arrays.asList((long)0l, (long)3l, (long)2l, (long)1l, (long)3l, (long)5l, (long)7l, (long)4l, (long)5l, (long)5l, (long)5l, (long)2l, (long)181l, (long)32l, (long)4l, (long)32l, (long)3l, (long)2l, (long)32l, (long)324l, (long)4l, (long)3l))))
    // (10l)
    // >>> skjkasdkd((new ArrayList<Long>(Arrays.asList((long)1l, (long)0l, (long)1l, (long)8l, (long)2l, (long)4597l, (long)2l, (long)1l, (long)3l, (long)40l, (long)1l, (long)2l, (long)1l, (long)2l, (long)4l, (long)2l, (long)5l, (long)1l))))
    // (25l)
    // >>> skjkasdkd((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)1l, (long)32l, (long)5107l, (long)34l, (long)83278l, (long)109l, (long)163l, (long)23l, (long)2323l, (long)32l, (long)30l, (long)1l, (long)9l, (long)3l))))
    // (13l)
    // >>> skjkasdkd((new ArrayList<Long>(Arrays.asList((long)0l, (long)724l, (long)32l, (long)71l, (long)99l, (long)32l, (long)6l, (long)0l, (long)5l, (long)91l, (long)83l, (long)0l, (long)5l, (long)6l))))
    // (11l)
    // >>> skjkasdkd((new ArrayList<Long>(Arrays.asList((long)0l, (long)81l, (long)12l, (long)3l, (long)1l, (long)21l))))
    // (3l)
    // >>> skjkasdkd((new ArrayList<Long>(Arrays.asList((long)0l, (long)8l, (long)1l, (long)2l, (long)1l, (long)7l))))
    // (7l)
    public static long skjkasdkd(ArrayList<Long> lst) {

        Set<Long> primes = new HashSet<Long>();
        primes.add(1l);
        primes.add(2l);
        for(int i = 3; i <= 100; i++) {
            boolean is_prime = true;
            for(long l : primes) {
                if(i % l == 0) {
                    is_prime = false;
                    break;
                }
            }
            if(is_prime) primes.add((long)i);
        }
        ArrayList<Long> prime_array = new ArrayList<Long>(primes);
        prime_array.sort(Comparator.reverseOrder());
        long result = 0l;
        for(long l : prime_array) {
            if(l <= 100) {
                boolean is_good = true;
                for(long l1 : lst) {
                    if(
    }
    public static void main(String[] args) {
    assert(skjkasdkd((new ArrayList<Long>(Arrays.asList((long)0l, (long)3l, (long)2l, (long)1l, (long)3l, (long)5l, (long)7l, (long)4l, (long)5l, (long)5l, (long)5l, (long)2l, (long)181l, (long)32l, (long)4l, (long)32l, (long)3l, (long)2l, (long)32l, (long)324l, (long)4l, (long)3l)))) == (10l));
    assert(skjkasdkd((new ArrayList<Long>(Arrays.asList((long)1l, (long)0l, (long)1l, (long)8l, (long)2l, (long)4597l, (long)2l, (long)1l, (long)3l, (long)40l, (long)1l, (long)2l, (long)1l, (long)2l, (long)4l, (long)2l, (long)5l, (long)1l)))) == (25l));
    assert(skjkasdkd((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)1l, (long)32l, (long)5107l, (long)34l, (long)83278l, (long)109l, (long)163l, (long)23l, (long)2323l, (long)32l, (long)30l, (long)1l, (long)9l, (long)3l)))) == (13l));
    assert(skjkasdkd((new ArrayList<Long>(Arrays.asList((long)0l, (long)724l, (long)32l, (long)71l, (long)99l, (long)32l, (long)6l, (long)0l, (long)5l, (long)91l, (long)83l, (long)0l, (long)5l, (long)6l)))) == (11l));
    assert(skjkasdkd((new ArrayList<Long>(Arrays.asList((long)0l, (long)81l, (long)12l, (long)3l, (long)1l, (long)21l)))) == (3l));
    assert(skjkasdkd((new ArrayList<Long>(Arrays.asList((long)0l, (long)8l, (long)1l, (long)2l, (long)1l, (long)7l)))) == (7l));
    assert(skjkasdkd((new ArrayList<Long>(Arrays.asList((long)8191l)))) == (19l));
    assert(skjkasdkd((new ArrayList<Long>(Arrays.asList((long)8191l, (long)123456l, (long)127l, (long)7l)))) == (19l));
    assert(skjkasdkd((new ArrayList<Long>(Arrays.asList((long)127l, (long)97l, (long)8192l)))) == (10l));
    }

}
