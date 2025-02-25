import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a grid with N rows and N columns (N >= 2) and a positive integer k, 
    // each cell of the grid contains a value. Every integer in the range [1, N * N]
    // inclusive appears exactly once on the cells of the grid.
    // You have to find the minimum path of length k in the grid. You can start
    // from any cell, and in each step you can move to any of the neighbor cells,
    // in other words, you can go to cells which share an edge with you current
    // cell.
    // Please note that a path of length k means visiting exactly k cells (not
    // necessarily distinct).
    // You CANNOT go off the grid.
    // A path A (of length k) is considered less than a path B (of length k) if
    // after making the ordered array lists of the values on the cells that A and B go
    // through (let's call them lst_A and lst_B), lst_A is lexicographically less
    // than lst_B, in other words, there exist an integer index i (1 <= i <= k)
    // such that lst_A[i] < lst_B[i] and for any j (1 <= j < i) we have
    // lst_A[j] = lst_B[j].
    // It is guaranteed that the answer is unique.
    // Return an ordered array list of the values on the cells that the minimum path go through.
    // Examples:    
    // >>> minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)4l, (long)5l, (long)6l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)7l, (long)8l, (long)9l))))), (3l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)1l)))
    // >>> minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)5l, (long)9l, (long)3l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)6l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)7l, (long)8l, (long)2l))))), (1l))
    // (new ArrayList<Long>(Arrays.asList((long)1l)))
    public static ArrayList<Long> minPath(ArrayList<ArrayList<Long>> grid, long k) {

        // Implementation
        // The min path of length k can be created by going through the nodes of a minimum spanning tree of the grid,
        // starting from the first node and ending at the node with value k.
        // The minimum spanning tree of the grid can be created by adding one by one the edges that connect nodes that
        // are not yet connected to the tree, such that the added edges are the ones that have minimum weights.
        // A heap data structure is used to hold the edges, such that the edge with minimum weight is always at the top
        // of the heap.
        // The heap is implemented using an ArrayList of pairs (weight, node_index).
        // To add the edges, we first add all the edges coming out of the first node.
        // Then we take the edge with minimum weight from the heap and add all the edges coming out of the node that the edge
        // goes to.
        // We continue this process until the node with value k is reached.
        // The path is stored in an ArrayList, such that the ith element is the ith node of the path.
        // The ArrayList of pairs is used as a priority queue, such that we can always access the minimum edge.
        // The heap is implemented using an ArrayList of pairs (weight, node_index).
        // To add the edges, we first add
    }
    public static void main(String[] args) {
    assert(minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)4l, (long)5l, (long)6l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)7l, (long)8l, (long)9l))))), (3l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)1l)))));
    assert(minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)5l, (long)9l, (long)3l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)6l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)7l, (long)8l, (long)2l))))), (1l)).equals((new ArrayList<Long>(Arrays.asList((long)1l)))));
    assert(minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)5l, (long)6l, (long)7l, (long)8l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)9l, (long)10l, (long)11l, (long)12l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)13l, (long)14l, (long)15l, (long)16l))))), (4l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)1l, (long)2l)))));
    assert(minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)6l, (long)4l, (long)13l, (long)10l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)5l, (long)7l, (long)12l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)3l, (long)16l, (long)11l, (long)15l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)8l, (long)14l, (long)9l, (long)2l))))), (7l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)10l, (long)1l, (long)10l, (long)1l, (long)10l, (long)1l)))));
    assert(minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)8l, (long)14l, (long)9l, (long)2l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)6l, (long)4l, (long)13l, (long)15l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)5l, (long)7l, (long)1l, (long)12l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)3l, (long)10l, (long)11l, (long)16l))))), (5l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)7l, (long)1l, (long)7l, (long)1l)))));
    assert(minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)11l, (long)8l, (long)7l, (long)2l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)5l, (long)16l, (long)14l, (long)4l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)9l, (long)3l, (long)15l, (long)6l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)12l, (long)13l, (long)10l, (long)1l))))), (9l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)6l, (long)1l, (long)6l, (long)1l, (long)6l, (long)1l, (long)6l, (long)1l)))));
    assert(minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)12l, (long)13l, (long)10l, (long)1l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)9l, (long)3l, (long)15l, (long)6l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)5l, (long)16l, (long)14l, (long)4l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)11l, (long)8l, (long)7l, (long)2l))))), (12l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)6l, (long)1l, (long)6l, (long)1l, (long)6l, (long)1l, (long)6l, (long)1l, (long)6l, (long)1l, (long)6l)))));
    assert(minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)2l, (long)7l, (long)4l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)5l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)6l, (long)8l, (long)9l))))), (8l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)1l, (long)3l, (long)1l, (long)3l, (long)1l, (long)3l)))));
    assert(minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)6l, (long)1l, (long)5l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)3l, (long)8l, (long)9l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)2l, (long)7l, (long)4l))))), (8l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)1l, (long)5l, (long)1l, (long)5l, (long)1l, (long)5l)))));
    assert(minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)2l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)3l, (long)4l))))), (10l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)1l, (long)2l, (long)1l, (long)2l, (long)1l, (long)2l, (long)1l, (long)2l)))));
    assert(minPath((new ArrayList<ArrayList<Long>>(Arrays.asList((ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)1l, (long)3l)), (ArrayList<Long>)new ArrayList<Long>(Arrays.asList((long)3l, (long)2l))))), (10l)).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)1l, (long)3l, (long)1l, (long)3l, (long)1l, (long)3l, (long)1l, (long)3l)))));
    }

}
