import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the count of the numbers of n-digit
    // positive integers that start or end with 1.
    public static long startsOneEnds(long n) {

        if(n <= 0)
            return 0;
        else if(n == 1)
            return 1;
        else if(n == 2)
            return 2;
        else if(n == 3)
            return 3;
        else if(n == 4)
            return 4;
        else if(n == 5)
            return 5;
        else if(n == 6)
            return 6;
        else if(n == 7)
            return 7;
        else if(n == 8)
            return 8;
        else if(n == 9)
            return 9;
        else if(n == 10)
            return 10;
        else if(n == 11)
            return 11;
        else if(n == 12)
            return 12;
        else if(n == 13)
            return 13;
        else if(n == 14)
            return 14;
        else if(n == 15)
            return 15;
        else if(n == 16)
            return 16;
        else if(n == 17)
            return 17;
        else if(n == 18)
            return 18;
        else if(n == 19)
            return 19;
        else if(n == 20)
            return 20;
        else if(n == 21)
            return 21;
        else if(n == 22)
            return 22;
        else if(n == 23)
            return 23;
        else if(n == 24)
            return 24;
        else if(n == 25)
            return 25;
        else if(n == 26)
            return 26;
        else if(n == 27)
            return 27;
        else if(n == 28)
            return 28;
        else if(n == 29)
            return 29;
        else if(n == 30)
            return 30;
        else if(n == 31)
            return 31;
        else if(n == 32)
            return 32;
        else if(n == 33)
            return 33;
        else if(n == 34)
            return 34;
        else if(n == 35)
            return 35;
        else if(n == 36)
            return 36;
        else if(n == 37)
            return 37;
        else if(n == 38)
            return 38;
        else if(n == 39)
            return 39;
        else if(n == 40)
            return 40;
        else if(n == 41)
            return 41;
        else if(n == 42)
            return 42;
        else if(n == 43)
            return 43;
        else if(n == 44)
            return 44;
        else if(n == 45)
            return 45;
        else if(n == 46)
            return 46;
        else if(n == 47)
            return 47;
        else if(n == 48)
            return 48;
        else if(n == 49)
            return 49;
        else if(n == 50)
            return 50;
        else if(n == 51)
            return 51;
        else if(n == 52)
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
