public static int nextPrime(int desiredCapacity){
int[] primeCapacities = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97}; //array of prime numbers
    for (int i = 0; i < primeCapacities.length; i++){ //iterate through array
        if (primeCapacities[i] >= desiredCapacity){ //if current element is greater than or equal to desired capacity
            return primeCapacities[i]; //return that element
        }
    }
    return -1; //if no prime number is found, return -1
}