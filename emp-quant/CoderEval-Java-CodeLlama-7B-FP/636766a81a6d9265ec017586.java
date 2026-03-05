private void pop(final int elements){
for(int i = 0; i < elements; i++){
        if(stack.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        stack.pop();
    }
}