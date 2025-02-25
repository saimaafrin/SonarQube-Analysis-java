import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // The Brazilian factorial is defined as:
    // brazilian_factorial(n) = n! * (n-1)! * (n-2)! * ... * 1!
    // where n > 0
    // For example:
    // >>> specialFactorial((4l))
    // (288l)
    // The function will receive an integer as input and should return the special
    // factorial of this integer.
    public static long specialFactorial(long n) {

        long result = n;
        long[] myList = new long[(int) n];
        if(n>0){
            myList[(int)n-1] = 1;
        }
        for(int i = (int)n-2;i>=0;i--){
            result *= i;
            myList[i] = result;
        }
        for(int j = 0;j<(int)n;j++){
            result *= myList[j];
        }
        return result;
    }
    public static void main(String[] args) {
    assert(specialFactorial((4l)) == (288l));
    assert(specialFactorial((5l)) == (34560l));
    assert(specialFactorial((7l)) == (125411328000l));
    assert(specialFactorial((1l)) == (1l));
    }

}
