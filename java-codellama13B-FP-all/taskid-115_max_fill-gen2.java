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

        long times = 0l;
        // get the number of rows and columns in the grid
        long rows = (long)grid.size();
        long cols = (long)grid.get(0).size();
        // get the number of cells that have water
        long num_cells = 0l;
        for(long i=0l; i<rows; i++){
            ArrayList<Long> row = grid.get(Long.valueOf(i).intValue());
            for(long j=0l; j<cols; j++){
                if(row.get(Long.valueOf(j).intValue()) == 1l){
                    num_cells++;
                }
            }
        }
        // if the number of cells is less than the capacity,
        // then we don't need to do anything
        if(num_cells <= capacity){
            return times;
        }
        // if the number of cells is greater than the capacity,
        // then we need to lower the buckets
        else{
            // initialize an empty matrix to hold the cells
            // that can be extracted from each row
            ArrayList<ArrayList<Long>> row_matrix = new ArrayList<ArrayList<Long>>();
            for(long i=0l; i<rows; i++){
                row_matrix.add(new ArrayList<Long>());
    }
    public static void main(String[] args) {
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)1l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l))))), (1l)) == (6l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)1l, (long)1l))))), (2l)) == (5l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l))))), (5l)) == (0l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l))))), (2l)) == (4l));
    assert(maxFill((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l))))), (9l)) == (2l));
    }

}
