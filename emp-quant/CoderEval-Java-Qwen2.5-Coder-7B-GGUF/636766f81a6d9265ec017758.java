class Generated {
    @Override public int hashCode(){
    switch (this.type) {
            case INT: return this.value;
            case STRING: return this.value.hashCode();
            case BOOLEAN: return this.value ? 1 : 0;
            default: throw new RuntimeException("Unknown type");
        }
    }
}
