class Generated {
    public static int nextPrime(int desiredCapacity){
    int[] primeCapacities = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97}; //array of prime numbers
        for (int i = 0; i < primeCapacities.length; i++) {
            if (primeCapacities[i] >= desiredCapacity) {
                return primeCapacities[i]; //returns the first prime number that is greater than or equal to desiredCapacity
            }
        }
        return -1; //if no prime number is found that is greater than or equal to desiredCapacity, returns -1
    }
}
