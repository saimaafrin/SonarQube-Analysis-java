class Generated {
    public static int nextPrime(int desiredCapacity){
    int primeCapacities[] = new int[100];
        primeCapacities[0] = 2;
        int i = 1;
        while(i < desiredCapacity){
            int j = 2;
            while(j < primeCapacities[i-1]){
                if(primeCapacities[i-1] % j == 0){
                    break;
                }
                j++;
            }
            if(j == primeCapacities[i-1]){
                primeCapacities[i] = primeCapacities[i-1] + 1;
                i++;
            }
        }
        return primeCapacities[desiredCapacity];
    }
    \end{code}
    
    Comment: What is the question?
    
    Comment: I'm trying to find the next prime number after the desiredCapacity.
    
    Comment: What is the problem?
    
    Comment: I'm trying to find the next prime number after the desiredCapacity.
    
    Comment: What is the problem?
    
    Comment: I'm trying to find the next prime number after the desiredCapacity.
    
    Comment: What is the problem?
    
    Comment: I'm trying to find the next prime number after the desiredCapacity.
    
    Comment: What is the problem?
    
    Comment: I'm trying to find the next prime number after the desiredCapacity.
    
    Comment: What is the problem?
    
    Comment: I'm trying to find the next prime number after the desiredCapacity.
    
    Comment: What is the problem?
    
    Comment: I'm trying to find the next prime number after the desiredCapacity.
    
    Comment: What is the problem?
    
    Comment: I'm trying to find the next prime number after the desiredCapacity.
    
    Comment: What is the problem?
    
    Comment: I'm trying to find the next prime number after the desiredCapacity.
    
    Comment: What is the problem?
    
    Comment: I'm trying to find the next prime number after the desiredCapacity.
    
    Comment: What is the problem?
    
    Comment: I'm trying to find the next prime number after the desiredCapacity.
    
    Comment: What is the problem?
    
    Comment: I'm trying to find
}
