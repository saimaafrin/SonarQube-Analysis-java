class Generated {
    @Override public int hashCode(){
    return 31 * super.hashCode() + (int) (id ^ (id >>> 32));
    }
}
