public static long factorial(int n){
if(n == 0) return 1; //base case
    else return n * factorial(n-1); //recursive call
}