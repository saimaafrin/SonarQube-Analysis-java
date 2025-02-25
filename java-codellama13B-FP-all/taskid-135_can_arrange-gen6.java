import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function which returns the largest index of an element which
    // is not greater than or equal to the element immediately preceding it. If
    // no such element exists then return -1. The given array array list will not contain
    // duplicate values.
    // Examples:
    // >>> canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)3l, (long)5l))))
    // (3l)
    // >>> canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (-1l)
    public static long canArrange(ArrayList<Long> arr) {

        // Write your code here.
        long arr_size = arr.size();
        ArrayList<Long> res = new ArrayList<Long>();
        long res_size = 0;
        long arr_i;
        for(arr_i = 0; arr_i < arr_size; arr_i++)
            res.add(arr.get(arr_i));
        res_size = res.size();
        long index = res_size-1;
        long res_i = res_size-2;
        for(res_i = res_size-2; res_i >= 0; res_i--){
            if(res.get(res_i) <= res.get(res_i+1))
                continue;
            else{
                index = res_i;
                break;
            }
        }
        long arr_i1;
        long arr_i2;
        long temp;
        for(arr_i1 = 0; arr_i1 < arr_size; arr_i1++){
            if(arr_i1 == index)
                continue;
            else{
                temp = arr.get(arr_i1);
                for(arr_i2 = 0; arr_i2 < arr_size; arr_i2++){
                    if(arr_i2 == index)
                        continue;
                    else{
                        if(temp > arr.get(arr_i2)){
                            arr.set(arr_i1, arr.get(arr_i2));
                            arr.set(arr_i2, temp);
                            temp = arr.get(arr_i1);
                        }
                    }
                }
            }
        }
        long arr_last = arr.get(arr_size-1);
        if(arr_last >= res.get(index)){
            for(arr_i1 = 0; arr_i1 < arr_size; arr_i1++){
                if(arr.get(arr_i1) >= arr_last){
                    index = arr_i1;
                    break;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)3l, (long)5l)))) == (3l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)5l)))) == (-1l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9l, (long)10l)))) == (2l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList((long)4l, (long)8l, (long)5l, (long)7l, (long)3l)))) == (4l));
    assert(canArrange((new ArrayList<Long>(Arrays.asList()))) == (-1l));
    }

}
