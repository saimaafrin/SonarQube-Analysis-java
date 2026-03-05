class Generated {
    @Override protected V provideNextVertex(){
    if (this.hasNextVertex()) {
            return this.nextVertex();
        } else {
            return null;
        }
    }
}
