@Override protected V provideNextVertex(){
if (this.hasNext()){
        return this.next();
    } else {
        return null;
    }
}