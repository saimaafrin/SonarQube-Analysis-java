private static Object copyArrayGrow1(final Object array,final Class<?> newArrayComponentType){
int len = Array.getLength(array);
    Object newArray = Array.newInstance(newArrayComponentType, len + 1);
    System.arraycopy(array, 0, newArray, 0, len);
    Array.set(newArray, len, null);
    return newArray;
}