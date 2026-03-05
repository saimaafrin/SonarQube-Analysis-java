public static int nullSafeHashCode(long[] array){
if(array == null){
        return 0;
    }
    final int MULTIPLIER = 31; // A prime number used for hashing
    int result = 1; // Initialize the result with a non-zero value

    for (long element : array) {
        result = MULTIPLIER * result + Long.hashCode(element);
    }

    return result;
}