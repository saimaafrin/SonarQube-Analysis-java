class Generated {
    @Override protected V provideNextVertex(){
    if (this.hasNext()){
            return this.next();
        } else {
            throw new NoSuchElementException("No more vertices to visit.");
        }
    }
}
