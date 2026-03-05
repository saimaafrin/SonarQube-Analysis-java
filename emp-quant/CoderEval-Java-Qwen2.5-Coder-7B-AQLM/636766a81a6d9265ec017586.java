private void pop(final int elements){
if(elements > this.size()){
        throw new IllegalArgumentException("Cannot pop more elements than are in the stack.");
    }
    for(int i = 0; i < elements; i++){
        this.pop();
    }
}