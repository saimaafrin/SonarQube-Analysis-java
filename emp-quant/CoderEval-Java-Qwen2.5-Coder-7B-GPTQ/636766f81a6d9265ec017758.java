class Generated {
    @Override public int hashCode(){
    switch(this.type){
            case INT: return this.value;
            case STRING: return this.value.hashCode();
            default: throw new UnsupportedOperationException("Hashcode not implemented for "+this.type);
        }
    }
}
