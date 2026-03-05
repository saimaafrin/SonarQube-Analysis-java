class Generated {
    public static int nextPrime(int desiredCapacity){
    int primeCapacity = 0;
        for(int i = 0; i < primeCapacities.length; i++){
            if(primeCapacities[i] >= desiredCapacity){
                primeCapacity = primeCapacities[i];
                break;
            }
        }
        return primeCapacity;
    }
}
