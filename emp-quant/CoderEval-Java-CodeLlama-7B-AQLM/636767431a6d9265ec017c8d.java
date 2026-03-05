class Generated {
    private int computeBinaryLog(int n){
    int result = 0;
        while (n > 1){
            n = n >> 1;
            result++;
        }
        return result;
    }
}
