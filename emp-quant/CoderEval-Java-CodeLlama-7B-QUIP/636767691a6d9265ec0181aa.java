class Generated {
    public static int nullSafeHashCode(long[] array){
    int hashCode = 1;
        for(long element : array){
            hashCode = MULTIPLIER * hashCode + element.hashCode();
        }
        return hashCode;
    }
}
