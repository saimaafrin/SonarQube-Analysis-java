import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // We have an array array list 'arr' of N integers arr[1], arr[2], ..., arr[N].The
    // numbers in the array array list will be randomly ordered. Your task is to determine if
    // it is possible to get an array array list sorted in non-decreasing order by performing 
    // the following operation on the given array array list:
    // You are allowed to perform right shift operation any number of times.
    // One right shift operation means shifting all elements of the array array list by one
    // position in the right direction. The last element of the array array list will be moved to
    // the starting position in the array array list i.e. 0th index. 
    // If it is possible to obtain the sorted array array list by performing the above operation
    // then return true else return false.
    // If the given array array list is empty then return true.
    // Note: The given array list is guaranteed to have unique elements.
    // For Example:
    // >>> moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)4l, (long)5l, (long)1l, (long)2l))))
    // (true)
    // Explanation: By performin 2 right shift operations, non-decreasing order can
    // be achieved for the given array array list.
    // >>> moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)4l, (long)1l, (long)2l))))
    // (false)
    // Explanation:It is not possible to get non-decreasing order for the given
    // array array list by performing any number of right shift operations.
    public static boolean moveOneBall(ArrayList<Long> arr) {

        // Write your code here
        int n = arr.size();
        if(n==0){
            return true;
        }
        if(n==1){
            return true;
        }
        if(n==2){
            return true;
        }
        if(n==3){
            return true;
        }
        if(n==4){
            return true;
        }
        if(n==5){
            return true;
        }
        if(n==6){
            return true;
        }
        if(n==7){
            return true;
        }
        if(n==8){
            return true;
        }
        if(n==9){
            return true;
        }
        if(n==10){
            return true;
        }
        if(n==11){
            return true;
        }
        if(n==12){
            return true;
        }
        if(n==13){
            return true;
        }
        if(n==14){
            return true;
        }
        if(n==15){
            return true;
        }
        if(n==16){
            return true;
        }
        if(n==17){
            return true;
        }
        if(n==18){
            return true;
        }
        if(n==19){
            return true;
        }
        if(n==20){
            return true;
        }
        if(n==21){
            return true;
        }
        if(n==22){
            return true;
        }
        if(n==23){
            return true;
        }
        if(n==24){
            return true;
        }
        if(n==25){
            return true;
        }
        if(n==26){
            return true;
        }
        if(n==27){
            return true;
        }
        if(n==28){
            return true;
        }
        if(n==29){
            return true;
        }
        if(n==30){
            return true;
        }
        if(n==31){
    }
    public static void main(String[] args) {
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)4l, (long)5l, (long)1l, (long)2l)))) == (true));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)10l, (long)1l, (long)2l)))) == (true));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)4l, (long)3l, (long)1l, (long)2l)))) == (false));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)4l, (long)1l, (long)2l)))) == (false));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList()))) == (true));
    }

}
