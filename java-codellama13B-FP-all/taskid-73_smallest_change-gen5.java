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

        // Write your code here
        int left = 0;
        int right = arr.size() - 1;
        long min = Long.MAX_VALUE;
        long leftSum = 0;
        long rightSum = 0;
        long arrSum = 0;
        long totalSum = 0;
        ArrayList<Long> leftArray = new ArrayList<Long>();
        ArrayList<Long> rightArray = new ArrayList<Long>();
        for (int i = 0; i < arr.size(); i++) {
            totalSum = totalSum + arr.get(i);
            arrSum = arrSum + arr.get(i);
        }
        long rightSumLeft = 0;
        long leftSumRight = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftSum = leftSum + arr.get(i);
            leftArray.add(arr.get(i));
            rightSum = rightSum + arr.get(arr.size() - 1 - i);
            rightArray.add(arr.get(arr.size() - 1 - i));
            rightSumLeft = rightSumLeft + leftArray.get(i);
            leftSumRight = leftSumRight + rightArray.get(i);
            if (rightSumLeft == rightSum && rightSumLeft != 0) {
                left++;
                rightSumLeft = 0;
            }
            if (leftSumRight == leftSum && leftSumRight != 0) {
                right++;
                leftSumRight = 0;
            }
            if (right - left >= min) {
                continue;
            }
            if (rightSum == leftSum && right - left < min) {
                min = right - left;
            }
        }
        return min;
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
