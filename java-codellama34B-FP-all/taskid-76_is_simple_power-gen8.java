import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Your task is to write a function that returns true if a number x is a simple
    // power of n and false in other cases.
    // x is a simple power of n if n**int=x
    // For example:
    // >>> isSimplePower((1l), (4l))
    // (true)
    // >>> isSimplePower((2l), (2l))
    // (true)
    // >>> isSimplePower((8l), (2l))
    // (true)
    // >>> isSimplePower((3l), (2l))
    // (false)
    // >>> isSimplePower((3l), (1l))
    // (false)
    // >>> isSimplePower((5l), (3l))
    // (false)
    public static boolean isSimplePower(long x, long n) {

        if(x <= 0 || n <= 0){
            return false;
        }

        if(n == 1){
            return true;
        }

        if(x < n){
            return false;
        }

        for(long i = 2; i < x; i++){
            if(x % i == 0){
                return false;
            }
        }

        long num = n;
        long xCopy = x;
        while(xCopy > 1){
            if(xCopy % num != 0){
                return false;
            }
            xCopy /= num;
        }

        return true;
    }
    public static void main(String[] args) {
    assert(isSimplePower((16l), (2l)) == (true));
    assert(isSimplePower((143214l), (16l)) == (false));
    assert(isSimplePower((4l), (2l)) == (true));
    assert(isSimplePower((9l), (3l)) == (true));
    assert(isSimplePower((16l), (4l)) == (true));
    assert(isSimplePower((24l), (2l)) == (false));
    assert(isSimplePower((128l), (4l)) == (false));
    assert(isSimplePower((12l), (6l)) == (false));
    assert(isSimplePower((1l), (1l)) == (true));
    assert(isSimplePower((1l), (12l)) == (true));
    }

}
