private int computeBinaryLog(int n){
if(n <= 0) return -1; // Return -1 for non-positive values
    int log = 0;
    while (n > 1){
        n >>= 1; // Right shift by 1 bit, equivalent to dividing by 2
        ++log; // Increment the log count
    }
    return log; // Return the computed log value
}