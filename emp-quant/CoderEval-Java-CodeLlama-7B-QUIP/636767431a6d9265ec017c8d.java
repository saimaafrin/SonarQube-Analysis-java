private int computeBinaryLog(int n){
int log = 0;
    while(n > 1){
        n = n >> 1;
        log++;
    }
    return log;
}