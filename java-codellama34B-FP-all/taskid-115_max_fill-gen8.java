import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a rectangular grid of wells. Each row represents a single well,
    // and each 1 in a row represents a single unit of water.
    // Each well has a corresponding bucket that can be used to extract water from it, 
    // and all buckets have the same capacity.
    // Your task is to use the buckets to empty the wells.
    // Output the number of times you need to lower the buckets.
    // Example 1:
    // >>> maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)1l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l))))), (1l))
    // (6l)
    // Example 2:
    // >>> maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)1l, (long)1l))))), (2l))
    // (5l)
    // Example 3:
    // >>> maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l))))), (5l))
    // (0l)
    // Constraints:
    // * all wells have the same length
    // * 1 <= grid.length <= 10^2
    // * 1 <= grid[:,1].length <= 10^2
    // * grid[i][j] -> 0 | 1
    // * 1 <= capacity <= 10
    public static long maxFill(ArrayList<ArrayList<Long>> grid, long capacity) {

        long count = 0;
        long rows = grid.size();
        long columns = grid.get(0).size();
        for(int column = 0; column < columns; column++) {
            long waterInColumn = 0;
            for(int row = 0; row < rows; row++) {
                waterInColumn += grid.get(row).get(column);
            }
            long emptyBuckets = waterInColumn / capacity;
            count += emptyBuckets;
            for(int row = 0; row < emptyBuckets; row++) {
                grid.get(row).set(column, (long)0);
            }
            long remainingWater = waterInColumn % capacity;
            if(remainingWater > 0) {
                grid.get((int)emptyBuckets).set(column, remainingWater);
            }
        }
        return count;
    }
    public static void main(String[] args) {
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)1l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l))))), (1l)) == (6l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)1l, (long)1l))))), (2l)) == (5l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l))))), (5l)) == (0l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l))))), (2l)) == (4l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l))))), (9l)) == (2l));
    }

}
