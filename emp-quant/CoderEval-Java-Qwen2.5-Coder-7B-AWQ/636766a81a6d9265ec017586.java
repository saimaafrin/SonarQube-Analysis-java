class Generated {
    private void pop(final int elements){
    for(int i = 0; i < elements; ++i){
            if(!isEmpty()){
                this.pop();
            }
        }
    }
}
