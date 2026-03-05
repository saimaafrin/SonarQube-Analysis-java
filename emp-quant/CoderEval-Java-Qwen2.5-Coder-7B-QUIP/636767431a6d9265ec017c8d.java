private int computeBinaryLog(int n){
int log = 0; 
    while (n > 1) { 
        n = n / 2; 
        log = log + 1; 
    } 
    return log; 
}