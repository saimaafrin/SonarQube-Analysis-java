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

        int l = arr.size();
        if (l == 0) return 0;
        int[] cnt = new int[l];
        for (int i = 0; i < l; i++) {
            cnt[i] = 1;
        }
        for (int i = 1; i < l; i++) {
            if (arr.get(i) != arr.get(i - 1)) {
                cnt[i] = 1;
                continue;
            }
            cnt[i] = cnt[i - 1] + 1;
        }
        int[] cnt2 = new int[l];
        int cnt2_idx = 0;
        for (int i = 0; i < l; i++) {
            if (cnt[i] > 0) {
                cnt2[cnt2_idx++] = cnt[i];
            }
        }
        cnt2 = Arrays.copyOf(cnt2, cnt2_idx);
        int res = (l - cnt2.length) / 2;
        if (l % 2 == 0) {
            cnt2_idx = 0;
            for (int i = 0; i < l; i++) {
                if (cnt[i] > 0) {
                    cnt2[cnt2_idx++] = cnt[i];
                }
            }
            cnt2 = Arrays.copyOf(cnt2, cnt2_idx);
            Arrays.sort(cnt2);
            int mid = cnt2.length / 2;
            int min = cnt2[mid];
            res += 1;
            for (int i = 0; i < mid; i++) {
                if (cnt2[i] == min) {
                    res += 1;
                }
            }
        }
        return res;
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
