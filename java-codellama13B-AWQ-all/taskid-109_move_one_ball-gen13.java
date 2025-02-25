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

        // The problem is a little complicated but if you look at it carefully you can figure out
        // that the goal is to make the array array list sorted in ascending order. Now to make
        // the array array list sorted in ascending order you will have to move the largest element
        // to the first position and so on. Now the question is that how many times you can move the
        // largest element to the first position? Well the answer is that you can move the largest element
        // to the first position a maximum of N times (here N is the length of the array array list). So 
        // if you can move the largest element to the first position a maximum of N times then you will be
        // able to get the sorted array array list. 
        // So to solve the problem you can sort the array array list in descending order and then perform 
        // the following operation on the sorted array array list:
        // For each index i move the element at i-1 position to i position.
        // If the element at i-1 position is already the smallest element then the operation is not performed.
        // After performing the operation on the sorted array array list if you get an array array list
        // sorted in ascending order then the original array array list was sorted in non-decreasing order
        // otherwise it was not sorted in non-decreasing order.
        // As an example if the sorted array array list is {5, 4, 3, 2, 1} then after performing the operation
        // on the sorted array array list you will get the sorted array array list in ascending order. So the
        // original array array list was sorted in non-decreasing order otherwise it was not.
        // So to solve the problem you can sort the array array list in descending order and then perform the
        // operation described above on the sorted array array list. If you get an array array list sorted in 
        // ascending order then the original array array list was sorted in non-decreasing order otherwise it was 
        // not sorted in non-decreasing order.
        // So if you perform the operation on the sorted array array list in descending order then you will get
        // an array array list sorted in ascending order if the original array array list was sorted in non-decreasing
        // order otherwise you will get an array array list not sorted in ascending order. So to solve the problem 
        //
    }
    public static void main(String[] args) {
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)4l, (long)5l, (long)1l, (long)2l)))) == (true));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)10l, (long)1l, (long)2l)))) == (true));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)4l, (long)3l, (long)1l, (long)2l)))) == (false));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)4l, (long)1l, (long)2l)))) == (false));
    assert(moveOneBall((new ArrayList<Long>(Arrays.asList()))) == (true));
    }

}
