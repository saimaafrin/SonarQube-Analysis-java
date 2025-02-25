import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list arr of integers, find the minimum number of elements that
    // need to be changed to make the array array list palindromic. A palindromic array array list is an array array list that
    // is read the same backwards and forwards. In one change, you can change one element to any other element.
    // For example:
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)5l, (long)4l, (long)7l, (long)9l, (long)6l))))
    // (4l)
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)3l, (long)2l, (long)2l))))
    // (1l)
    // >>> smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)1l))))
    // (0l)
    public static long smallestChange(ArrayList<Long> arr) {

        long count = 0;
        long count2 = 0;
        long count3 = 0;
        long count4 = 0;
        long count5 = 0;
        long count6 = 0;
        long count7 = 0;
        long count8 = 0;
        long count9 = 0;
        long count10 = 0;
        long count11 = 0;
        long count12 = 0;
        long count13 = 0;
        long count14 = 0;
        long count15 = 0;
        long count16 = 0;
        long count17 = 0;
        long count18 = 0;
        long count19 = 0;
        long count20 = 0;
        long count21 = 0;
        long count22 = 0;
        long count23 = 0;
        long count24 = 0;
        long count25 = 0;
        long count26 = 0;
        long count27 = 0;
        long count28 = 0;
        long count29 = 0;
        long count30 = 0;
        long count31 = 0;
        long count32 = 0;
        long count33 = 0;
        long count34 = 0;
        long count35 = 0;
        long count36 = 0;
        long count37 = 0;
        long count38 = 0;
        long count39 = 0;
        long count40 = 0;
        long count41 = 0;
        long count42 = 0;
        long count43 = 0;
        long count44 = 0;
        long count45 = 0;
        long count46 = 0;
        long count47 = 0;
        long count48 = 0;
        long count49 = 0;
        long count50 = 0;
        long count51 = 0;
        long count52 = 0;
        long count53 = 0;
        long count54 = 0;
        long count55 = 0;
        long count56 = 0;
        long count57 = 0;
        long count58 = 0;
        long count59 = 0;
        long count60 = 0;
        long count61 = 0;
        long count62 = 0;
        long count63 = 0;
        long count64 = 0;
        long count65 = 0;
        long count66 = 0;
        long count67 = 0;
        long count68 = 0;
        long count69 = 0;
    }
    public static void main(String[] args) {
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)5l, (long)4l, (long)7l, (long)9l, (long)6l)))) == (4l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)3l, (long)2l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)4l, (long)2l)))) == (1l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)1l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)1l, (long)3l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)1l)))) == (0l));
    assert(smallestChange((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l)))) == (1l));
    }

}
