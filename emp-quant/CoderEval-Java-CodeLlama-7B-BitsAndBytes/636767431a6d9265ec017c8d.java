private int computeBinaryLog(int n){
int result = 0;
    while(n > 0){
        n >>= 1;
        result++;
    }
    return result - 1;
}