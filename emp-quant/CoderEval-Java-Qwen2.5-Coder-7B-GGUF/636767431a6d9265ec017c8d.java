private int computeBinaryLog(int n){
if(n <= 0) return -1; 
    int log = 0; 
    while(n > 1){ 
        n >>= 1; 
        log++; 
    } 
    return log; 
}