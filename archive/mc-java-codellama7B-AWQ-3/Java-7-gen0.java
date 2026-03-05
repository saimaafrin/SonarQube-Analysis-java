import java.util.*;

class Problem {
    /**
     * Given the number of triangles N, determine the maximum number of regions the plane can be divided into.
     *
     * Example:
     * >>> maxRegions(1)
     * 2
     * >>> maxRegions(2)
     * 8
     *
     * @param N the number of triangles
     * @return the maximum number of regions
     */
    public static int maxRegions(int N)  {
        // Calculate the number of regions
        // A region is defined by the number of triangles it contains.
        // Each triangle creates two regions
        // There is no need to consider the triangles that do not create a new region
        // For example, a triangle that creates a region with another triangle is fine.
        // It is not necessary to consider the triangle that does not create a new region
        // in order to create a new region with the other triangle
        // Therefore, if a triangle creates a region with another triangle, the number of regions is increased by 1
        // The maximum number of regions is increased by 2
        // And so on for all triangles.
        // Therefore, the maximum number of regions is the sum of the number of triangles and the number of triangles.
        return N + N;
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert maxRegions(3) == 13;
        assert maxRegions(4) == 21;
        assert maxRegions(5) == 31;
        System.out.println("All tests passed");
    }
}