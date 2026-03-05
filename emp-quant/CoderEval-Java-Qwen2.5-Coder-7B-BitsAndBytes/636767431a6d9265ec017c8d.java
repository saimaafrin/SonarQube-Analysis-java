class Generated {
    private int computeBinaryLog(int n){
    if(n <= 0) return -1; // Return -1 for non-positive values
        int log = 0;
        while(n > 1){
            n >>= 1; // Equivalent to n /= 2, but faster as it's a bit shift operation
            ++log; // Increment the log count each time we divide by 2
        }
        return log; // The final log value is the answer
    }
}
