private int computeBinaryLog(int n){
if(n <= 0) return -1; // Return -1 for non-positive values
    int log = 0;
    while (n > 1){
        n >>= 1; // Equivalent to n /= 2, but faster as it uses bitwise operation
        ++log; // Increment log count each time n is halved
    }
    return log; // Return the computed log value
}