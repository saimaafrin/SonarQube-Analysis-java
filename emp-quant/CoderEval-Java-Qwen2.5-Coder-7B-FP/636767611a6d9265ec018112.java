class Generated {
    @Override protected V provideNextVertex(){
    if (this.hasNext()){
            return this.next();
        } else {
            throw new NoSuchElementException("No more vertices in the graph.");
        }
    }
}
