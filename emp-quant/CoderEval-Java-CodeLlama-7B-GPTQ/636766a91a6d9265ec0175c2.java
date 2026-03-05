private int pop(){
if(outputFrameStack.size() == 0){
        throw new RuntimeException("Attempted to pop from an empty output frame stack.");
    }
    return outputFrameStack.pop();
}